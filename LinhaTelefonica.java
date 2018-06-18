/**
 * AWT Sample application
 *
 * @author 
 * @version 1.00 18/06/05
 */
import java.util.Calendar;
import java.util.Random;
import java.lang.Math;

public class LinhaTelefonica {
    private String numero;
	private Cliente cliente;
	private Chamada chamadas[] = new Chamada[20];
	
	public LinhaTelefonica(){		
	}
	
	public LinhaTelefonica(String numero, Cliente cliente)
	{
		this.numero = numero;
		this.cliente = cliente;			
	}
	
	public LinhaTelefonica(String numero, Cliente cliente, Chamada chamada)
	{
		this.numero = numero;
		this.cliente = cliente;
		for(int i = 0; i < 20; i++)
		{
			if(chamadas[i] == null)
			{
				chamadas[i] = chamada;
				break;
			}
		}				
	}
	//gets sets 
	
	public String getNumero(){
		return numero;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public Chamada[] getChamadas(){
		return chamadas;
	}
	
	public void setChamadas(Chamada c){
		for(int i = 0; i<20; i++){
			if(this.chamadas[i] == null)
				this.chamadas[i] = c;
		}
	}
	
	
	//outros metodos 
	
	public String toString(){
		String aux = "";
		aux += "Numero: " + this.numero + "\n";
		aux += cliente.toString();
		return aux;
	}
	
	public static LinhaTelefonica criar(){
		String numeroTel;	
		Leitura input = new Leitura();	
		
		System.out.print("Digite numero do telefone: ");
		numeroTel = input.lerString();
		return new LinhaTelefonica(numeroTel,Cliente.criar());
	}
	
	public static LinhaTelefonica pesquisarLinha(String numero, LinhaTelefonica linhas[]){
		
		String aux;
		for(int i = 0; i < 20; i++){
			if(linhas[i] != null){
				aux = linhas[i].getNumero();
				if(aux.equals(numero)){
					return linhas[i];
				}
			}
			
		}
		return null;
	}
	
	public boolean chamar (String destinatario, LinhaTelefonica linhas[]){
		int inicio, fim;
		float custo;
		Calendar c = Calendar.getInstance();
		Calendar f = Calendar.getInstance();
		Random gerador = new Random();	
		String aux;
		
		for(int i = 0; i < 20; i++){
			if(linhas[i] != null){
				aux = linhas[i].getNumero();
				if(destinatario.equals(aux)){
					inicio = c.get(Calendar.MINUTE);
					f.add(Calendar.MINUTE,gerador.nextInt(11));//gera aleatorio entre 0 e 10
					fim = f.get(Calendar.MINUTE);
					custo = (fim-inicio) * Utilitario.custoChamadaVoz;
					
					Voz v = new Voz(gerador.nextInt(200),c,this,custo,f);
					this.setChamadas(v);
					
					System.out.println("\n\nCusto da chamada: " + custo + "\n");
					
					if(this instanceof Pre){
						Saldo s = ((Pre)this).getSaldo();
						float val = s.getValor();
						s.setValor(val - custo);//atualiza o valor dentro de saldo s
						
						((Pre)this).setSaldo(s);
					}
					if(linhas[i] instanceof Pos){
					//FALTA FAZER ISSO		
					
					}
					return true;
				}
			}
		}
		
		return false;
	}
	 
	
	public boolean chamar(String destinatario, LinhaTelefonica linhas[], String conteudo){
		String aux;
		float custo;
		
		Random gerador = new Random();
		
		for(int i = 0; i < 20; i++){
			
			if(linhas[i] != null){
				aux = linhas[i].getNumero();
				if(destinatario.equals(aux)){
					Calendar c = Calendar.getInstance();
					custo = (float)Math.ceil((double)conteudo.length() / Utilitario.comprimentoChamadaTexto) * Utilitario.custoChamadaTexto;
					
					Texto t = new Texto(gerador.nextInt(200),c,this,custo,conteudo);
					this.setChamadas(t);
					
					System.out.println("\n\nCusto da chamada: " + custo + "\n");
					
					if(this instanceof Pre){
						Saldo s = ((Pre)this).getSaldo();
						float val = s.getValor();
						s.setValor(val - custo);//atualiza o valor dentro de saldo s
						
						((Pre)this).setSaldo(s);
					}
					if(linhas[i] instanceof Pos){
					//FALTA FAZER ISSO		
					
					}
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
	
		Leitura input = new Leitura();
		int op = 1;
		LinhaTelefonica LT[] = new LinhaTelefonica[20];
		
		// VARIAVEIS PARA TESTES
		Calendar teste = Calendar.getInstance();
		Endereco e = new Endereco("nicolau",303,"25972","surui","rj");
		Cliente lipe = new Cliente(1,"173052","Phelipe",e);
		Saldo rico = new Saldo(30,teste);
		LT[1] = new Pre("998587722",lipe,rico);
		//
		
		//System.out.println("Digite o custo da chamada de voz: ");
		//Utilitario.custoChamadaVoz = input.lerFloat();
		//System.out.println("Digite o custo da chamada de texto: ");
		//Utilitario.custoChamadaTexto = input.lerFloat();
		while(op != 7)
		{
			System.out.println("1-Cadastrar uma linha telefonica");
			System.out.println("2-Recarregar celular pre pago");
			System.out.println("3-Pagar fatura(NAO FEITO!!)");
			System.out.println("4-Pesquisar linhas cadastradas");
			System.out.println("5-Realizar chamada de voz");
			System.out.println("6-Realizar chamada de texto");
			System.out.println("7-Sair");
			op = input.lerInt();
			
			switch(op){
				case 1: {
					String tipoLinha;
					System.out.println("Desenha criar 'pre' ou 'pos'?(pos nao ta funcionando)");
					tipoLinha = input.lerString();
		
					for(int i = 0; i < 20; i++){
						if(LT[i] == null)
						{
							if(tipoLinha.equals("pre")){
								float valorSaldo;
								Calendar calendar;
								String numeroTel;
							
								System.out.print("Digite o numero do telefone: ");
								numeroTel = input.lerString();
								System.out.print("Digite o saldo possuido: ");
								valorSaldo = input.lerFloat();
								
								calendar = Calendar.getInstance();
								calendar.add(Calendar.DATE,30);
				
								Saldo s = new Saldo(valorSaldo,calendar);
								
								LT[i] = new Pre(numeroTel,Cliente.criar(),s);
								
							}
							else{
								//implementar instancia de pos
								
							}
						}break;
					}
					
					
				}break;
				
				case 2: {
					String aux;
					System.out.println("Digite o numero do celular: ");
					aux = input.lerString();
					int encontrei = 0;
					
					for(int i = 0; i < 20; i++){
						if(LT[i] != null){
							if(aux.equals(LT[i].getNumero())){
								if(LT[i] instanceof Pre)
								{	
									float val;
									System.out.print("Digite o valor da recarga: ");
									val = input.lerFloat();
									
									((Pre)LT[i]).recarregar(val);
									System.out.println("Recarga feita com sucesso!!\n");
									encontrei++;
								}else
									System.out.println("Este numero nao e um pre pago");
								
								break;
							}
						}
					}
					if(encontrei == 0)
						System.out.println("Numero nao encontrado na lista!!\n");
				}break;
				
				case 3: {
					
				}break;
				
				case 4: {
					String numero;
					System.out.print("\nDigite o numero que deseja pesquisar: ");
					numero = input.lerString();
					
					System.out.println("\n" + LinhaTelefonica.pesquisarLinha(numero,LT) + "\n\n");
					
				}break;
				
				case 5: {
					String remet,dest,aux;
					
					System.out.println("Digite o numero de onde esta ligando: ");
					remet = input.lerString();
					System.out.println("Digite o numero do destinatario: ");
					dest = input.lerString();
					
					for(int i = 0; i < 20; i++){
						if(LT[i] != null){
							aux = LT[i].getNumero();
							if(aux.equals(remet)){
								boolean existe;
								existe = LT[i].chamar(dest,LT);
								
								if(existe)
									System.out.println("Chamada realizada com sucesso!!\n\n");
								else
									System.out.println("Destinatario nao existe!!\n\n");
							}
						}
					}
					
				}break;
				
				case 6: {
					String remet,dest,aux, texto;
					
					System.out.println("Digite o numero de onde esta chamando: ");
					remet = input.lerString();
					System.out.println("Digite o numero do destinatario: ");
					dest = input.lerString();
					System.out.println("Digite a mensagem que deseja enviar:");
					texto = input.lerString();
					
					
					for(int i = 0; i < 20; i++){
						if(LT[i] != null){
							aux = LT[i].getNumero();
							if(aux.equals(remet)){
								boolean existe;
								existe = LT[i].chamar(dest,LT,texto);
								
								if(existe)
									System.out.println("Chamada realizada com sucesso!!\n\n");
								else
									System.out.println("Destinatario nao existe!!\n\n");
							}
						}
					}
					
				}break;
				
				case 7: {
					
				}break;
			}
			
		}
		
		
	}
	
}
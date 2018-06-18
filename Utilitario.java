/**
 * @(#)Utilitario.java
 *
 *
 * @author 
 * @version 1.00 2018/6/14
 */

import java.util.Scanner;
import java.util.Calendar;

public class Utilitario {
	
	Scanner input = new Scanner(System.in);
	
	public static int comprimentoChamadaTexto = 144;
	public static int vencimentoRecarga = 90;
	public static float custoChamadaVoz = 10;
	public static float custoChamadaTexto = 15;
	
    public Utilitario() {
    	System.out.print("Digite o custo da chamada de voz: ");
    	custoChamadaVoz = input.nextFloat();
    	System.out.print("Digite o custo da chamada de texto");
    	custoChamadaTexto = input.nextFloat();    	
    }
    
		public boolean recarregar(LinhaTelefonica linhas[], String numero, float valor){
			String procura;
			
			for(int i = 0; i < 20; i++){
				if(linhas[i] != null){
					procura = linhas[i].getNumero();
					if(procura.equals(numero)){
						Calendar calendar;
						Saldo s = ((Pre)linhas[i]).getSaldo();
						calendar = s.getVencimento();
						calendar.add(Calendar.DATE, Utilitario.vencimentoRecarga);
						s.setValor(s.getValor() + valor);
						s.setVencimento(calendar);
						
						((Pre)linhas[i]).setSaldo(s);
						
						return true;
					}
				}
			}
    	
   		
			return false;
    	
    	
    	
		}
    
	
	public String toString(){
		String aux = "";
		aux += "Comprimento chamada texto: " + comprimentoChamadaTexto + "\nVencimento Recarga: " + vencimentoRecarga;
		aux += "\nCusto chamada de voz: " + custoChamadaVoz + "\nCusto chamada de texto: " + custoChamadaTexto;
		
		return aux;
	}
	
}
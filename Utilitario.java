/**
 * @(#)Utilitario.java
 *
 *
 * @author 
 * @version 1.00 2018/6/14
 */

import java.util.Scanner;

public class Utilitario {
	
	Scanner input = new Scanner(System.in);
	
	public static int comprimentoChamadaTexto = 144;
	public static int vencimentoRecarga = 90;
	public static float custoChamadaVoz;
	public static float custoChamadaTexto;
	
    public Utilitario() {
    	System.out.print("Digite o custo da chamada de voz: ");
    	custoChamadaVoz = input.nextFloat();
    	System.out.print("Digite o custo da chamada de texto");
    	custoChamadaTexto = input.nextFloat();    	
    }
    
    public boolean recarregar(LinhaTelefonica linhas[], String numero, float valor){
    	
    	int i = 0;
    	
   		while(linhas[i] != null){
   			if (linhas[i].numero.equals(numero))
   			{
   				linhas[i].saldo.valor += valor;
   				return true;
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
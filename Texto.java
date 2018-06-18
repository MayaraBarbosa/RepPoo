/**
 * @(#)Texto.java
 *
 *
 * @author 
 * @version 1.00 2018/6/7
 */

import java.util.Calendar;

public class Texto extends Chamada{
	
	private String conteudo;

    public Texto(int id,Calendar time, LinhaTelefonica dest, float cust, String conteudo){
    	super(id,time,dest,cust);
    	this.conteudo = conteudo;
    }
    
    public String getConteudo(){
    	return conteudo;
    }
    
    public void setConteudo(String conteudo){
    	this.conteudo = conteudo;
    }
    
   	public String toString(){
	   	String aux = "";
	   	aux += super.toString() + "\nConteudo: " + conteudo;
	   	return aux; 
   	}
    
    
}
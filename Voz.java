/**
 * @(#)Voz.java
 *
 *
 * @author 
 * @version 1.00 2018/6/5
 */

import java.util.Calendar;

public class Voz extends Chamada{
	
	private Calendar termino;
	
    public Voz(int id, Calendar time, LinhaTelefonica dest, float cust, Calendar termino){
    	super(id,time,dest,cust);
    	this.termino = termino;
    }
    
    public void setTermino(Calendar t){
    	this.termino = t;
    }
    
    public Calendar getTermino(){
    	return termino;
    }
    
    public String toString(){
    	String aux = "";
    	aux += super.toString() + "\nTermino: " + termino;
    	return aux;
    }
}
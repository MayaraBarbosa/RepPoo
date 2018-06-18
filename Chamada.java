/**
 * @(#)Chamada.java
 *
 *
 * @author 
 * @version 1.00 2018/6/5
 */

import java.util.Calendar;

public class Chamada {
	
	private int transmissaold;
	private Calendar horario;
	private LinhaTelefonica destinatario;	
	private float custo;
	
	public Chamada (int transmissaoId, Calendar horario, LinhaTelefonica destinatario, float custo){
		this.transmissaold = transmissaoId;
		this.horario = horario;
		this.destinatario = destinatario;
		this.custo = custo;
	}
	
	
	public void setTransmissaold(int id){
		this.transmissaold = id;
	}
	
	public int getTransmissaoId(){
		return transmissaold;
	}
	
	public void setHorario(Calendar horario){
		this.horario = horario;
	}
	
	public Calendar getHorario(){
		return horario;
	}
	
	public void setDestinatario(LinhaTelefonica d){
		this.destinatario = d;
	}
	
	public LinhaTelefonica getDestinatario(){
		return destinatario;
	}	
	
	public void setCusto(float custo){
		this.custo = custo;
	}
	
	public float getCusto(){
		return custo;
	}
	
	public String toString(){
		String aux = "";
		aux += "ID: " + transmissaold + "\nHorario: " + horario.getTime() + "\nDestinatario: " + destinatario;
		aux += "\ncusto: " + custo;
		return aux;
	}	
	
}
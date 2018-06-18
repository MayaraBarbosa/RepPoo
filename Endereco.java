/**
 * @(#)Endereco.java
 *
 *
 * @author 
 * @version 1.00 2018/6/17
 */
 
import java.util.Scanner;

public class Endereco {
	// atributos
	private String rua;	    
	private int numero;
	private String cep;
	private String cidade;
	private String estado;
	
	// metodos
	public Endereco(){
	}
	
	public Endereco(String rua, int numero,String cep, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	
	public String getRua() {
		return this.rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int num) {
		this.numero = num;
	}
		
	public String getCep() {
		return this.cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String toString() {
		String aux = "";
		aux += "rua " + this.rua + ", n" + this.numero + " - cep " + this.cep;
		aux += " - " + this.cidade + " - " + this.estado;
		return aux;
	}

	public static Endereco criar(){	
		String rua,cep,cidade,estado;
		int numeroEnd;
		Leitura input = new Leitura();
		
		System.out.print("Digite o nome da rua: ");
		rua = input.lerString();
		System.out.print("Digite o numero: ");
		numeroEnd = input.lerInt();
		System.out.print("Digite o cep: ");
		cep = input.lerString();
		System.out.print("Digite a cidade: ");
		cidade = input.lerString();
		System.out.print("Digite o estado: ");
		estado = input.lerString();
		
		return new Endereco(rua,numeroEnd,cep,cidade,estado);
	}
}
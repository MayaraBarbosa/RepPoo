
public class Endereco {
	// atributos
	private String rua;	    
	private int numero;
	private String cep;
	private String cidade;
	private String estado;
	
	// metodos
	public Endereco(String rua, int numero,String cep, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado
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
		aux += "rua " + this.rua + ", " + this.numero;
		aux += " - " + this.cidade + " - " + this.estado;
		aux += " - " + this.cep; 
		return aux;
	}

	public Endereco criar(int numero, String cep, String cidade, String estado, String rua){
		String aux = this.numero + " | " + this.cep + " | ";
		aux += this.cidade + " | " + this.estado + " | " + this.rua +  "\n";
		System.out.println(aux);
	}
}
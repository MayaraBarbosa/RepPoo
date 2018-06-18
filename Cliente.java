import java.util.Scanner;

public class Cliente{
	private int clienteId;
	private String cpf;
	private String nome;
	private Endereco endereco;

	public Cliente(){

	}
	
	public Cliente(int clienteid, String cpf, String nome, Endereco endereco) {
		this.cpf = cpf;
		clienteId = clienteid;
		this.nome = nome;
		this.endereco = endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setClienteId(int clienteid) {
		clienteId = clienteid;
	}
	
	public int getClienteId() {
		return clienteId;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco getendereco() {
		return this.endereco;
	}
	
	public String toString() {
		String aux = "";
		aux +=  this.clienteId + " | " + this.nome + " | " + this.cpf + " | ";
		aux += endereco.toString() + " | " + "\n";
		return aux;
	}

	public static Cliente criar(){
		String cpf,nome;
		int id;
		Leitura input = new Leitura();
		
		System.out.print("Digite o ID: ");
		id = input.lerInt();
		System.out.print("Digite o cpf: ");
		cpf = input.lerString();
		System.out.print("Digite o nome: ");
		nome = input.lerString();
	
		return new Cliente(id,cpf,nome,Endereco.criar());
	}
}
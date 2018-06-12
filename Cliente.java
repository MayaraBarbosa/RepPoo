public Cliente{
	private int clienteid;
	private String cpf;
	private String nome;
	private Endereco endereco;

	public Cliente(String cpf, int clienteid,String nome) {
		this.cpf = cpf;
		this.clienteid = clienteid;
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setclienteid(int clienteid) {
		this.clienteid = clienteid;
	}
	
	public int getclienteid() {
		return this.clienteid;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getcpf() {
		return this.cpf;
	}

	public void setendereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco getendereco() {
		return this.endereco;
	}
	
	public String toString() {
		String aux = this.nome + " | " + this.cpf + " | ";
		aux += this.endereco + " | " + this.clienteid + "\n";
		return "Pessoa.: " + aux;
	}

	public Cliente criar(int clienteid, String cpf, String nome, Endereco endereco){
		String aux = this.nome + " | " + this.cpf + " | ";
		aux += this.endereco + " | " + this.clienteid + "\n";
		System.out.println(aux);
	}
}
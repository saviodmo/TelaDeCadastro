package teladecadastro.model;

public class Clientes {


	private String nome;
	private String endereco;
	private int numero;
	
	public Clientes(String nome, String endereco, int numero) {
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	


	
}

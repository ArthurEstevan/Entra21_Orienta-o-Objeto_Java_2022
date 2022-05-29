package br.com.entra21.poo.aula_01.classes_heranca;

public class Pessoa {
	//minha super clase, donde pessoas herdam os atributos que tenham em comum.
	
	private String nome;
	private byte idade;
	private String cpf;
	
	//Construtor vazio 
	//(n�o preciso passar nada na hora da cria��o da classe).
	public Pessoa() {
		super();
	}

	//construtor com par�metros 
	//(preciso passar argumentos na hora de cria��o da classe).
	public Pessoa(String nome, byte idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	//encapsulamento 
	//(serve para proteger meus atributos).
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//m�todo que faz a apresenta��o formal.
	//(preciso estaciar ele na minha classe Main).
	public String apresentacaoFormal() {
		String apresentacaoFormal = "";
		apresentacaoFormal += "Hello! I'm " +getNome()+ ", I'm " +getIdade()+ " years old. I'm Santa Catarina so I'm catarinense.";
		return apresentacaoFormal;
	}
	
}

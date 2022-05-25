package br.com.entra21.orientacao.objeto.aula02.heranca;

public class Pessoa { // essa classe tem atributos que minhas outras classes tem em comum
	
	private String nome;
	private byte idade;
	private String cpf;

	public Pessoa () {
		super();
	}

	public Pessoa(String nome, byte idade, String cpf) { //meu construtor pode ser definido aqui
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() { //meus get podem ser definidos aqui e usados na classe main
		return nome;
	}

	public void setNome(String nome) { // meu set podem ser definidos aqui e usados na classe main
		this.nome = nome;
	}

	public byte getIdade() { //meus get podem ser definidos aqui e usados na classe main
		return idade;
	}

	public void setIdade(byte idade) { // meu set podem ser definidos aqui e usados na classe main
		this.idade = idade;
	}

	public String getCpf() { //meus get podem ser definidos aqui e usados na classe main
		return cpf;
	}

	public void setCpf(String cpf) { // meu set podem ser definidos aqui e usados na classe main
		this.cpf = cpf;
	}

	
	
}

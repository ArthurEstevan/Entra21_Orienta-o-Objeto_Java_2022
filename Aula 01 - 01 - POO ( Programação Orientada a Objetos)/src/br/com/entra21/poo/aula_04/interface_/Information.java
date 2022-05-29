package br.com.entra21.poo.aula_04.interface_;

public class Information {
	
	//minha super clase, doende herdam os atributos que tenham em comum.
	
	//atributos
	private String nome;
	private String nomeCientifico;
	
	//Construtor vazio 
	//(n�o preciso passar nada na hora da cria��o da classe).
	public Information() {
		super();
	}

	//construtor com par�metros.
	//(preciso passar argumentos na hora de cria��o da classe).
	public Information(String nome, String nomeCientifico) {
		super();
		this.nome = nome;
		this.nomeCientifico = nomeCientifico;
	}

	//encapsulamento 
	//(serve para proteger meus atributos).
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	
	//m�todo criado na minha super-Classe Information
	//(pode ser passado para as classes que herdam Information)
	//(pode ser usado ela do jeito que est�, por�m, pode ser modificada tamb�m).
	public void apresentacaoEspecie() {
		System.out.println("Hello, I'm " +getNomeCientifico()+ " but you can call me " +getNome());
	}
	
}

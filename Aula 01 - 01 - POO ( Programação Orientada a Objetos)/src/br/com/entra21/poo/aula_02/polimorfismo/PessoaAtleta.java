package br.com.entra21.poo.aula_02.polimorfismo;

public class PessoaAtleta {
	//minha super clase, doende os meus atletas herdam os atributos que tenham em comum.
	
	//atributos
	private String nome;
	private byte idade;
	private String ambiente;
	private String equipamento;
	private byte qtdWin;
	private byte qtdLoss;
	
	//Construtor vazio 
	//(não preciso passar nada na hora da criação da classe).
	public PessoaAtleta() {

	}

	//construtor com parâmetros.
	//(preciso passar argumentos na hora de criação da classe).
	public PessoaAtleta(String nome, byte idade, String ambiente, String equipamento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.ambiente = ambiente;
		this.equipamento = equipamento;
	}

	//encapsulamento 
	//(serve para proteger meus atributos).
	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

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
	
	//método criado na minha super-Classe PessoaAtleta
	//(pode ser passado para as classes que herdam PessoaAtleta)
	//(pode ser usado ela do jeito que está, porém, pode ser modificada também).
	public byte qtdWin() {
		byte qtdWin = 10;	
		return qtdWin;
	}
	
}

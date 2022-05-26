package br.com.entra21.orientacao.objeto.pratica;

public class Atleta { // essa é minha super-Classe que vai ser de atributos para minhas outras classes
	
	private String nome;
	private byte age;
	private int qtdLoss;
	private int qtdWin;
	
	public Atleta() { // construtor vazio
		super();
	}

	public Atleta(String nome, byte age, int qtdLoss, int qtdWin) { //construtor com parâmetro
		super();			// conector das minhas classes passa os atributos daqui para minhas outras classes
		this.nome = nome;
		this.age = age;
		this.qtdLoss = qtdLoss;
		this.qtdWin = qtdWin;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public int getQtdLoss() {
		return qtdLoss;
	}

	public void setQtdLoss(int qtdLoss) {
		this.qtdLoss = qtdLoss;
	}

	public int getQtdWin() {
		return qtdWin;
	}

	public void setQtdWin(int qtdWin) {
		this.qtdWin = qtdWin;
	}
	
	public void comemorarVitoria() {
		System.out.println(getNome()+ " Receebaaaaaaaa!");
		this.qtdWin++;
	}
	
	public void aprenderComDerota() {
		System.out.println("Vou melhorar na próxima vez");
		this.qtdLoss++;
	}
	

}

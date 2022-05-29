package br.com.entra21.poo.aula_02.polimorfismo;

public class Velocista extends PessoaAtleta implements Atleta{
	//extends PessoaAtleta serve para herda os atributos da minha super-Classe PessoaAtleta.
	//implements Atleta serve para usar os m�todos da minha interface Atleta.
	

	//Construtor vazio 
	//(n�o preciso passar nada na hora da cria��o da classe).
	public Velocista() {
		super();

	}

	//construtor com par�metros da minha super-Classe 
	//(preciso passar argumentos na hora de cria��o da classe).
	public Velocista(String nome, byte idade, String ambiente, String equipamento) {
		super(nome, idade, ambiente, equipamento);
	}
	
	//m�todo que faz a apresenta��o formal.
	//(preciso estaciar ele na minha classe Main).
	public String apresentacaoFormal() {
		String menu = "";
		menu += "Hello, I'm " +super.getNome()+ ", I'm saving " +super.getAmbiente()+ " with my " +super.getEquipamento()+ ".";
		return menu;
	}

	//m�todos chamados da minha interface
	//(posso modificar eles mas preciso ter a mesma sitaxe que � me passado)
	@Override
	public String comemorarVitoria() {
		String menu = "";
		menu += "Eu " +getNome()+ " sou muito grato quem me ajudou chegar onde estou hoje.\n";
		menu += "Queria agradecer minha m�e, meu pai, todos os demais.\n";
		menu += "Por fim RECEBAAAAAAAAAAAAAAAAAAAAA";
		return menu;
	}

	//m�todos chamados da minha interface
	//(posso modificar eles mas preciso ter a mesma sitaxe que � me passado)
	@Override
	public String aprenderComDerrota() {
		String menu = "";
		menu += "Hoje n�o foi meu dia, por�m, sempre existe amanh�s para aqueles que n�o desistem.\n";
		menu += "Obrigada Deus!";
		return menu;
	}

	//m�todo criado na minha super-Classe PessoaAtleta
	//(pode ser passado para as classes que herdam PessoaAtleta)
	//(pode ser usado ela do jeito que est�, por�m, pode ser modificada tamb�m).
	@Override
	public byte qtdWin() {
		return super.qtdWin();
	}
	
	
	
}

package br.com.entra21.poo.aula_02.polimorfismo;

public class Velocista extends PessoaAtleta implements Atleta{
	//extends PessoaAtleta serve para herda os atributos da minha super-Classe PessoaAtleta.
	//implements Atleta serve para usar os métodos da minha interface Atleta.
	

	//Construtor vazio 
	//(não preciso passar nada na hora da criação da classe).
	public Velocista() {
		super();

	}

	//construtor com parâmetros da minha super-Classe 
	//(preciso passar argumentos na hora de criação da classe).
	public Velocista(String nome, byte idade, String ambiente, String equipamento) {
		super(nome, idade, ambiente, equipamento);
	}
	
	//método que faz a apresentação formal.
	//(preciso estaciar ele na minha classe Main).
	public String apresentacaoFormal() {
		String menu = "";
		menu += "Hello, I'm " +super.getNome()+ ", I'm saving " +super.getAmbiente()+ " with my " +super.getEquipamento()+ ".";
		return menu;
	}

	//métodos chamados da minha interface
	//(posso modificar eles mas preciso ter a mesma sitaxe que é me passado)
	@Override
	public String comemorarVitoria() {
		String menu = "";
		menu += "Eu " +getNome()+ " sou muito grato quem me ajudou chegar onde estou hoje.\n";
		menu += "Queria agradecer minha mãe, meu pai, todos os demais.\n";
		menu += "Por fim RECEBAAAAAAAAAAAAAAAAAAAAA";
		return menu;
	}

	//métodos chamados da minha interface
	//(posso modificar eles mas preciso ter a mesma sitaxe que é me passado)
	@Override
	public String aprenderComDerrota() {
		String menu = "";
		menu += "Hoje não foi meu dia, porém, sempre existe amanhãs para aqueles que não desistem.\n";
		menu += "Obrigada Deus!";
		return menu;
	}

	//método criado na minha super-Classe PessoaAtleta
	//(pode ser passado para as classes que herdam PessoaAtleta)
	//(pode ser usado ela do jeito que está, porém, pode ser modificada também).
	@Override
	public byte qtdWin() {
		return super.qtdWin();
	}
	
	
	
}

package br.com.entra21.orientacao.objeto.classes;

public class Professor {
	
	//Atributos static s�o de dominios da Classe e n�o de cada objeto
	//ent�o nenhum objeto dessa classe tem esse tipo de atributo
	//para fazer acesso static basta informar a Classe.institui��o
	
	public static String institui�ao = "Proway";
	
	//Atributos 
	private String nome;
	private byte idade;
	private byte quantidadeAlunos;
	
	public Professor() {
		//construtor vazio n�o inicializa os atributos
	}
	
	public Professor(String novoNome) {
		this.nome=novoNome;
		//construtor com par�metros
		//pode inicializar alguns ou todos os atributos
	}
	
	public Professor(byte novaIdade) {
		this.idade=novaIdade;
		//construtor com par�metros
		//pode inicializar alguns ou todos os atributos
	}
	
	public String getNome() {
		 return this.nome;
	}
	
	public void setNome(String nome) {
		//receber um valor novo la de fora
		this.nome=nome;
	}

	
}

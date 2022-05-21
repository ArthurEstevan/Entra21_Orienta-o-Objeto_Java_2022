package br.com.entra21.orientacao.objeto.classes;

public class Professor {
	
	//Atributos static são de dominios da Classe e não de cada objeto
	//então nenhum objeto dessa classe tem esse tipo de atributo
	//para fazer acesso static basta informar a Classe.instituição
	
	public static String instituiçao = "Proway";
	
	//Atributos 
	private String nome;
	private byte idade;
	private byte quantidadeAlunos;
	
	public Professor() {
		//construtor vazio não inicializa os atributos
	}
	
	public Professor(String novoNome) {
		this.nome=novoNome;
		//construtor com parâmetros
		//pode inicializar alguns ou todos os atributos
	}
	
	public Professor(byte novaIdade) {
		this.idade=novaIdade;
		//construtor com parâmetros
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

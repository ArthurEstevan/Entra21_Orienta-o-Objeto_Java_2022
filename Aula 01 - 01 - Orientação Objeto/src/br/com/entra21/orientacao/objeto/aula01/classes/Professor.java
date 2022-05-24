package br.com.entra21.orientacao.objeto.aula01.classes;

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
		//construtor vazio não inicializa os atributos, apenas serve para dar new na minha classe
	}
	
	public Professor(String novoNome) { // construtor onde eu posso atualizar minhas váriaveis da classe
		this.nome=novoNome;
		//construtor com parâmetros
		//pode inicializar alguns ou todos os atributos
	}
	
	public Professor(byte novaIdade) { // construtor onde eu posso atualizar minhas váriaveis da classe
		this.idade=novaIdade;
		//construtor com parâmetros
		//pode inicializar alguns ou todos os atributos
	}
	
	public String getNome() { //serve para chamar um atributo da minha
		 return this.nome;
	}
	
	public void setNome(String nome) { // define um valor para meus atributos
		//receber um valor novo la de fora
		this.nome=nome;
	}

	
}

package br.com.entra21.orientacao.objeto.aula01.classes;

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
		//construtor vazio n�o inicializa os atributos, apenas serve para dar new na minha classe
	}
	
	public Professor(String novoNome) { // construtor onde eu posso atualizar minhas v�riaveis da classe
		this.nome=novoNome;
		//construtor com par�metros
		//pode inicializar alguns ou todos os atributos
	}
	
	public Professor(byte novaIdade) { // construtor onde eu posso atualizar minhas v�riaveis da classe
		this.idade=novaIdade;
		//construtor com par�metros
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

package br.com.entra21.orientacao.objeto.aula02.heranca;

public class Funcionario extends Pessoa{ //para usar minha classe "Herença" preciso atribuir o "extends NomeDaClasse"

	//removi os atributos reduntantes
	//mantive os especificos

	private String cargoAtual;
	private float salario;

	public Funcionario() { //construtor vazio que meu console vai preencher ou eu na classe main
		
		super(); //Puxa as funções da minha classe de Herança, como se fosse um conector
	}

	//construtor com valor dos meus atributos
	public Funcionario(String nome, byte idade, String cargo, float salario, String cpf) { // gostaria que alguém na clase main argumenta-se esses parâmetros
		super(nome, idade, cpf); //Puxa as funções da minha classe de Herança, como se fosse um conector
		this.cargoAtual = cargo;
		this.salario = salario;
	}

	public String getCargoAtual() {
		return cargoAtual;
	}

	public void setCargoAtual(String cargoAtual) {
		this.cargoAtual = cargoAtual;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	
}

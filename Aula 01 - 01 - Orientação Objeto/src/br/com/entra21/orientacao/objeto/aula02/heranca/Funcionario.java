package br.com.entra21.orientacao.objeto.aula02.heranca;

public class Funcionario extends Pessoa{ //para usar minha classe "Heren�a" preciso atribuir o "extends NomeDaClasse"

	//removi os atributos reduntantes
	//mantive os especificos

	private String cargoAtual;
	private float salario;

	public Funcionario() { //construtor vazio que meu console vai preencher ou eu na classe main
		
		super(); //Puxa as fun��es da minha classe de Heran�a, como se fosse um conector
	}

	//construtor com valor dos meus atributos
	public Funcionario(String nome, byte idade, String cargo, float salario, String cpf) { // gostaria que algu�m na clase main argumenta-se esses par�metros
		super(nome, idade, cpf); //Puxa as fun��es da minha classe de Heran�a, como se fosse um conector
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

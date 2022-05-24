package br.com.entra21.orientacao.objeto.aula02.heranca;

public class Funcionario {

	private String nome;
	private byte idade;
	private String cargoAtual;
	private float salario;

	public Funcionario() { //construtor vazio que meu console vai preencher ou eu na classe main

	}

	//construtor com valor dos meus atributos
	public Funcionario(String nome, byte idade, String cargo, float salario) { // gostaria que alguém na clase main argumenta-se esses parâmetros
		this.nome = nome; 
		this.idade = idade;
		this.cargoAtual = cargo;
		this.salario = salario;
	}

}

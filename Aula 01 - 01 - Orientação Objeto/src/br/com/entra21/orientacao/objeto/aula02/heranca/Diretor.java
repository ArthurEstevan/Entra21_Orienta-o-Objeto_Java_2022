package br.com.entra21.orientacao.objeto.aula02.heranca;

public class Diretor {

	private String nome;
	private byte idade;
	private String cursoAtual;
	private byte quantidaProfessores;

	public Diretor() {

	}

	public Diretor(String nome, byte idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void realizarApresentacao() {
		
		System.out.println("Oi meu nome é " +this.nome+ ", minha idade é " +this.idade);
	}

}

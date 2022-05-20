package br.com.entra21.orientacao.objeto.classes;

import java.util.Scanner;

public class Aluno {
	
	// definir atributos a uma classe aluno e cada objeto da classe tera seus atributos (váriaveis)
	
	public String nome;
	public byte idade;
	public byte quantidadePresença;

	//na declaração só tem acesso e retorno
	
	public Aluno() { // construtor vazio que ao utilizar o (new Aluno) ele é executado
		
		
	}
	
	public byte responderChamada() {
		 Scanner inPut = new Scanner(System.in);
		System.out.println("O aluno " +this.nome+ " está aqui?");
		String resposta = inPut.next();
		if(resposta.equalsIgnoreCase("sim")) {
			this.quantidadePresença++;
			// o this serve para reafirmar que estamos mencionando um atributo do meu objeto
		}
		return this.quantidadePresença;
	}
}



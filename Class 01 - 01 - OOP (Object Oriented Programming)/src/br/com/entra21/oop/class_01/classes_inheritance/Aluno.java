package br.com.entra21.oop.class_01.classes_inheritance;

import java.util.Scanner;

public class Aluno extends Pessoa { //extends Pessoa serve para herda os atributos da minha super-Classe Pessoa.
	
	static Scanner input = new Scanner(System.in);
	
	private byte qtdPresenca;
	private byte qtdPergunta;
	static String resposta;
	
	//Construtor vazio 
	//(n�o preciso passar nada na hora da cria��o da classe).
	public Aluno() {
		super(); 
	}

	//construtor com par�metros da minha super-Classe 
	//(preciso passar argumentos na hora de cria��o da classe).
	public Aluno(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);
	}
	
	//m�todo que faz a chamada
	//(preciso estaciar ele na minha classe Main).
	public void qtdPresenca() {
		System.out.println("Aluno " +getNome()+ " est� presente?");
		resposta = input.next();
		
		if(resposta.equalsIgnoreCase("sim")) {
			this.qtdPresenca++;
		}
	}
	
	//m�todo que faz a chamada
	//(preciso estaciar ele na minha classe Main).
	public void qtdPergunta() {
		System.out.println(getNome()+ " voc� tem alguma pergunta?");
		resposta = input.next();
		
		if(resposta.equalsIgnoreCase("sim")) {
			qtdPergunta++;
			String option;
			System.out.println(menuSobrePerguntas());
			option = input.next().toLowerCase();
			
			switch (option) {
			case "1", "classes":
				System.out.println("Uma classe � um elemento do c�digo Java que utilizamos para representar objetos do mundo real.");
				break;
			
			case "2", "heran�a":
				System.out.println("Na programa��o modular existe uma t�cnica chamada Heran�a que � utlizada para reuso, evistando a repeti��o de um mesmo trecho de c�digo.");
				break;

			case "3", "construtor":
				System.out.println("Construtor serve para inst�ncia minha classe na Main, pode haver par�metros que s�o passado na Main ou vazia.");
				break;

			case "4", "encapsulamento":
				System.out.println("Visto como uma forma de protger o acesso direto aos meus atributos, pensando em refatura��es futuras. ");
				break;

			case "5", "m�todos":
				System.out.println("Funcionam como m�todos padr�o que escrevo na classe Main.");
				break;

			default:
				break;
			}
						
		} else {
			
		}
		
	}
	
	//M�todo chamado dentro da minha pr�pria classe
	//(s� uso aqui dentro da minha classe Aluno).
	public String menuSobrePerguntas() {
		String menuSobrePerguntas="";
		
		menuSobrePerguntas += "1 - Sua d�vida � sobre classes?\n";
		menuSobrePerguntas += "2 - Sua d�vida � sobre heran�a?\n";
		menuSobrePerguntas += "3 - Sua d�vida � sobre construtor?\n";
		menuSobrePerguntas += "4 - Sua d�vida � sobre encapsulamento?\n";
		menuSobrePerguntas += "5 - Sua d�vida � sobre m�todos?";
		
		return menuSobrePerguntas;
	}
	
	
}

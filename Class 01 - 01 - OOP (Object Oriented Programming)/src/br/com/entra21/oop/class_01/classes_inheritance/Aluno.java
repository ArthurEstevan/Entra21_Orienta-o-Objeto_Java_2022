package br.com.entra21.oop.class_01.classes_inheritance;

import java.util.Scanner;

public class Aluno extends Pessoa { //extends Pessoa serve para herda os atributos da minha super-Classe Pessoa.
	
	static Scanner input = new Scanner(System.in);
	
	private byte qtdPresenca;
	private byte qtdPergunta;
	static String resposta;
	
	//Construtor vazio 
	//(não preciso passar nada na hora da criação da classe).
	public Aluno() {
		super(); 
	}

	//construtor com parâmetros da minha super-Classe 
	//(preciso passar argumentos na hora de criação da classe).
	public Aluno(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);
	}
	
	//método que faz a chamada
	//(preciso estaciar ele na minha classe Main).
	public void qtdPresenca() {
		System.out.println("Aluno " +getNome()+ " está presente?");
		resposta = input.next();
		
		if(resposta.equalsIgnoreCase("sim")) {
			this.qtdPresenca++;
		}
	}
	
	//método que faz a chamada
	//(preciso estaciar ele na minha classe Main).
	public void qtdPergunta() {
		System.out.println(getNome()+ " você tem alguma pergunta?");
		resposta = input.next();
		
		if(resposta.equalsIgnoreCase("sim")) {
			qtdPergunta++;
			String option;
			System.out.println(menuSobrePerguntas());
			option = input.next().toLowerCase();
			
			switch (option) {
			case "1", "classes":
				System.out.println("Uma classe é um elemento do código Java que utilizamos para representar objetos do mundo real.");
				break;
			
			case "2", "herança":
				System.out.println("Na programação modular existe uma técnica chamada Herança que é utlizada para reuso, evistando a repetição de um mesmo trecho de código.");
				break;

			case "3", "construtor":
				System.out.println("Construtor serve para instância minha classe na Main, pode haver parâmetros que são passado na Main ou vazia.");
				break;

			case "4", "encapsulamento":
				System.out.println("Visto como uma forma de protger o acesso direto aos meus atributos, pensando em refaturações futuras. ");
				break;

			case "5", "métodos":
				System.out.println("Funcionam como métodos padrão que escrevo na classe Main.");
				break;

			default:
				break;
			}
						
		} else {
			
		}
		
	}
	
	//Método chamado dentro da minha própria classe
	//(só uso aqui dentro da minha classe Aluno).
	public String menuSobrePerguntas() {
		String menuSobrePerguntas="";
		
		menuSobrePerguntas += "1 - Sua dúvida é sobre classes?\n";
		menuSobrePerguntas += "2 - Sua dúvida é sobre herança?\n";
		menuSobrePerguntas += "3 - Sua dúvida é sobre construtor?\n";
		menuSobrePerguntas += "4 - Sua dúvida é sobre encapsulamento?\n";
		menuSobrePerguntas += "5 - Sua dúvida é sobre métodos?";
		
		return menuSobrePerguntas;
	}
	
	
}

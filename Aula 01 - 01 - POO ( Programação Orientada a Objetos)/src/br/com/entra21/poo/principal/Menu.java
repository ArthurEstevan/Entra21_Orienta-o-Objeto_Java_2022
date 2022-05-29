package br.com.entra21.poo.principal;

import java.util.Scanner;

import br.com.entra21.poo.aula_01.classes_heranca.Aluno;
import br.com.entra21.poo.aula_01.classes_heranca.Professor;
import br.com.entra21.poo.aula_02.polimorfismo.Nadador;
import br.com.entra21.poo.aula_02.polimorfismo.Velocista;
import br.com.entra21.poo.aula_03.conceitos_poo.Ponto;
import br.com.entra21.poo.aula_03.conceitos_poo.Reta;
import br.com.entra21.poo.aula_04.interface_.Animal;
import br.com.entra21.poo.aula_04.interface_.Extraterrestre;
import br.com.entra21.poo.aula_04.interface_.Humano;
import br.com.entra21.poo.aula_04.interface_.Planta;

public class Menu {

	static Scanner input = new Scanner(System.in);

	public static void menu() {

		byte option;

		do {
			System.out.println();
			System.out.println(concatenacaoMenu());
			option = input.nextByte();

			switch (option) {
			case 1:
				learningClassesHeranca();
				break;

			case 2:
				learningPolimorfismo();
				break;

			case 3:
				conceitosDePoo();
				break;

			case 4:
				learningInterface();
				break;

			case 5:

				break;

			default:
				break;
			}

		} while (option != 0);
	}

	// -------------START MENU-------------//
	private static String concatenacaoMenu() {

		String menu = "";

		menu += "Choose Option\n";
		menu += "0 - Sair\n";
		menu += "1 - Aprender Classes/Herança\n";
		menu += "2 - Aprender Polimorfismo with Interface\n";
		menu += "3 - Aprender Conceitos POO (Programação Orientada a Objetos\n";
		menu += "4 - Aprender Interface\n";
		menu += "5 - Revisão Aulas da Semana";
		return menu;
	}

	// -------------LEARNING CLASS/HERANÇA-------------//
	public static void learningClassesHeranca() {

		Aluno aluno = new Aluno("Arthur", (byte) 19, "555.666.777-20");
		
		System.out.println(aluno.apresentacaoFormal());
		aluno.qtdPresenca();
		aluno.qtdPergunta();

		// aluno.nome("Arthur");
		// Assim eu passaria "nome" para minha "String nome"
		// (porém definimos private então só consigo alterar com "setNome" e visuzlizar
		// com "getNome")
		// System.out.println("My name is " +aluno.getNome());

		System.out.println("-------------------------------------------------------------------------------------------------");

		byte[] qtdAluno = new byte[10];

		Professor professor = new Professor("Rubem Oliota", (byte) 33, "555.666.777-21", "Java", qtdAluno);
		
		System.out.println(professor.apresentacaoFormal());

	}

	// -------------POLIMORFISMO WITH INTERFACE-------------//
	public static void learningPolimorfismo() {

		Velocista velocista = new Velocista("Barry Allen", (byte) 23, "New York", "superpower");
		
		System.out.println(velocista.apresentacaoFormal());
		System.out.println(velocista.comemorarVitoria());
		System.out.println(velocista.aprenderComDerrota());
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		Nadador nadador = new Nadador("Aquaman", (byte) 42, "Ocean Atlantic", "superpower");
		
		System.out.println(nadador.apresentacaoFormal());
		System.out.println(nadador.comemorarVitoria());
		System.out.println(nadador.aprenderComDerrota());

	}

	// -------------CONCEITOS POO-------------//
	public static void conceitosDePoo() {
		
		Ponto pontoAlto = new Ponto(30f, 1000f);
		
		Ponto esquerdaBaixo = new Ponto(-30, -1000);
		//minhas classe Ponto recebe dois atributos
		
		Reta reta = new Reta(pontoAlto, esquerdaBaixo);
		//minhas classe Reta recebe dois atributos, com valor de duas variaveis
		
		System.out.println("Meu ponto Alto fica nas cordenadas " +reta.getPontoA());
		System.out.println("Meu ponto esquerda Baixo fica nas cordenadas " +reta.getPontoB());
	}

	// -------------CONCEITOS POO-------------//
	public static void learningInterface() {
		
		Planta planta = new Planta("Maracujá", "Passiflora edulis");
		planta.apresentacaoEspecie();
		planta.meioAmbiente("nature");
		planta.modoDeLocomover("move");
		planta.alimetacao("photokinesis");
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		Humano humano = new Humano("Human", "Homo sapiens");
		humano.apresentacaoEspecie();
		humano.meioAmbiente("city");
		humano.modoDeLocomover("on foot");
		humano.alimetacao("fruit, vegetables and meat");

		System.out.println("-------------------------------------------------------------------------------------------------");
		
		Animal animal = new Animal("Bengal tiger", "Panthera tigris tigris");
		animal.apresentacaoEspecie();
		animal.meioAmbiente("nature");
		animal.modoDeLocomover("on foot");
		animal.alimetacao("meat");

		System.out.println("-------------------------------------------------------------------------------------------------");
		
		Extraterrestre extraterrestre = new Extraterrestre("Alien", "Extraterrestrial");
		extraterrestre.apresentacaoEspecie();
		extraterrestre.meioAmbiente("space");
		extraterrestre.modoDeLocomover("not identified");
		extraterrestre.alimetacao("not identified");

	}
	
}

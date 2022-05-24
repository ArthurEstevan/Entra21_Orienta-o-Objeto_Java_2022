package br.com.entra21.orientacao.objeto;

import java.util.Scanner; //importando minha classe

import br.com.entra21.orientacao.objeto.aula01.classes.Aluno; //importando minha classe

import br.com.entra21.orientacao.objeto.aula01.classes.Professor; //importando minha classe

import br.com.entra21.orientacao.objeto.aula02.heranca.Diretor; //importando minha classe

public class Main {

	static Scanner inPut = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;

		do {
			System.out.println("Choose Option");
			System.out.println("0 - Sair");
			System.out.println("01 - Aprender Classes");
			System.out.println("02 - Aprender Herança");

			opcao = inPut.nextByte();

			switch (opcao) {
			case 0:

				break;

			case 1:
				aprenderClassesObjetos();
				break;

			case 2:

				break;

			default:
				System.out.println("Choose option correct");
				break;
			}

		} while (opcao != 0);

	}

	public static void aprenderClassesObjetos() {
		
		//--------------------------Criação da Classe Diretor--------------------------//
		
		Diretor diretor01 = new Diretor();
		
		diretor01.realizarApresentacao();
		
		Diretor diretor02 = new Diretor();
		
		diretor02.realizarApresentacao();
		
		Diretor diretor03 = new Diretor("Arthur", (byte) 20);
		
		diretor03.realizarApresentacao();
		

		//--------------------------Criação da Classe Professor--------------------------//
		
		Professor professorJava = new Professor("nome"); //criação do meu objeto com os recursos da classe

		Professor nomeDaProfessora = new Professor("Isabel"); //passando uma string para o método da classe

		Professor idadeDaProfessora = new Professor((byte) 20); //passando um byte para o método da classe

		System.out.println("Nome dela = " + nomeDaProfessora.getNome()); //usando um de um método get

		nomeDaProfessora.setNome("Isabelle 2"); //definindo um nome para um método usando o set

		System.out.println("agora nome dela é = " + nomeDaProfessora.getNome()); //mostrando como ficou depois de definir o nome com set

		
										
		//--------------------------Criação da Classe Aluno--------------------------//
		
		Aluno alunoTeste = new Aluno(); // criando meu objeto da classe Aluno

		alunoTeste.nome = "Arthur"; // atribuindo valor a meu atributo da classe
		alunoTeste.idade = 33; // atribuindo valor a meu atributo da classe

		System.out.println("Qual nome do aluno novato?"); // usuario definindo valor para meus atributos "String nome"
		alunoTeste.nome=inPut.next();
		
		System.out.println("Qual idade do aluno novato?"); // usuario definindo valor para meus atributos "byte idade"
		alunoTeste.idade=inPut.nextByte();
		
		System.out.println("Bem vindo "+alunoTeste.nome); // mostrando nome da minha "String nome" definida pelo aluno
		
		alunoTeste.responderChamada(); //chamando um método da minha classe aluno
		alunoTeste.responderChamada();

	}

}

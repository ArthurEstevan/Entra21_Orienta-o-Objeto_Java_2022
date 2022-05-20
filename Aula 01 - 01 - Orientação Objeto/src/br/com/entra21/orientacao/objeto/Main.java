package br.com.entra21.orientacao.objeto;

import java.util.Scanner;

import br.com.entra21.orientacao.objeto.classes.Aluno;


public class Main {

	static Scanner inPut = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Aluno alunoTeste = new Aluno();
		
		Aluno outroAluno = new Aluno();
		
		Aluno novatoAluno = new Aluno();

		Aluno alunoObjeto = new Aluno();
		

		alunoObjeto.idade=18;
		
		alunoTeste.nome="Arthur";
		alunoTeste.idade=33;
		
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		
//		
//		outroAluno.idade=18;
//		outroAluno.nome="Visitante";
//		
//		System.out.println("Qual nome do aluno novato?");
//		novatoAluno.nome=inPut.next();
//		
//		System.out.println("Qual idade do aluno novato?");
//		novatoAluno.idade=inPut.nextByte();
//		
//		System.out.println("Bem vindo "+novatoAluno.nome);
		
		
		
		
	}

}

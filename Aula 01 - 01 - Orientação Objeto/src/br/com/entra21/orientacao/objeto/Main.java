package br.com.entra21.orientacao.objeto;

import java.util.Scanner;

import br.com.entra21.orientacao.objeto.classes.Aluno;
import br.com.entra21.orientacao.objeto.classes.Professor;


public class Main {

	static Scanner inPut = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Professor professorJava = new Professor();
		
		Professor professoraIsabel = new Professor("Isabel");
		
		Professor professoraIsabelIdade = new Professor( (byte) 20);
		
		System.out.println("Nome dela = " +professoraIsabel.getNome());
		
		professoraIsabel.setNome("Isabelle 2");
		
		System.out.println("agora nome dela é = " +professoraIsabel.getNome());
		
		Aluno alunoTeste = new Aluno();
		
		Aluno outroAluno = new Aluno();
		
		Aluno novatoAluno = new Aluno();

		Aluno alunoObjeto = new Aluno();
		

		alunoObjeto.idade=18;
		
		alunoTeste.nome="Arthur";
		alunoTeste.idade=33;
		
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

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

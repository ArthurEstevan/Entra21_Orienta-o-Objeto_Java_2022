package br.com.entra21.orientacao.objeto.aula05.revisao;

import java.util.Scanner;

public class Revisao {

	static Scanner in = new Scanner(System.in);
	static Professor oliota;

	public static void revisar() {

		byte option;
		
		gerarDados();

		do {

			System.out.println("Escolha uma opção");
			System.out.println("0 - SAIR ");
			System.out.println("1 - REVISAR");
			option = in.nextByte();

			switch (option) {
			case 0:
				System.out.println("bye bye");
				break;

			case 1:

				break;

			default:
				System.out.println("select correct option");
				break;
			}

		} while (option != 0);

	}
	
	private static void gerarDados() {
		
		oliota = new Professor("Oliota", (byte) 33, "123.838.421-20");
	}

}

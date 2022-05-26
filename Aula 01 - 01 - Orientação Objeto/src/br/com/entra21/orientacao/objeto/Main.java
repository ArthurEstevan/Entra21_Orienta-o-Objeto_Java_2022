package br.com.entra21.orientacao.objeto;

import java.util.Scanner; //importando minha classe

import br.com.entra21.orientacao.objeto.aula01.classes.Aluno; //importando minha classe

import br.com.entra21.orientacao.objeto.aula01.classes.Professor; //importando minha classe

import br.com.entra21.orientacao.objeto.aula02.heranca.Diretor; //importando minha classe
import br.com.entra21.orientacao.objeto.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objeto.pratica.Atleta;
import br.com.entra21.orientacao.objeto.pratica.Nadador;
import br.com.entra21.orientacao.objeto.pratica.Velocista;

public class Main {

	static Scanner inPut = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;

		do {
			System.out.println("Choose Option");
			System.out.println("0 - Sair");
			System.out.println("01 - Aprender Classes");
			System.out.println("02 - Aprender Herança");
			System.out.println("03 - Aprender Polimorfismo");

			opcao = inPut.nextByte();

			switch (opcao) {
			case 0:

				break;

			case 1:
				aprenderClassesObjetos();
				break;

			case 2:
				aprenderClassesOHerança();
				break;

			case 3:
				aprenderClassesPolimorfismo();
				break;

			default:
				System.out.println("Choose option correct");
				break;
			}

		} while (opcao != 0);


	}

	// --------------Aprendendo Polimorfismo--------------//

	public static void aprenderClassesPolimorfismo() {

		// padrão de polimorfismo para comportamentos(métodos) é herdar.

		// segunda forma do polimorfismo é fazer completamente os
		// comportamentos(métodos) do meu jeito.

		// terceira forma do polimorfismo é aproveitar a minha herança e fazer um
		// diferencial.

		Atleta cr7 = new Atleta();

		cr7.setNome("Cristiano Ronaldo");
		cr7.comemorarVitoria();

		System.out.println("----------------------------");

		Nadador michaelPhelps = new Nadador();

		michaelPhelps.setNome("Michael Phelps");

		Nadador sergioMichael = new Nadador("Sérgio Michael", (byte) 39, 23, 40, "Piscína", "Sunga e Touca");

		System.out.println("Quer escrever uma frase?");
		String frase = inPut.nextLine();

		sergioMichael.comemorarVitoria(frase); // procura primeiro na minha classe Nadador, se não tiver busca na
												// herança.

		michaelPhelps.comemorarVitoria();

		System.out.println("----------------------------");

		Velocista usainBolt = new Velocista();

		usainBolt.setNome("Usain Bolt");

		usainBolt.comemorarVitoria();

		System.out.println("----------------------------");

	}

	// --------------Aprendendo Herança--------------//
	public static void aprenderClassesOHerança() {

		// --------------------------Criação da Classe
		// Funcionario--------------------------//

		Funcionario funcionario01 = new Funcionario(); // criação do meu objeto com os recursos da classe
		funcionario01.setIdade((byte) 18);
		funcionario01.setNome("Arthur");
		funcionario01.setCargoAtual("Auxiliar de Modelagem"); // definindo meus atributos para meu construtor vazio com
																// get
		funcionario01.setSalario(1500f);

		// usando meus atributos com get
		System.out.println("Hello, my name is " + funcionario01.getNome() + ". I'm " + funcionario01.getIdade());

		Funcionario funcionario02 = new Funcionario("Arthur", (byte) 18, "Professor", 1500f, "055.055.055-20"); // passando
																												// valores
																												// para
																												// meus
																												// atributos,
																												// que
																												// foram
																												// solicitados
																												// dentro
																												// do
																												// construtor
		funcionario02.setCpf("055.055.055-10");

		// --------------------------Criação da Classe
		// Diretor--------------------------//

		Diretor diretor01 = new Diretor(); // criação do meu objeto com os recursos da classe

		diretor01.realizarApresentacao(); // chamando um método da classe

		Diretor diretor02 = new Diretor();

		diretor02.realizarApresentacao();

		Diretor diretor03 = new Diretor("Arthur", (byte) 20, "055.999.888-29", "Inglês", (byte) 20);

		diretor03.realizarApresentacao();

	}

	// --------------Aprendendo P00--------------//

	public static void aprenderClassesObjetos() {

		// --------------------------Criação da Classe
		// Professor--------------------------//

		Professor professorJava = new Professor("nome"); // criação do meu objeto com os recursos da classe

		Professor nomeDaProfessora = new Professor("Isabel"); // passando uma string para o método da classe

		Professor idadeDaProfessora = new Professor((byte) 20); // passando um byte para o método da classe

		System.out.println("Nome dela = " + nomeDaProfessora.getNome()); // usando um de um método get

		nomeDaProfessora.setNome("Isabelle 2"); // definindo um nome para um método usando o set

		System.out.println("agora nome dela é = " + nomeDaProfessora.getNome()); // mostrando como ficou depois de
																					// definir o nome com set

		// --------------------------Criação da Classe Aluno--------------------------//

		Aluno alunoTeste = new Aluno(); // criando meu objeto da classe Aluno

		alunoTeste.nome = "Arthur"; // atribuindo valor a meu atributo da classe
		alunoTeste.idade = 33; // atribuindo valor a meu atributo da classe

		System.out.println("Qual nome do aluno novato?"); // usuario definindo valor para meus atributos "String nome"
		alunoTeste.nome = inPut.next();

		System.out.println("Qual idade do aluno novato?"); // usuario definindo valor para meus atributos "byte idade"
		alunoTeste.idade = inPut.nextByte();

		System.out.println("Bem vindo " + alunoTeste.nome); // mostrando nome da minha "String nome" definida pelo aluno

		alunoTeste.responderChamada(); // chamando um método da minha classe aluno
		alunoTeste.responderChamada();

	}

}

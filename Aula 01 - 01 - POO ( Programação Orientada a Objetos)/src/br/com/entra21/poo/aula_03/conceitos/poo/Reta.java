package br.com.entra21.poo.aula_03.conceitos.poo;

public class Reta {
	
	private Ponto pontoA; //uma reta tem 1 ou mais pontos (1..*)
	private Ponto pontoB; //uma reta tem 1 ou mais pontos (1..*)

	//criando a variavel "Ponto pontoA" consigo ter uma várivel com dois valore
	//(conceito de vetor)
	
	//Construtor vazio 
	//(não preciso passar nada na hora da criação da classe).
	public Reta() {
	}

	//construtor com parâmetros
	//(preciso passar argumentos na hora de criação da classe).
	public Reta(Ponto pontoA, Ponto pontoB) {
		this.pontoA = pontoA;
		this.pontoB = pontoB;
	}

	//encapsulamento 
	//(serve para proteger meus atributos).
	public Ponto getPontoA() {
		return pontoA;
	}

	public void setPontoA(Ponto pontoA) {
		this.pontoA = pontoA;
	}

	public Ponto getPontoB() {
		return pontoB;
	}

	public void setPontoB(Ponto pontoB) {
		this.pontoB = pontoB;
	}
	
}

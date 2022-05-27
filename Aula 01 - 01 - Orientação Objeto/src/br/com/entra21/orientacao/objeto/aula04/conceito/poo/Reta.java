package br.com.entra21.orientacao.objeto.aula04.conceito.poo;

public class Reta {
	
	// ESSES ATRIBUTOS NÃO PRECISO IMPORTAR POR ESTAR NO MESMO PACOTE APENAS POSSO USAR
	private Ponto PontoA;
	private Ponto pontoB;	// Um objeto da classe Ponto que me da acesso a um atributo, que tem duas variaveis.
	
	public Reta() {
		
	}

	public Reta(Ponto pontoA, Ponto pontoB) {
		super();
		PontoA = pontoA;
		this.pontoB = pontoB;
	}

	public Ponto getPontoA() {
		return PontoA;
	}

	public void setPontoA(Ponto pontoA) {
		PontoA = pontoA;
	}

	public Ponto getPontoB() {
		return pontoB;
	}

	public void setPontoB(Ponto pontoB) {
		this.pontoB = pontoB;
	}
	
}

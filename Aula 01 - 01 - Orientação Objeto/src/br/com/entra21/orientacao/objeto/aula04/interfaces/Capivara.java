package br.com.entra21.orientacao.objeto.aula04.interfaces;

public class Capivara implements Individuo {

	@Override
	public void alimentar(String alimento) {
		System.out.println("A capivara come mato " +alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("capivara anda para frente");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("....");
	}
	
	

}

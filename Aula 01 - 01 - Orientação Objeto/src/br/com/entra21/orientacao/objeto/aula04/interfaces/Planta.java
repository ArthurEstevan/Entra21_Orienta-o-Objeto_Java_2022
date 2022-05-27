package br.com.entra21.orientacao.objeto.aula04.interfaces;

public class Planta implements Individuo{
	
	String nomeCientifico;
	
	
	public Planta() {
		
	}

	public Planta(String nomeCientifico) {
		super();
		this.nomeCientifico = nomeCientifico;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println("N�o me alimento apenas fa�o fotossisentese, " +alimento+ " n�o me serve.");
		
	}

	@Override
	public void locomover() {
		System.out.println("N�o preciso me locomover");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("Planta n�o fala ela � muda");
		
	}
	
	

}

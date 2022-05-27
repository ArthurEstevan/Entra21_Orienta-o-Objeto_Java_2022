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
		System.out.println("Não me alimento apenas faço fotossisentese, " +alimento+ " não me serve.");
		
	}

	@Override
	public void locomover() {
		System.out.println("Não preciso me locomover");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("Planta não fala ela é muda");
		
	}
	
	

}

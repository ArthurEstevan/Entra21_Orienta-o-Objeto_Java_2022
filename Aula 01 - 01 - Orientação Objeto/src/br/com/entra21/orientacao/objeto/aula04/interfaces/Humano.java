package br.com.entra21.orientacao.objeto.aula04.interfaces;

import br.com.entra21.orientacao.objeto.aula02.heranca.Pessoa;

public class Humano extends Pessoa implements Individuo{

	public Humano() {
		
	}
	
	public void apresentarSe() {
		System.out.println("My name is " +getNome());
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(getNome() + " sou carnívoro, mas como também " +alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println(getNome() + " depois que inveitei a roda tudo melhorou.");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("Meus antepassados me passaram tudo que eu sei.");
		
	}
	
}

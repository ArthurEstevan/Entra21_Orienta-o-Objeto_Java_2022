package br.com.entra21.poo.aula_04.interface_;

public class Extraterrestre extends Information implements Evolucao {
	//extends Information serve para herda os atributos da minha super-Classe Information.
	//implements Evolucao serve para usar os m�todos da minha interface Evolucao.
	
	//Construtor vazio 
	//(n�o preciso passar nada na hora da cria��o da classe).
	public Extraterrestre() {
		super();
	}

	//construtor com par�metros da minha super-Classe 
	//(preciso passar argumentos na hora de cria��o da classe).
	public Extraterrestre(String nome, String nomeCientifico) {
		super(nome, nomeCientifico);
	}
	
	//m�todo criado na minha super-Classe Information
	//(pode ser passado para as classes que herdam Information)
	//(pode ser usado ela do jeito que est�, por�m, pode ser modificada tamb�m).
	@Override
	public void apresentacaoEspecie() {
		super.apresentacaoEspecie();
	}

	//m�todos chamados da minha interface
	//(posso modificar eles mas preciso ter a mesma sitaxe que � me passado)
	@Override
	public void meioAmbiente(String ambiente) {	
		System.out.println("I'm a alien and I live in " +ambiente);
	}

	@Override
	public void modoDeLocomover(String locomocao) {
		System.out.println("I'm a alien and I move " +locomocao);
	}

	@Override
	public void alimetacao(String alimento) {
		System.out.println("I'm a alien and I eat " +alimento);
	}

}

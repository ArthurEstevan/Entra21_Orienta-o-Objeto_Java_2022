package br.com.entra21.poo.aula_03.conceitos_poo;

public class Ponto {
	
	private float cordenadaY; //um ponto não precisa pertecer a reta (0..*)
	private float cordenadaX; //um ponto não precisa pertecer a reta (0..*)

	//minha classe "Ponto" segue os mesmo padrões de classe.
	//só pode ser chamada em outras classes sem extends se tiver no mesmo pacote
	
	//Construtor vazio 
	//(não preciso passar nada na hora da criação da classe).
	public Ponto() {
		super();
	}

	//construtor com parâmetros
	//(preciso passar argumentos na hora de criação da classe).
	public Ponto(float cordenadaY, float cordenadaX) {
		super();
		this.cordenadaY = cordenadaY;
		this.cordenadaX = cordenadaX;
	}

	//encapsulamento 
	//(serve para proteger meus atributos).
	public float getCordenadaY() {
		return cordenadaY;
	}

	public void setCordenadaY(float cordenadaY) {
		this.cordenadaY = cordenadaY;
	}

	public float getCordenadaX() {
		return cordenadaX;
	}

	public void setCordenadaX(float cordenadaX) {
		this.cordenadaX = cordenadaX;
	}
	
}

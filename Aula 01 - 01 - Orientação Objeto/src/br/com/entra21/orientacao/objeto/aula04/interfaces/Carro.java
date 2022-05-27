package br.com.entra21.orientacao.objeto.aula04.interfaces;

public class Carro implements Automovel {

	private byte gasolina;
	private String marca;

	public Carro() {

	}

	public Carro(byte gasolina) {
		this.gasolina = gasolina;
	}

	public byte getGasolina() {
		return gasolina;
	}

	public void setGasolina(byte gasolina) {
		this.gasolina = gasolina;
	}

	@Override
	public boolean carroAcelerar() {
		if (gasolina > 10) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean carroFreiar(String wanna) {
		if (wanna.equals("sim")) {
			System.out.println("freiando");
			return true;
		} else {
			System.out.println("Bateu");
			return false;
		}
	}

	@Override
	public void carroMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}

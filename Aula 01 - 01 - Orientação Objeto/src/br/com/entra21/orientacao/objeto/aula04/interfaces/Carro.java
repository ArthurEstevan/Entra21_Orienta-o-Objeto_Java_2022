package br.com.entra21.orientacao.objeto.aula04.interfaces;

public class Carro implements Automovel {

	private float saldo;
	private float gasolina;
	private String marca;

	public Carro() {

	}

	public Carro(float dinheiro, byte gasolina, String marca) {
		this.saldo = dinheiro;
		this.gasolina = gasolina;
		this.marca = marca;
	}

	public float getDinheiro() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getGasolina() {
		return gasolina;
	}

	public void setGasolina(float gasolina) {
		this.gasolina = gasolina;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public boolean carroAcelerar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean carroFreiar(String quero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void carroMarca(String marca) {
		// TODO Auto-generated method stub
		
	}

}

package br.com.entra21.orientacao.objeto.aula02.heranca;

public class Diretor extends Pessoa {

	//removi os atributos reduntantes
	//mantive os especificos
	
	private String cursoAtual;
	private byte quantidaProfessores;

	public Diretor() {
		super();

	}

	public Diretor(String nome, byte idade, String cpf, String cursoAtual, byte quantidaProfessores ) {
		super(nome, idade, cpf);
		this.cursoAtual = cursoAtual;
		this.quantidaProfessores = quantidaProfessores;
	}

	public void realizarApresentacao() {
		System.out.println("Oi meu nome é " + getNome() + ", minha idade é " + getIdade());
	}

	public String getCursoAtual() {
		return cursoAtual;
	}

	public void setCursoAtual(String cursoAtual) {
		this.cursoAtual = cursoAtual;
	}

	public byte getQuantidaProfessores() {
		return quantidaProfessores;
	}

	public void setQuantidaProfessores(byte quantidaProfessores) {
		this.quantidaProfessores = quantidaProfessores;
	}


}

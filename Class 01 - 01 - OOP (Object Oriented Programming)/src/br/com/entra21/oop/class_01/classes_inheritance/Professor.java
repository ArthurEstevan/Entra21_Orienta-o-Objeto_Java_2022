package br.com.entra21.oop.class_01.classes_inheritance;

public class Professor extends Pessoa {
	
	private String disciplinaAtual;
	private byte qtdAlunos[];
	private String aprensetacaoFormal;
	
	public Professor() {
		super();
	}
	
	public Professor(String nome, byte idade, String cpf, String disciplinaAtual, byte[] qtdAlunos) {
		super(nome, idade, cpf);
		this.disciplinaAtual = disciplinaAtual;
		this.qtdAlunos = qtdAlunos;
	}

	public String getDisciplinaAtual() {
		return disciplinaAtual;
	}

	public void setDisciplinaAtual(String disciplinaAtual) {
		this.disciplinaAtual = disciplinaAtual;
	}

	public byte[] getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(byte[] qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
		
}

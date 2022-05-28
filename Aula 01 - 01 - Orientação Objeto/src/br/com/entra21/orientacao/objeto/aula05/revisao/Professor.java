package br.com.entra21.orientacao.objeto.aula05.revisao;

import br.com.entra21.orientacao.objeto.aula02.heranca.Pessoa;

public class Professor extends Pessoa implements ComportamentoAcademico {
	
	//atributos
	private Estudante estudante[];
	private Disciplina disciplina[];

	//construtor
	public Professor() {
		
	}
	
	public Professor(Estudante[] estudante, Disciplina[] disciplna) {
		super();
		this.estudante = estudante;
		this.disciplina = disciplna;
	}

	public Professor(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);

	}
	
	public Professor(String nome, byte idade, String cpf, Estudante[] estudante, Disciplina[] disciplna) {
		super(nome, idade, cpf);
		this.estudante = estudante;
		this.disciplina = disciplna;
	}
	
	
	//encapsulamento
	public Disciplina[] getDisciplna() {
		return disciplina;
	}

	public void setDisciplna(Disciplina[] disciplina) {
		this.disciplina = disciplina;
	}

	public Estudante[] getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante[] estudante) {
		this.estudante = estudante;
	}

	//Métodos da minha Interface
	@Override
	public String realizarApresentacao() {
		String apresentacao = "Oi meu nome é " +super.getNome()+ " e tenho " +this.estudante.length;
		return apresentacao;
	}

	@Override
	public String gerarDossie(String nome) {
		String mensagem = "";
		Estudante estudantLocalizado=null;
		for(byte estudante=0; estudante < this.estudante.length; estudante++) {
			
			if(this.estudante[estudante] != null && this.estudante[estudante].getNome().equals(nome)) {
				estudantLocalizado = this.estudante[estudante];
				break;
			}
		}
		
		if(estudantLocalizado != null) {   
			mensagem = escreverDetalheDossie(estudantLocalizado);
				//depois do intervalo continuar aqui
		} else {
			mensagem = "Esse aluno não existe na minha lista";
		}
		
		return mensagem;
	}

	private String escreverDetalheDossie(Estudante estudante) {
		String detalhe = "Estudante " +estudante.getNome() + " aprendeu " +estudante.getDisciplinas().length + " disciplinas";
		detalhe += "\n Observações sobre esse estudante";
		return detalhe;
	}

}

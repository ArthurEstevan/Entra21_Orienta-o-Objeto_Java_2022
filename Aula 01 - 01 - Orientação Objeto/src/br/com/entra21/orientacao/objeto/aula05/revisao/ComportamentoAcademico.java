package br.com.entra21.orientacao.objeto.aula05.revisao;

public interface ComportamentoAcademico {
	
	//deve ser publico, porque o objetico as classes devem ter acesso
	//nesse casso retorna uma string
	//que pode ser aproveitado em um syso, alimentar variaveis, participar de um calculo
	public String realizarApresentacao(); 
	
	//retornar uma string, também precisa de um parâmetro recebido como argumento
	public String gerarDossie(String nome);

}

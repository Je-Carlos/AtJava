package bibliotecaApp.model.domain;

import lombok.Data;

@Data
public class Aluno {

	private String nome;
	private String email;
	private int idade;


	public Aluno() {
		this.setNome("Jean Carlos");
	}
	
	public Aluno(String nome) {
		this.setNome(nome);
	}
	
	@Override
	public String toString() {
		return "A inclusão do aluno " + nome + " foi realizada com sucesso!";
	}
	


}

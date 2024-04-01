package bibliotecaApp.model.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor {
    private Integer id;
    private String nome;
    private String disciplina;
    private float salario;


    public Professor() {
        this.setNome("Elberth");
        this.setDisciplina("Professor");
        this.setSalario(2000);
    }
    public Professor(String nome) {
        this();
        this.setNome(nome);
    }

    @Override
    public String toString(){
        return String.format("ID: %d\n Nome: %s\n Disciplina: %s\n Salário: %.2f\n",id,nome,disciplina,salario);
    }


}

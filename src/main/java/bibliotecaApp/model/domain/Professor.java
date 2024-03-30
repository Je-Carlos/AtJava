package bibliotecaApp.model.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor {
    private String nome;
    private String disciplina;
    private float salario;

    public Professor() {
        this.setNome("Elberth");
    }
    public Professor(String nome) {
        this();
        this.setNome(nome);
    }

    @Override
    public String toString() {
        return "Professor " + nome;
    }

}

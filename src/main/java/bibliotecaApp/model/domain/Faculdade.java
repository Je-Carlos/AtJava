package bibliotecaApp.model.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Faculdade {
    private Integer id;
    private String nome;
    private String localizacao;
    private String estado;
    private Professor professor; // um professor
    private List<Turma> materias; // muitas materias


    public Faculdade() {
        this.setNome("Infnet");
        this.setLocalizacao("Rio de Janeiro");
        this.setEstado("RJ");

    }

    @Override
    public String toString(){
        return String.format("ID: %d\n Nome: %s\n Localização: %s\n Estado: %s\n", id,nome,localizacao,estado);
    }

}

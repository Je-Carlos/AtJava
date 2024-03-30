package bibliotecaApp.model.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Faculdade {
    private String nome;
    private String localizacao;
    private String estado;
    private Professor professor; // um professor
    private List<Materia> materias; // muitas materias


    public Faculdade(String nome, String localizacao, String estado) {
        this.setNome(nome);
        this.setLocalizacao(localizacao);
        this.setEstado(estado);
    }

    @Override
    public String toString(){
        return "Faculdade " + nome + " - " + localizacao + " - " + estado;
    }

}

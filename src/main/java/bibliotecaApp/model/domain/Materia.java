package bibliotecaApp.model.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter


public class Materia { ;
    private int duracao;
    private boolean ativo;
    private int turma;

    public Materia(int duracao, boolean ativo, int turma) {
        this.duracao = duracao;
        this.ativo = ativo;
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Duração : " + duracao + " o curso se encontra ativo? " + ativo +
                " turma: " + turma;
    }
}

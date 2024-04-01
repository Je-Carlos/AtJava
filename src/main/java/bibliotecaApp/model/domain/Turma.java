package bibliotecaApp.model.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Turma {
    private Integer id;
    private int duracao;
    private boolean ativo;
    private int turma;

    public Turma() {
        this.setDuracao(60);
        this.setAtivo(true);
        this.setTurma(24);
    }


    @Override
    public String toString() {
        return String.format("%d %d %d %b ",id,turma,duracao,ativo);
    }
}

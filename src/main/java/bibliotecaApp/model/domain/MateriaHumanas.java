package bibliotecaApp.model.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class MateriaHumanas extends Materia {
    private String materia;
    private String descricao;
    private int dia;

    public MateriaHumanas(int duracao, boolean ativo, int turma) {
        super(duracao, ativo, turma);
    }

}

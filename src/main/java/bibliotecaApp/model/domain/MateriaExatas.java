package bibliotecaApp.model.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString(callSuper = true)

public class MateriaExatas extends Materia {
    private String materia;
    private int dia;
    private int hora;

    public MateriaExatas(int duracao, boolean ativo, int turma) {
        super(duracao, ativo, turma);
    }


}

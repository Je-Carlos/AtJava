package bibliotecaApp.model.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class MateriaHumanas {
    private Integer id;
    private String materia;
    private String descricao;
    private int cargaHoraria;

    public MateriaHumanas() {
        this.setMateria("Filosofia");
        this.setDescricao("Estoicismo e como se tornar um homem melhor");
        this.setCargaHoraria(20);
    }

    @Override
    public String toString() {
        return String.format("ID: %d\n Matéria: %s\n  Descrição: %s\n Carga Horaria: %d horas\n", id, materia, descricao, cargaHoraria);
    }
}



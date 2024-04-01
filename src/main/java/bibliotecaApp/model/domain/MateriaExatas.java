package bibliotecaApp.model.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter

public class MateriaExatas extends Turma {
    private Integer id;
    private String materia;
    private String dia;
    private int hora;


    public MateriaExatas(){
        this.setMateria("Física");
        this.setDia("Terça e Quarta");
        this.setHora(10);
    }
    @Override
    public String toString(){ return String.format("%d: %s - %s - %d",id,materia,dia,hora);}

}

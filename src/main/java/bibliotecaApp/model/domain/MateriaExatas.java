package bibliotecaApp.model.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter

public class MateriaExatas{
    private Integer id;
    private String materia;
    private String dia;
    private int hora;
    private int duracao;
    private boolean ativo;
    private int turma;

    public MateriaExatas(){
        this.setMateria("Física");
        this.setDia("Terça e Quarta");
        this.setHora(10);

    }

    @Override
    public String toString(){ return String.format("ID: %d\n Matéria: %s\n Dia: %s\n Hora: %d da manhã\n",id,materia,dia,hora);}

}

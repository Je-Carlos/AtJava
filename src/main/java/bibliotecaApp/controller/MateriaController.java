package bibliotecaApp.controller;

import bibliotecaApp.model.domain.Materia;
import spark.Route;

import java.util.ArrayList;
import java.util.Arrays;

public class MateriaController {
    //    recuperar todos os Materiaes
    public static Route obterMateria = (req, res) -> {
       return new ArrayList<Materia>(
                Arrays.asList(new Materia(2, true, 231),
                        new Materia(2, false, 222))
        );
    };

    //    incluir um novo Materia
    public static Route incluirMateria = (req, res) -> {
        return "Inclusão de Materia: ";
    };

    //    excluir um Materia existente
    public static Route excluirMateria = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Exclusão de Materia: " + index;
    };

    //    recuperar um Materia especifico
    public static Route obterMateriaPorId = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Recuperar de Materia: " + index;
    };

}

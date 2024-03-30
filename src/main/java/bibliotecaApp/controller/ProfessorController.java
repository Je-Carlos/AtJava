package bibliotecaApp.controller;

import bibliotecaApp.model.domain.Professor;
import spark.Route;

import java.util.ArrayList;
import java.util.Arrays;

public class ProfessorController {
    //    recuperar todos os professores
    public static Route obterProfessor = (req, res) -> {
       return new ArrayList<Professor>(
                Arrays.asList(new Professor(),
                        new Professor("Lurdes"),
                        new Professor("Cristiano Fagundes"),
                        new Professor("Paçoca Marmelada"))
        );
    };

    //    incluir um novo professor
    public static Route incluirProfessor = (req, res) -> {
        return "Inclusão de Professor: ";
    };

    //    excluir um professor existente
    public static Route excluirProfessor = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Exclusão de Professor: " + index;
    };

    //    recuperar um professor especifico
    public static Route obterProfessorPorId = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Recuperar de Professor: " + index;
    };

}

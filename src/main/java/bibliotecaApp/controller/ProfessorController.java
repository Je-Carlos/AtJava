package bibliotecaApp.controller;

import bibliotecaApp.model.domain.Professor;
import bibliotecaApp.model.service.ProfessorService;
import spark.Route;

import java.util.ArrayList;
import java.util.Arrays;

public class ProfessorController {
    //    recuperar todos os professores
    public static Route obterProfessor = (req, res) -> {
        return ProfessorService.obterLista();
//        Antigo método 'arcaico':
//       return new ArrayList<Professor>(
//                Arrays.asList(new Professor(),
//                        new Professor("Lurdes"),
//                        new Professor("Cristiano Fagundes"),
//                        new Professor("Paçoca Marmelada"))
//        );
    };

    //    incluir um novo professor
    public static Route incluirProfessor = (req, res) -> {
        Professor professor = new Professor();
        ProfessorService.incluir(professor);
        return "Inclusão de Professor: " + professor + " realizada!";
    };

    //    excluir um professor existente
    public static Route excluirProfessor = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Exclusão realizada: " + index;
    };

    //    recuperar um professor especifico
    public static Route obterProfessorPorId = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Recuperar de Professor: " + index;
    };

}

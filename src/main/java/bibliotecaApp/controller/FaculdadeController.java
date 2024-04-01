package bibliotecaApp.controller;

import bibliotecaApp.model.domain.Faculdade;
import bibliotecaApp.model.domain.Professor;
import bibliotecaApp.model.service.FaculdadeService;
import bibliotecaApp.model.service.ProfessorService;
import spark.Route;

import java.util.ArrayList;
import java.util.Arrays;

public class FaculdadeController {
    //    recuperar todos os Faculdades
    public static Route obterFaculdade = (req, res) -> {
        return FaculdadeService.obterLista();
//       return new ArrayList<Faculdade>(
//                Arrays.asList(
//                        new Faculdade("Infnet", "Jaboticabal", "SP"),
//                        new Faculdade("Infnet", "Ribeirão Preto", "SP"),
//                        new Faculdade("Infnet", "São Paulo", "SP"))
//        );
    };

    //    incluir um novo Faculdade
    public static Route incluirFaculdade = (req, res) -> {
        Faculdade faculdade = new Faculdade();
        FaculdadeService.incluir(faculdade);
        return "Inclusão de Faculdade " + faculdade + " realizada com sucesso!";
    };

    //    excluir um Faculdade existente
    public static Route excluirFaculdade = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        Faculdade faculdade = FaculdadeService.obterPorId(index);
        FaculdadeService.excluir(index);
        return "Exclusão de Faculdade: " + faculdade;
    };

    //    recuperar um Faculdade especifico
    public static Route obterFaculdadePorId = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));

        Faculdade faculdade = FaculdadeService.obterPorId(index);

        return "Recuperar de Faculdade: " + faculdade;
    };

}

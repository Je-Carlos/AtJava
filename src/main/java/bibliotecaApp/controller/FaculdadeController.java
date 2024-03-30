package bibliotecaApp.controller;

import bibliotecaApp.model.domain.Faculdade;
import spark.Route;

import java.util.ArrayList;
import java.util.Arrays;

public class FaculdadeController {
    //    recuperar todos os Faculdades
    public static Route obterFaculdade = (req, res) -> {
       return new ArrayList<Faculdade>(
                Arrays.asList(
                        new Faculdade("Infnet", "Jaboticabal", "SP"),
                        new Faculdade("Infnet", "Ribeirão Preto", "SP"),
                        new Faculdade("Infnet", "São Paulo", "SP"))
        );
    };

    //    incluir um novo Faculdade
    public static Route incluirFaculdade = (req, res) -> {
        return "Inclusão de Faculdade: ";
    };

    //    excluir um Faculdade existente
    public static Route excluirFaculdade = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Exclusão de Faculdade: " + index;
    };

    //    recuperar um Faculdade especifico
    public static Route obterFaculdadePorId = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Recuperar de Faculdade: " + index;
    };

}

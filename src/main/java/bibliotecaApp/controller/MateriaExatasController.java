package bibliotecaApp.controller;

import bibliotecaApp.model.domain.MateriaExatas;
import spark.Route;

import java.util.ArrayList;
import java.util.Arrays;

public class MateriaExatasController {
    // TODO - completar controller

    //    recuperar todos os MateriaExatas
    public static Route obterMateriaExatas = (req, res) -> {
       return new ArrayList<MateriaExatas>(
                Arrays.asList(new MateriaExatas(70, false, 2),
                        new MateriaExatas(60, true, 1))
        );
    };

    //    incluir um novo MateriaExatas
    public static Route incluirMateriaExatas = (req, res) -> {
        return "Inclusão de MateriaExatas: ";
    };

    //    excluir um MateriaExatas existente
    public static Route excluirMateriaExatas = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Exclusão de MateriaExatas: " + index;
    };

    //    recuperar um MateriaExatas especifico
    public static Route obterMateriaExatasPorId = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Recuperar de MateriaExatas: " + index;
    };

}

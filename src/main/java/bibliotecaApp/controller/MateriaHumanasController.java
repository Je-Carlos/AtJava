package bibliotecaApp.controller;

import bibliotecaApp.model.domain.MateriaHumanas;
import spark.Route;

import java.util.ArrayList;
import java.util.Arrays;

public class MateriaHumanasController {
    // TODO - completar controller

    //    recuperar todos os MateriaHumanas
    public static Route obterMateriaHumanas = (req, res) -> {
       return new ArrayList<MateriaHumanas>(
                Arrays.asList(new MateriaHumanas(40, false, 2))
        );
    };

    //    incluir um novo MateriaHumanas
    public static Route incluirMateriaHumanas = (req, res) -> {
        return "Inclusão de MateriaHumanas: ";
    };

    //    excluir um MateriaHumanas existente
    public static Route excluirMateriaHumanas = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Exclusão de MateriaHumanas: " + index;
    };

    //    recuperar um MateriaHumanas especifico
    public static Route obterMateriaHumanasPorId = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        return "Recuperar de MateriaHumanas: " + index;
    };

}

package bibliotecaApp.controller;

import bibliotecaApp.model.domain.MateriaExatas;
import bibliotecaApp.model.domain.MateriaHumanas;
import bibliotecaApp.model.service.MateriaExatasService;
import bibliotecaApp.model.service.MateriaHumanasService;
import spark.Route;

import java.util.ArrayList;
import java.util.Arrays;

public class MateriaHumanasController {
    // TODO - completar controller

    //    recuperar todos os MateriaHumanas
    public static Route obterMateriaHumanas = (req, res) -> {
        return MateriaHumanasService.obterLista();
    };

    //    incluir um novo MateriaHumanas
    public static Route incluirMateriaHumanas = (req, res) -> {
        MateriaHumanas materiaHumanas = new MateriaHumanas();
        MateriaHumanasService.incluir(materiaHumanas);
        return "Inclusão de " + materiaHumanas;
    };

    //    excluir um MateriaHumanas existente
    public static Route excluirMateriaHumanas = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        MateriaHumanas materiaHumanas = MateriaHumanasService.obterPorId(index);
        MateriaExatasService.excluir(index);
        return "Exclusão de " + materiaHumanas;
    };

    //    recuperar um MateriaHumanas especifico
    public static Route obterMateriaHumanasPorId = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        MateriaHumanas materiaHumanas = MateriaHumanasService.obterPorId(index);
        return "Recuperar de MateriaHumanas: " + materiaHumanas;
    };

}

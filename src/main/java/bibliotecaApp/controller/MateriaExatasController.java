package bibliotecaApp.controller;

import bibliotecaApp.model.domain.MateriaExatas;
import bibliotecaApp.model.service.MateriaExatasService;
import spark.Route;

import java.util.ArrayList;
import java.util.Arrays;

public class MateriaExatasController {

    public static Route obterMateriaExatas = (req, res) -> {
        return MateriaExatasService.obterLista();
    };

    //    incluir um novo MateriaExatas
    public static Route incluirMateriaExatas = (req, res) -> {
        MateriaExatas materiaExatas = new MateriaExatas();
        MateriaExatasService.incluir(materiaExatas);
        return "Inclusão de " + materiaExatas;
    };

    //    excluir um MateriaExatas existente
    public static Route excluirMateriaExatas = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        MateriaExatas materiaExatas = MateriaExatasService.obterPorId(index);
        MateriaExatasService.excluir(index);
        return "Exclusão de " + materiaExatas;
    };

    //    recuperar um MateriaExatas especifico
    public static Route obterMateriaExatasPorId = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        MateriaExatas materiaExatas = MateriaExatasService.obterPorId(index);

        return "Recuperar de MateriaExatas: " + materiaExatas;
    };

}

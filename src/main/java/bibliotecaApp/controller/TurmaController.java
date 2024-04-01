package bibliotecaApp.controller;

import bibliotecaApp.model.domain.Turma;
import bibliotecaApp.model.service.TurmaService;
import spark.Route;

public class TurmaController {
    //    recuperar todos os Turmaes
    public static Route obterTurma = (req, res) -> {
        return TurmaService.obterLista();
    };

    //    incluir um novo Turma
    public static Route incluirTurma = (req, res) -> {
        Turma turma = new Turma();
        TurmaService.incluir(turma);
        return "Inclusão de turma " + turma + "Realizada com sucesso!";
    };

    //    excluir um Turma existente
    public static Route excluirTurma = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        Turma turma = TurmaService.obterPorId(index);
        TurmaService.excluir(index);
        return "Exclusão de Turma: " + turma;
    };

    //    recuperar um Turma especifico
    public static Route obterTurmaPorId = (req, res) -> {
        Integer index = Integer.valueOf(
                req.params("id"));
        Turma turma = TurmaService.obterPorId(index);
        return "Recuperar de Turma: " + turma;
    };

}

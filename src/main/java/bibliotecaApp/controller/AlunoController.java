package bibliotecaApp.controller;

import bibliotecaApp.model.domain.Aluno;
import spark.Request;
import spark.Response;
import spark.Route;

public class AlunoController implements Route {

    @Override
    public String handle(Request request, Response response) throws Exception {

        StringBuilder html = new StringBuilder();

        Aluno aluno = new Aluno();

        html.append(aluno);

        html.append("Voltar, <a href='/'>" + aluno.getNome() + "?</a>");

        return html.toString();
    }
}
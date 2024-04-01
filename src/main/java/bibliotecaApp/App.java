package bibliotecaApp;

import bibliotecaApp.controller.*;
import spark.Spark;

public class App {

    public static void main(String[] args) {

        Spark.port(8080);

        Spark.get("/", (req, res) -> {
            return App.class.getResourceAsStream("/index.html");
        });

        // Sequencias de rotas que envolvem o aluno
        Spark.get("/aluno", new AlunoController());

        //		Contextos do projeto == mundo em classes

        //		Professor
        Spark.get("/professor/lista", ProfessorController.obterProfessor);
        Spark.post("/professor/:nome/incluir", ProfessorController.incluirProfessor); // Só é possível chamar essa rota com o nome de quem vai incluir
        Spark.delete("/professor/:id/excluir", ProfessorController.excluirProfessor);
        Spark.get("/professor/:id", ProfessorController.obterProfessorPorId);

        //      Faculdade
        Spark.get("/faculdade/lista", FaculdadeController.obterFaculdade);
        Spark.post("/faculdade/incluir", FaculdadeController.incluirFaculdade);
        Spark.delete("/faculdade/:id/excluir", FaculdadeController.excluirFaculdade);
        Spark.get("/faculdade/:id", FaculdadeController.obterFaculdadePorId);

        //      Turma
        Spark.get("/turma/lista", TurmaController.obterTurma);
        Spark.post("/turma/incluir", TurmaController.incluirTurma);
        Spark.delete("/turma/:id/excluir", TurmaController.excluirTurma);
        Spark.get("/turma/:id", TurmaController.obterTurmaPorId);

        //      Materia Exatas
        Spark.get("/materiaExatas/lista", MateriaExatasController.obterMateriaExatas);
        Spark.post("/materiaExatas/incluir", MateriaExatasController.incluirMateriaExatas);
        Spark.delete("/materiaExatas/:id/excluir", MateriaExatasController.excluirMateriaExatas);
        Spark.get("/materiaExatas/:id", MateriaExatasController.obterMateriaExatasPorId);

        //        Materia Humanas
        Spark.get("/materiaHumanas/lista", MateriaHumanasController.obterMateriaHumanas);
        Spark.post("/materiaHumanas/incluir", MateriaHumanasController.incluirMateriaHumanas);
        Spark.delete("/materiaHumanas/:id/excluir", MateriaHumanasController.excluirMateriaHumanas);
        Spark.get("/materiaHumanas/:id", MateriaHumanasController.obterMateriaHumanasPorId);

        Spark.get("viacep/:cep", ViaCepController.getEndereco);
    }

}
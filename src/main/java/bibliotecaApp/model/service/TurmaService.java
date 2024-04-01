package bibliotecaApp.model.service;

import bibliotecaApp.model.domain.Turma;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TurmaService {
    private static Map<Integer, Turma> turmas = new HashMap<Integer, Turma>();

    private static Integer id = 0;

    //incluir
    public static void incluir(Turma turma){
        turma.setId(++id); // Primeiro incrementar o Id
        turmas.put(turma.getId(), turma); // Depois instanciar ele já incrementado
    }
    //excluir
    public static void excluir(Integer id){
        turmas.remove(id);
    }
    //obterLista
    public static Collection<Turma> obterLista(){
        return turmas.values();
    }

    //obterPorId
    public static Turma obterPorId(Integer id){
        return turmas.get(id);
    }
}

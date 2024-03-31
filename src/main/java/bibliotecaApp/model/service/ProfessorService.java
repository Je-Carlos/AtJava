package bibliotecaApp.model.service;

import bibliotecaApp.model.domain.Professor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//      base de dados fake
public class ProfessorService {
    private static Map<Integer, Professor> professores = new HashMap<Integer, Professor>();

    private static Integer id = 0;

    //incluir
    public static void incluir(Professor professor){
        professor.setId(++id); // Primeiro incrementar o Id
        professores.put(professor.getId(), professor); // Depois instanciar ele já incrementado
    }
    //excluir
    public static void excluir(Integer id){
        professores.remove(id);
    }
    //obterLista
    public static Collection<Professor> obterLista(){
        return professores.values();
    }

    //obterPorId
    public static Professor obterPorId(Integer id){
        return professores.get(id);
    }
}

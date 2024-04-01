package bibliotecaApp.model.service;

import bibliotecaApp.model.domain.Faculdade;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FaculdadeService {
    private static Map<Integer, Faculdade> faculdades = new HashMap<Integer, Faculdade>();

    private static Integer id = 0;

    //incluir
    public static void incluir(Faculdade faculdade){
        faculdade.setId(++id); // Primeiro incrementar o Id
        faculdades.put(faculdade.getId(), faculdade); // Depois instanciar ele já incrementado
    }
    //excluir
    public static void excluir(Integer id){
        faculdades.remove(id);
    }
    //obterLista
    public static Collection<Faculdade> obterLista(){
        return faculdades.values();
    }

    //obterPorId
    public static Faculdade obterPorId(Integer id){
        return faculdades.get(id);
    }
}

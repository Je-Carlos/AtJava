package bibliotecaApp.model.service;

import bibliotecaApp.model.domain.MateriaExatas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MateriaExatasService {
    private static Map<Integer, MateriaExatas> materiaExatass = new HashMap<Integer, MateriaExatas>();

    private static Integer id = 0;

    //incluir
    public static void incluir(MateriaExatas materiaExatas) {
        materiaExatas.setId(++id); // Primeiro incrementar o Id
        materiaExatass.put(materiaExatas.getId(), materiaExatas); // Depois instanciar ele já incrementado
    }

    //excluir
    public static void excluir(Integer id) {
        materiaExatass.remove(id);
    }

    //obterLista
    public static Collection<MateriaExatas> obterLista() {
        return materiaExatass.values();
    }

    //obterPorId
    public static MateriaExatas obterPorId(Integer id) {
        return materiaExatass.get(id);
    }
}

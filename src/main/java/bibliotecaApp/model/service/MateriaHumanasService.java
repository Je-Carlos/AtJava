package bibliotecaApp.model.service;

import bibliotecaApp.model.domain.MateriaHumanas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MateriaHumanasService {
    private static Map<Integer, MateriaHumanas> materiaHumanass = new HashMap<Integer, MateriaHumanas>();

    private static Integer id = 0;

    //incluir
    public static void incluir(MateriaHumanas MateriaHumanas) {
        MateriaHumanas.setId(++id); // Primeiro incrementar o Id
        materiaHumanass.put(MateriaHumanas.getId(), MateriaHumanas); // Depois instanciar ele já incrementado
    }

    //excluir
    public static void excluir(Integer id) {
        materiaHumanass.remove(id);
    }

    //obterLista
    public static Collection<MateriaHumanas> obterLista() {
        return materiaHumanass.values();
    }

    //obterPorId
    public static MateriaHumanas obterPorId(Integer id) {
        return materiaHumanass.get(id);
    }
}

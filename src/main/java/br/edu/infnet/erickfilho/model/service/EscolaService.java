package br.edu.infnet.erickfilho.model.service;

import br.edu.infnet.erickfilho.model.domain.Escola;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EscolaService {

    private Map<String, Escola> escolas = new HashMap<String, Escola>();

    public void incluir(Escola escola) {
        escolas.put(escola.getNome(), escola);
    }

    public void excluir(String nome) {
        escolas.remove(nome);
    }

    public Collection<Escola> obterLista() {
        return escolas.values();
    }

    public Escola obter(String nome) {
        return escolas.get(nome);
    }

}

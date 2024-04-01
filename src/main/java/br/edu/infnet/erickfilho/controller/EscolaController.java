package br.edu.infnet.erickfilho.controller;


import br.edu.infnet.erickfilho.model.domain.Endereco;
import br.edu.infnet.erickfilho.model.domain.Escola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.edu.infnet.erickfilho.service.ViaCepService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/escolas")
public class EscolaController {

    private final List<Escola> escolas = new ArrayList<>();

    @Autowired
    private ViaCepService viaCepService;

    @GetMapping
    public List<Escola> getTodasEscolas() {
        return escolas;
    }


    @PostMapping
    public Escola createEscola(@RequestBody Escola escola) {
        String cep = escola.getEndereco().getCep();
        System.out.println(cep);
        Endereco endereco = viaCepService.getEnderecoComCodigo(cep);
        if (endereco != null) {
            escola.setEndereco(endereco);
            escolas.add(escola);
        } else {
            throw new RuntimeException("Erro: Endereço não encontrado para o CEP fornecido.");
        }

        return escola;
    }

    @DeleteMapping("/{id}")
    public boolean deleteEscola(@PathVariable long id) {
        return escolas.removeIf(escolas -> escolas.getId() == id);
    }


}

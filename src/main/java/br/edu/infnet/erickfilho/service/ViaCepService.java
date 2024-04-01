package br.edu.infnet.erickfilho.service;

import br.edu.infnet.erickfilho.model.domain.Endereco;


import br.edu.infnet.erickfilho.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepService {


    private final RestTemplate restTemplate;

    @Autowired
    public ViaCepService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Endereco getEnderecoComCodigo(String code) {
        final String uri = "https://viacep.com.br/ws/" + code + "/json/";
        Endereco endereco = restTemplate.getForObject(uri, Endereco.class);

        return endereco;
    }

}

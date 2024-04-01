package br.edu.infnet.erickfilho;

import br.edu.infnet.erickfilho.model.domain.Endereco;
import br.edu.infnet.erickfilho.model.domain.Escola;
import br.edu.infnet.erickfilho.model.service.EscolaService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EnderecoLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        Endereco endereco1 = new Endereco("Rua A", "123", "Bairro A", "Cidade A", "Estado A", "CEP A");

        Endereco endereco2 = new Endereco("Rua B", "456", "Bairro B", "Cidade B", "Estado B", "CEP B");

        Endereco endereco3 = new Endereco("Rua C", "789", "Bairro C", "Cidade C", "Estado C", "CEP C");
    }
}
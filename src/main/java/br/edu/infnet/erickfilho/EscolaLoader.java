package br.edu.infnet.erickfilho;

import br.edu.infnet.erickfilho.clients.IEnderecoClient;
import br.edu.infnet.erickfilho.model.domain.Endereco;
import br.edu.infnet.erickfilho.model.domain.Escola;
import br.edu.infnet.erickfilho.model.service.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EscolaLoader implements ApplicationRunner {

    @Autowired
    private IEnderecoClient enderecoClient;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Endereco enderecoInfnet = enderecoClient.obterCep("22241900");

        EscolaService escolaService = new EscolaService();

        escolaService.incluir(new Escola("Infnet", "infnet@infnet.com", enderecoInfnet));

//        escolaService.excluir(new Escola("Infnet", "infnet@infnet.com", enderecoInfnet));

        escolaService.incluir(new Escola("Instituto Infnet", "institutoinfnet@infnet.com", enderecoInfnet));
        System.out.println(" - " + escolaService.obter("Instituto Infnet"));

        escolaService.incluir(new Escola("Escola de Negócios", "", enderecoInfnet));
        System.out.println(" - " + escolaService.obterLista());
    }
}
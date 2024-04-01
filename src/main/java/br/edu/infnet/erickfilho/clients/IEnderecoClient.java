package br.edu.infnet.erickfilho.clients;

import br.edu.infnet.erickfilho.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//https://viacep.com.br/ws
@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface IEnderecoClient {

    // /01001000/json/

    @GetMapping(value = "/{cep}/json/")
    Endereco obterCep(@PathVariable String cep);
}

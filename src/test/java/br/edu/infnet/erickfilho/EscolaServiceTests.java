package br.edu.infnet.erickfilho;

import br.edu.infnet.erickfilho.model.domain.Escola;
import br.edu.infnet.erickfilho.model.service.EscolaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class EscolaServiceTests {

    private EscolaService escolaService;

    @BeforeEach
    void setUp() {
        escolaService = new EscolaService();
    }

    @Test
    void testarIncluir() {
        Escola escola = new Escola("Infnet", "infnet@infnet.com");
        escolaService.incluir(escola);
        assertNull(escolaService.obter("Infnet"));

    }


}

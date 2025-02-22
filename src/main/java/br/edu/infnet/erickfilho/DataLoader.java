package br.edu.infnet.erickfilho;

import br.edu.infnet.erickfilho.controller.EscolaController;
import br.edu.infnet.erickfilho.controller.ProfessorController;
import br.edu.infnet.erickfilho.model.domain.Endereco;
import br.edu.infnet.erickfilho.model.domain.Escola;
import br.edu.infnet.erickfilho.model.domain.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EscolaController escolaController;
    @Autowired
    private ProfessorController professorController;
    @Override
    public void run(String... args) throws Exception {
        carregarEscolas();
        carregarProfessores();
    }


    Escola infnet = new Escola(1, "Infnet", new Endereco("29060130", null, null, null, null, null), "29060130");

    Endereco enderecoInfnet = new Endereco("29060130", null, null, null, null, null);

    private void carregarEscolas() {
        escolaController.createEscola(new Escola(1, "Infnet", new Endereco("29060130", null, null, null, null, null), "29060130"));
        System.out.println("Sucesso: As escolas foram adicionadas!");
    }

    private void carregarProfessores() {
        professorController.createProfessor(new Professor(1, "Erick Santos", new Escola(1, "CEFET",  enderecoInfnet, "29060130")));
        professorController.createProfessor(new Professor(2, "Elberth Moraes", new Escola(2, "infnet",  enderecoInfnet, "09330788")));
        professorController.createProfessor(new Professor(2, "Elberth Moraes", infnet));

        System.out.println("Sucesso: Os professores foram adicionados!");
    }



}

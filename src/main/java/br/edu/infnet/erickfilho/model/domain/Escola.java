package br.edu.infnet.erickfilho.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private String email;
    private List<Estudante> estudantes;
    public Endereco endereco;

    public Escola() {

    }
    public Escola(String nome) {
        this();
    }

    public Escola(String nome, String email) {
        this(nome);
        this.setEmail(email);
    }

    public Escola(String nome, String email, Endereco endereco) {
        this(nome, email);
        this.setEndereco(endereco);
    }


    @Override
    public String toString() {
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'';
    }

    public String getemail(){
        return email;
    }
    private void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

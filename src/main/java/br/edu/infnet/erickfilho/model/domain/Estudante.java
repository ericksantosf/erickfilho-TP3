package br.edu.infnet.erickfilho.model.domain;

public class Estudante {
    private String nome;
    private int idade;
    private String curso;
    private int matricula;
    private Endereco endereco;
    private int mensalidade;

    // Métodos de acesso (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }

    // Método para retornar informações sobre o estudante
    public String getInfo() {
        return "Nome: " + nome + ", Idade: " + idade + ", Curso: " + curso + ", Matrícula: " + matricula;
    }

    public int calcularMensalidade() {
        if (curso == "História") {
            return mensalidade + 500;

        } else if (curso == "Geografia") {
            return mensalidade + 400;

        } else if (curso=="Matemática") {
                return mensalidade + 600;

        }else if (curso=="Física") {
                return mensalidade + 1000;
        } else {
            return mensalidade;
        }
    }

            public boolean podeVotar() {
        return idade >= 16;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
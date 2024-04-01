package br.edu.infnet.erickfilho;

import br.edu.infnet.erickfilho.model.domain.Estudante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EstudanteTests {
	private Estudante estudante;
	private final String nome = "Clara";
	private final int matricula = 12345;
	private final String curso = "História";

	@BeforeEach
	void setUp() {
		estudante = new Estudante();
		estudante.setNome(nome);
		estudante.setMatricula(matricula);
		estudante.setCurso(curso);
	}

	@Test
	void estudante16AnosPodeVotar() {
		estudante.setIdade(16);
        assertTrue(estudante.podeVotar());
	}

	@Test
	void estudante15AnosNaoPodeVotar() {
		estudante.setIdade(15);
        assertFalse(estudante.podeVotar());
	}

	@Test
	void estudante17AnosPodeVotar() {
		estudante.setIdade(17);
        assertTrue(estudante.podeVotar());
	}

	@Test
	void testarCalcularMensalidade() {
		estudante.setCurso("História");
		estudante.setMensalidade(1000);
		assertEquals(1500, estudante.calcularMensalidade());
	}

	@Test
	void testarCalcularMensalidadeGeografia() {
		estudante.setCurso("Geografia");
		estudante.setMensalidade(1000);
		assertEquals(1400, estudante.calcularMensalidade());
	}

	@Test
	void testarCalcularMensalidadeMatematica() {
		estudante.setCurso("Matemática");
		estudante.setMensalidade(1000);
		assertEquals(1600, estudante.calcularMensalidade());
	}

	@Test
	void testarCalcularMensalidadeFisica() {
		estudante.setCurso("Física");
		estudante.setMensalidade(1000);
		assertEquals(2000, estudante.calcularMensalidade());
	}

	@Test
	void testarCalcularMensalidadeOutroCurso() {
		estudante.setCurso("Outro");
		estudante.setMensalidade(1000);
		assertEquals(1000, estudante.calcularMensalidade());
	}

	@Test
	void testarGetInfo() {
		assertEquals("Nome: " + nome + ", Idade: 0, Curso: " + curso + ", Matrícula: " + matricula, estudante.getInfo());
	}

	@Test
	void testarGetInfoComIdade() {
		estudante.setIdade(20);
		assertEquals("Nome: " + nome + ", Idade: 20, Curso: " + curso + ", Matrícula: " + matricula, estudante.getInfo());
	}

	@Test
	void testarGetInfoComIdadeCurso() {
		estudante.setIdade(20);
		estudante.setCurso("Geografia");
		assertEquals("Nome: " + nome + ", Idade: 20, Curso: Geografia, Matrícula: " + matricula, estudante.getInfo());
	}

	@Test
	void testarGetInfoComIdadeCursoMatricula() {
		estudante.setIdade(20);
		estudante.setCurso("Geografia");
		estudante.setMatricula(54321);
		assertEquals("Nome: " + nome + ", Idade: 20, Curso: Geografia, Matrícula: 54321", estudante.getInfo());
	}

	@Test
	void testarGetInfoComIdadeCursoMatriculaNome() {
		estudante.setIdade(20);
		estudante.setCurso("Geografia");
		estudante.setMatricula(54321);
		estudante.setNome("João");
		assertEquals("Nome: João, Idade: 20, Curso: Geografia, Matrícula: 54321", estudante.getInfo());
	}

	@Test
	void testarGetInfoComIdadeCursoMatriculaNomeMensalidade() {
		estudante.setIdade(20);
		estudante.setCurso("Geografia");
		estudante.setMatricula(54321);
		estudante.setNome("João");
		estudante.setMensalidade(1000);
		assertEquals("Nome: João, Idade: 20, Curso: Geografia, Matrícula: 54321", estudante.getInfo());
	}

	@Test
	void testarGetInfoComIdadeCursoMatriculaNomeMensalidadeIdade() {
		estudante.setIdade(20);
		estudante.setCurso("Geografia");
		estudante.setMatricula(54321);
		estudante.setNome("João");
		estudante.setMensalidade(1000);
		estudante.setIdade(25);
		assertEquals("Nome: João, Idade: 25, Curso: Geografia, Matrícula: 54321", estudante.getInfo());
	}

	@Test
	void testarGetInfoComIdadeCursoMatriculaNomeMensalidadeIdadeCurso() {
		estudante.setIdade(20);
		estudante.setCurso("Geografia");
		estudante.setMatricula(54321);
		estudante.setNome("João");
		estudante.setMensalidade(1000);
		estudante.setIdade(25);
		estudante.setCurso("História");
		assertEquals("Nome: João, Idade: 25, Curso: História, Matrícula: 54321", estudante.getInfo());
	}

	@Test
	void testarGetInfoComIdadeCursoMatriculaNomeMensalidadeIdadeCursoMatricula() {
		estudante.setIdade(20);
		estudante.setCurso("Geografia");
		estudante.setMatricula(54321);
		estudante.setNome("João");
		estudante.setMensalidade(1000);
		estudante.setIdade(25);
		estudante.setCurso("História");
		estudante.setMatricula(12345);
		assertEquals("Nome: João, Idade: 25, Curso: História, Matrícula: 12345", estudante.getInfo());
	}

	@Test
	void testarGetInfoComIdadeCursoMatriculaNomeMensalidadeIdadeCursoMatriculaMensalidade() {
		estudante.setIdade(20);
		estudante.setCurso("Geografia");
		estudante.setMatricula(54321);
		estudante.setNome("João");
		estudante.setMensalidade(1000);
		estudante.setIdade(25);
		estudante.setCurso("História");
		estudante.setMatricula(12345);
		estudante.setMensalidade(2000);
		assertEquals("Nome: João, Idade: 25, Curso: História, Matrícula: 12345", estudante.getInfo());
	}
}

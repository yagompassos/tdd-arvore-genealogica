package familia.testes;

import static org.junit.Assert.*;
import familia.Pessoa;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void testCriarPessoaComFactoryMethod() {
		Pessoa joao = Pessoa.criar("João", "Silva");
		assertEquals("João", joao.getNome());
		assertEquals("Silva", joao.getSobrenome());
	}

	@Test
	public void testAdicionarFilho() {
		Pessoa joao = Pessoa.criar("João", "Silva");
		Pessoa henrique = Pessoa.criar("Henrique", "Silva");
		joao.addFilho(henrique);
		assertTrue(joao.getFilhos().contains(henrique));
	}
	
}

package ed10;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ed10 {

	
	@Test
	//CT01 ? cadastrar livro com sucesso
	public void ct01_sucesso() {
		Biblioteca biblioteca = new Biblioteca();
		Livro primeiroLivro = new Livro("1111", "Engenharia de Software", "Pressman");
		biblioteca.save(primeiroLivro);
		List<Livro> lista = biblioteca.getLivros();
		assertEquals("Engenharia de Software", lista.get(0).getTitulo());
	}

	@Test
	// CT02 ? cadastrar livro com isbn j? cadastrado
	public void ct02_erro() {
		Biblioteca biblioteca = new Biblioteca();
		boolean resultado;
		Livro umLivro = new Livro("1111", "Engenharia de Software", "Pressman");

		// Primeiro Livro
		resultado = biblioteca.save(umLivro);

		// Segundo Livro
		resultado = biblioteca.save(umLivro);
		assertEquals(false, resultado);
	}
	

	@Test
	// CT03 ? cadastrar livro com isbn em branco
	public void ct03_erro() {
		Biblioteca biblioteca = new Biblioteca();
		boolean resultado;
		Livro umLivro = new Livro("", "Engenharia de Software", "Pressman");

		// Cadastra Livro
		resultado = biblioteca.save(umLivro);
		assertEquals(false, resultado);
	}

	
	@Test
	//CT04 ? cadastrar livro com t?tulo em branco
	public void ct04_erro() {
		Biblioteca biblioteca = new Biblioteca();
		boolean resultado;
		Livro umLivro = new Livro("4444", "", "Pressman");
		
		//Cadastra Livro
		resultado = biblioteca.save(umLivro);
		assertEquals(false, resultado);
	}
	
	
	@Test
	//CT05 ? cadastrar livro com autor em branco
	public void ct05_erro() {
		Biblioteca biblioteca = new Biblioteca();
		boolean resultado;
		Livro umLivro = new Livro("5555", "Desenvolvimento Web", "");
		
		//Cadastra Livro
		resultado = biblioteca.save(umLivro);
		assertEquals(false, resultado);
	}
	
}

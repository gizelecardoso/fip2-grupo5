package ed10;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
	private List<Livro> livros = new ArrayList<Livro>();
	public List<Livro> getLivros() {
		return livros;
}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public boolean save(Livro livro) {
		
		if (livro.autor.equals("")) {
			return false;
		}
		
		
		if (livro.titulo.equals("")) {
			return false;
		}
		
		if (livro.isbn.equals("")) {
			return false;
		}
		
		if (this.livros.contains(livro)) {
			return false;
		}
		livros.add(livro);
		return true;
		
		
	}
	public int size() {
		return livros.size();
	}
	
	public void add(Livro livro) {
	}
	

}
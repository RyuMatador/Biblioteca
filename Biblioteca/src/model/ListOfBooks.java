package model;
	import java.util.ArrayList;
	
public class ListOfBooks {
	private ArrayList<Book> listOfBooks = new ArrayList<Book>();

	public ArrayList<Book> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(ArrayList<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	// incluirNoInicio(Livro) inclui um Livro no in�cio da lista
	public void includeUp (Book livro) {
		this.listOfBooks.add(0, livro);
	}
	
	// incluirNoFim(Livro) incluir um Livro no final da lista
	public void includeDown (Book livro) {
		this.listOfBooks.add(livro);
	}
	
	// ordenar() ordena os objetos Livro presentes na lista em ordem alfab�tica de t�tulo
	public void sortByAlphabet() {
	
	}
	//Livro removerDoFim() remove um Livro do final da lista e o retorna
	public Book removeEnd() {
		Book livro=this.listOfBooks.remove(this.sizeOfLibrary()-1);
		return livro;
	}
	//int tamanho() retorna a quantidade de livros na lista
	public int sizeOfLibrary() {
		int sizeOfLibrary;
		sizeOfLibrary = listOfBooks.size();
		return sizeOfLibrary;
	}
	
	//Livro get(int) retorna o Livro que est� na posi��o da lista indicada no argumento
	public Book get(int book) {
		Book livroId = listOfBooks.get(book);
		return livroId;
		
	}
	
}

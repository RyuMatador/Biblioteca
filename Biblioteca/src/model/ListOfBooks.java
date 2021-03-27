package model;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ListOfBooks {
	private static ArrayList<Book> listOfBooks = new ArrayList<Book>();
	Scanner in = new Scanner(System.in);

	public ArrayList<Book> getListOfBooks() {
		return listOfBooks;
	}

	// incluirNoInicio(Livro) inclui um Livro no início da lista
	public void includeUp(Book livro) {
		System.out.println("Digite o Titulo, o nome do autor e seu estado, ano de publicação, editora e isbn");
		livro.setTitle(in.next());
		livro.setAuthor(new Author(in.next(), in.next()));
		livro.setAnoPublicacao(in.next());
		livro.setEditora(in.next());
		livro.setIsbn(in.next());
		listOfBooks.add(0, livro);
	}

	// incluirNoFim(Livro) incluir um Livro no final da lista
	public void includeDown(Book livro) {
		System.out.println("Digite o Titulo, o nome do autor e seu estado, ano de publicação, editora e isbn");
		livro.setTitle(in.next());
		livro.setAuthor(new Author(in.next(), in.next()));
		livro.setAnoPublicacao(in.next());
		livro.setEditora(in.next());
		livro.setIsbn(in.next());
		for (int i = 0; i > listOfBooks.size(); i++) {
			if (i > listOfBooks.size())
				listOfBooks.add(i, livro);
		}
	}

	// ordenar() ordena os objetos Livro presentes na lista em ordem alfabética de título
	public void sortByAlphabet() {
		Collections.sort(listOfBooks);
		listOfBooks.sort(null);
	}

	// Livro removerDoFim() remove um Livro do final da lista e o retorna
	public Book removeEnd() {
		Book livro = listOfBooks.remove(sizeOfLibrary() - 1);
		return livro;
	}

	// int tamanho() retorna a quantidade de livros na lista
	public int sizeOfLibrary() {
		int sizeOfLibrary;
		sizeOfLibrary = listOfBooks.size();
		return sizeOfLibrary;
	}
	
	// Livro get(int) retorna o Livro que está na posição da lista indicada no argumento
	public Book get(int book) {
		Book livroId = listOfBooks.get(book);
		return livroId;
	}
	
	//Mostra a lista de livros
	public void mostraBiblioteca() {
		for (Book book : listOfBooks) {
			System.out.println(book.toString());
		}
	}
}
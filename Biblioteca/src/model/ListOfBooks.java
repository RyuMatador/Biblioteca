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

	// incluirNoInicio(Livro) inclui um Livro no início da lista (Funcional)
	public void includeUp(Book livro) {
		System.out.println("Digite o Titulo, o nome do autor e seu estado, ano de publicação, editora e isbn");
		livro.setTitle(in.next());
		livro.setAuthor(new Author(in.next(), in.next()));
		livro.setAnoPublicacao(in.nextInt());
		livro.setEditora(in.next());
		livro.setIsbn(in.next());
		listOfBooks.add(0, livro);
	}

	// incluirNoFim(Livro) incluir um Livro no final da lista
	public void includeDown(Book livro) {
		System.out.println("Digite o Titulo, o nome do autor e seu estado, ano de publicação, editora e isbn");
		livro.setTitle(in.next());
		livro.setAuthor(new Author(in.next(), in.next()));
		livro.setAnoPublicacao(in.nextInt());
		livro.setEditora(in.next());
		livro.setIsbn(in.next());
		listOfBooks.add(livro);
	}

	// ordenar() ordena os objetos Livro presentes na lista em ordem alfabética de
	// título (Meio Funcional, só compara os dois primeiros)
	public void sortByAlphabet() {
		Collections.sort(listOfBooks);
	}

	// Livro removerDoFim() remove um Livro do final da lista e o retorna
	// (Funcional)
	public Book removeEnd() {
		Book livro = listOfBooks.remove(sizeOfLibrary() - 1);
		return livro;
	}

	// int tamanho() retorna a quantidade de livros na lista (Funcional)
	public int sizeOfLibrary() {
		int sizeOfLibrary;
		sizeOfLibrary = listOfBooks.size();
		return sizeOfLibrary;
	}

	// Livro get(int) retorna o Livro que está na posição da lista indicada no
	// argumento (Funcional)
	public Book get(int book) {
		Book livroId = listOfBooks.get(book);
		return livroId;
	}

	// Mostra a lista de livros (Funcional)
	public void showLibrary() {
		for (Book book : listOfBooks) {
			System.out.println(book);
		}
	}

	// 1. Apresentar os títulos de todos os livros cadastrados em ordem alfabética
	public void showLibraryByAlphabetOrder() {
		sortByAlphabet();
		showLibrary();
	}

	// 2. Apresentar os títulos dos livros de um determinado autor
	public void showBookByAuthor(String nomeAutor) {
		for (Book book : listOfBooks) {
			if (book.getAuthor().getName().equals(nomeAutor)) {
				System.out.println(book.getTitle());
			}
		}
	}

	// 3. Apresentar os títulos dos livros publicados em um determinado intervalo de
	// anos (p.ex.: livros publicados entre 2010 e 2015)
	public void showBookByYears(Integer a, Integer b) {
		for (Book book : listOfBooks) {
			if (book.getAnoPublicacao() >= a && book.getAnoPublicacao() <= b) {
				System.out.println(book.getTitle());
			}
		}
	}

	// 4. Apresentar título, autor e editora de todos os livros que contém, no seu
	// título, uma palavra ou frase informada pelo usuário.
	public void search(String sub) {
		for (Book book : listOfBooks) {
			if (book.getTitle().contains(sub)) {
				System.out.println("Em título (s): ");
				System.out.println(book.getTitle());
			}
			if (book.getAuthor().getName().contains(sub)) {
				System.out.println("Encontrado em autor(es): ");
				System.out.println(book.getAuthor().getName());
			}
			if (book.getEditora().contains(sub)) {
				System.out.println("Encontrado em editor(as): ");
				System.out.println(book.getEditora());
			}
		}
	}
}
		

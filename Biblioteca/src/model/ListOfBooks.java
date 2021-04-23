package model;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.ArrayList;

public class ListOfBooks {
	private static ArrayList<Book> listOfBooks = new ArrayList<Book>();

	public ArrayList<Book> getListOfBooks() {
		return listOfBooks;
	}

	// incluirNoInicio(Livro) inclui um Livro no início da lista (Funcional)
	public void includeUp(Book livro) {
		System.out.println("Digite o Titulo, o nome do autor e seu estado, editora, isbn e  ano de publicação");
		try {
			insertData(livro);
			if (verifyEqualBook(livro) == false) { // Verifica se o livro é igual a outro da lista
				listOfBooks.add(0, livro);
				System.out.println("1-Incluído um livro incluído no início da lista");
			} else
				throw new BookAlreadyExists("Livro não incluído, pois já existe um com o mesmo título e isbn.");
		} catch (BookAlreadyExists e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) { 
			System.out.println("Livro não inserido. Verifique se você inseriu as informações corretamente. Ex.: Inseriu letras no campo ano.");
		}
	}

	// incluirNoFim(Livro) incluir um Livro no final da lista
	public void includeDown(Book livro) {
		System.out.println("Digite o Titulo, o nome do autor e seu estado, editora, isbn e  ano de publicação");
		insertData(livro);
		try {
			if (verifyEqualBook(livro) == false) { // Verifica se o livro é igual a outro da lista
				listOfBooks.add(livro);
				System.out.println("2-Incluído um livro no final da lista");
			} else
				throw new BookAlreadyExists("Livro não incluído, pois já existe um com o mesmo título e isbn.");
		} catch (BookAlreadyExists e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) { 
			System.out.println("Livro não inserido. Verifique se você inseriu as informações corretamente. Ex.: Inseriu letras no campo ano.");
		}
	}

	// ordenar() ordena os objetos Livro presentes na lista em ordem alfabética de
	// título (Meio Funcional, só compara um com o restante)

	public void sortByAlphabet() {
		listOfBooks.sort(new Comparator<Book>() {
			public int compare(Book o1, Book o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
	}

	// Livro removerDoFim() remove um Livro do final da lista e o retorna
	// (Funcional)
	public Book removeEnd() {
		Book livro = new Book();
		try {
			if (listOfBooks.size() > 0) {
				listOfBooks.remove(sizeOfLibrary() - 1);
				System.out.println("4 - Último livro removido");
			} else
				throw new BookNotFound("Livro não removido, pois a biblioteca está vazia.");
		} catch (BookNotFound e) {
			System.out.println(e.getMessage());
		}
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
		if (listOfBooks.size() > 0) {
			for (Book book : listOfBooks) {
				System.out.println(book);
			}
		} else
			System.out.println("Biblioteca vazia");
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

	public boolean verifyEqualBook(Book book) {
		for (Book otherBook : listOfBooks) {
			if (book.equals(otherBook) == true)
				return true;
		}
		return false;
	}

	public void insertData(Book livro) {
		Scanner scan = new Scanner(System.in);
		livro.setTitle(scan.nextLine());
		livro.setAuthor(new Author(scan.nextLine(), scan.nextLine()));
		livro.setEditora(scan.nextLine());
		livro.setIsbn(scan.nextLine());
		livro.setAnoPublicacao(scan.nextInt());
	}
}

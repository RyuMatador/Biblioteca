package aplication;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import model.Author;
import model.Book;

public class Execucao {
	public static Scanner in = new Scanner(System.in);
	private static ArrayList<Book> listOfBooks = new ArrayList<Book>();


	public ArrayList<Book> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(ArrayList<Book> listOfBooks) {
		listOfBooks = Execucao.listOfBooks;
	}
	
	// incluirNoInicio(Livro) inclui um Livro no in�cio da lista
	public static void includeUp (Book livro) {
		System.out.println("Digite o Titulo, o nome do autor e seu estado, ano de publica��o, editora e isbn");
		livro.setTitle(in.next());
		livro.setAuthor(new Author(in.next(),in.next()));
		livro.setAnoPublicacao(in.next());
		livro.setEditora(in.next());
		livro.setIsbn(in.next());
		listOfBooks.add(0, livro);
	}
	
	// incluirNoFim(Livro) incluir um Livro no final da lista
	public static void includeDown (Book livro) {
		System.out.println("Digite o Titulo, o nome do autor e seu estado, ano de publica��o, editora e isbn");
		livro.setTitle(in.next());
		livro.setAuthor(new Author(in.next(),in.next()));
		livro.setAnoPublicacao(in.next());
		livro.setEditora(in.next());
		livro.setIsbn(in.next());
		for (int i = 0; i > listOfBooks.size(); i++) {
			if (i > listOfBooks.size())
				listOfBooks.add(i,livro);
		}
	}
	
	// ordenar() ordena os objetos Livro presentes na lista em ordem alfab�tica de t�tulo
	public static void sortByAlphabet() {
		Collections.sort(listOfBooks);				
	}
	//Livro removerDoFim() remove um Livro do final da lista e o retorna
	public static Book removeEnd() {
		Book livro=listOfBooks.remove(sizeOfLibrary()-1);
		return livro;
	}
	//int tamanho() retorna a quantidade de livros na lista
	public static int sizeOfLibrary() {
		int sizeOfLibrary;
		sizeOfLibrary = listOfBooks.size();
		return sizeOfLibrary;
	}
	
	public static void mostraBiblioteca() {
		for (Book book : listOfBooks) {
			System.out.println(book.toString());
		}
	}
	//Livro get(int) retorna o Livro que est� na posi��o da lista indicada no argumento
	public static Book get(int book) {
		Book livroId = listOfBooks.get(book);
		return livroId;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Digite a escolha:");
		String choose;
		choose = in.next();

		while (choose != "n") {
			System.out.println(" ____________________BIBLIOTECA____________________");
			System.out.println("|1-Incluir um livro no in�cio                      |");
			System.out.println("|2-Incluir um livro no final                       |");
			System.out.println("|3-Ordernar os livros em ordem alfabetica de titulo|");
			System.out.println("|4-Remover livro do final da lista                 |");
			System.out.println("|5-Tamanho da biblioteca                           |");
			System.out.println("|6-Pesquisar um livro                              |");
			System.out.println("|7-Sair                                            |");
			System.out.println("|8-Mostrar Biblioteca                              |");
			System.out.println("|__________________________________________________|");

			int option = in.nextInt();

			switch (option) {
			case 1:
				Book livro = new Book();
				includeUp(livro);
				System.out.println("1-Inclu�do um livro no in�cio da lista");
				
				break;
			case 2:
/*				Book livro = new Book();
				System.out.println("Digite o Titulo, o nome do autor e seu estado, ano de publica��o, editora e isbn");
				livro.setTitle(in.next());
				//livro.setAuthor(livro.getAuthor().setName(in.next()),livro.getAuthor().setCountry(in.next()));
				livro.setAnoPublicacao(in.next());
				livro.setEditora(in.next());
				livro.setIsbn(in.next());
				
				includeDown(livro);				
				System.out.println("2-Inclu�do um livro no final da lista ");
*/				break;
			case 3:
				sortByAlphabet();
				System.out.println("3 - Ordenado por t�tulo");
				break;
			case 4:
				removeEnd();
				System.out.println("4 - �ltimo livro removido");
				break;
			case 5:
				
				System.out.println("5 - Tamanho da biblioteca �" + " " + sizeOfLibrary() + " " + "livros");
				break;
			case 6:
				System.out.println("Insira o n�mero do livro:");
				System.out.println("Seu livro �: " + get(in.nextInt()).toString());
				break;
			case 7:
				System.out.println("Bye !");
				choose = "n";
				break;
			case 8:
				System.out.println("Aqui est� sua biblioteca");
				mostraBiblioteca();
				break;
			default:
				System.out.println("Nao existe essa op��o, digite uma opcao valida!");

			}
		}

	}
}

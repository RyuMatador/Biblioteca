package aplication;

/*
 	1. Apresentar os títulos de todos os livros cadastrados em ordem alfabética
	2. Apresentar os títulos dos livros de um determinado autor
	3. Apresentar os títulos dos livros publicados em um determinado intervalo de anos (p.ex.: livros publicados entre 2010 e 2015)
	4. Apresentar título, autor e editora de todos os livros que contém, no seu título, uma palavra ou frase informada pelo usuário.
*/

import java.util.Scanner;

import model.Book;
import model.ListOfBooks;

public class Execucao {
	public static Scanner in = new Scanner(System.in);
	public static ListOfBooks lista = new ListOfBooks();

	public static void main(String[] args) {
		System.out.println("Digite a escolha:");
		String choose;
		choose = in.next();

		while (choose != "n") {
			System.out.println(" ____________________BIBLIOTECA____________________");
			System.out.println("|1-Incluir um livro no início                      |");
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
				Book livro1 = new Book();
				lista.includeUp(livro1);
				System.out.println("1-Incluído um livro no início da lista");
				break;
			case 2:
				Book livro2 = new Book();
				lista.includeDown(livro2);
				break;
			case 3:
				lista.sortByAlphabet();
				System.out.println("3 - Ordenado por título");
				break;
			case 4:
				lista.removeEnd();
				System.out.println("4 - Último livro removido");
				break;
			case 5:

				System.out.println("5 - Tamanho da biblioteca é" + " " + lista.sizeOfLibrary() + " " + "livros");
				break;
			case 6:
				System.out.println("Insira o número do livro:");
				System.out.println("Seu livro é: " + lista.get(in.nextInt()).toString());
				break;
			case 7:
				System.out.println("Bye !");
				choose = "n";
				break;
			case 8:
				System.out.println("Aqui está sua biblioteca");
				lista.mostraBiblioteca();
				break;
			default:
				System.out.println("Nao existe essa opção, digite uma opcao valida!");

			}
		}

	}
}

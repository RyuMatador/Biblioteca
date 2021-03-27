package aplication;

/*
 	1. Apresentar os t�tulos de todos os livros cadastrados em ordem alfab�tica
	2. Apresentar os t�tulos dos livros de um determinado autor
	3. Apresentar os t�tulos dos livros publicados em um determinado intervalo de anos (p.ex.: livros publicados entre 2010 e 2015)
	4. Apresentar t�tulo, autor e editora de todos os livros que cont�m, no seu t�tulo, uma palavra ou frase informada pelo usu�rio.
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
				Book livro1 = new Book();
				lista.includeUp(livro1);
				System.out.println("1-Inclu�do um livro no in�cio da lista");
				break;
			case 2:
				Book livro2 = new Book();
				lista.includeDown(livro2);
				break;
			case 3:
				lista.sortByAlphabet();
				System.out.println("3 - Ordenado por t�tulo");
				break;
			case 4:
				lista.removeEnd();
				System.out.println("4 - �ltimo livro removido");
				break;
			case 5:

				System.out.println("5 - Tamanho da biblioteca �" + " " + lista.sizeOfLibrary() + " " + "livros");
				break;
			case 6:
				System.out.println("Insira o n�mero do livro:");
				System.out.println("Seu livro �: " + lista.get(in.nextInt()).toString());
				break;
			case 7:
				System.out.println("Bye !");
				choose = "n";
				break;
			case 8:
				System.out.println("Aqui est� sua biblioteca");
				lista.mostraBiblioteca();
				break;
			default:
				System.out.println("Nao existe essa op��o, digite uma opcao valida!");

			}
		}

	}
}

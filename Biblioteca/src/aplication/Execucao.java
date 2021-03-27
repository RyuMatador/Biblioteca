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
	public static ListOfBooks list = new ListOfBooks();

	public static void main(String[] args) {
		System.out.println("Digite a escolha:");
		String choose;
		choose = in.next();

		while (choose != "n") {
			System.out.println("");
			System.out.println(" ____________________BIBLIOTECA____________________");
			System.out.println("|1-Incluir um livro no in�cio                      |"); //Funcional
			System.out.println("|2-Incluir um livro no final                       |"); //Funcional
			System.out.println("|3-Ordernar os livros em ordem alfabetica de titulo|"); //Meio funcional, s� compara um livro em rela��o aos outros, n�o compara todos em rela��o a todos
			System.out.println("|4-Remover livro do final da lista                 |"); //Funcional
			System.out.println("|5-Tamanho da biblioteca                           |"); //Funcional
			System.out.println("|6-Pesquisar um livro pela coloca��o               |"); //Funcional
			System.out.println("|7-Mostrar Biblioteca                              |"); //Funcional
			System.out.println("|8-Mostrar Biblioteca em ordem alfab�tica          |"); //NF
			System.out.println("|9-Pesquisa pelo nome do autor                     |"); //Funcional
			System.out.println("|10-Pesquisa pelo ano de publica��o                |"); //Funcional
			System.out.println("|11-Pesquisa por caracteres                        |"); //Funcional
			System.out.println("|12-Sair                                           |"); //Funcional
			System.out.println("|__________________________________________________|");

			int option = in.nextInt();

			switch (option) {
			case 1:
				Book livro1 = new Book();
				list.includeUp(livro1);
				System.out.println("1-Inclu�do um livro no in�cio da lista");
				break;
			case 2:
				Book livro2 = new Book();
				list.includeDown(livro2);
				System.out.println("2-Inclu�do um livro no final da lista");
				break;
			case 3:
				list.sortByAlphabet();
				System.out.println("3 - Ordenado por t�tulo");
				break;
			case 4:
				list.removeEnd();
				System.out.println("4 - �ltimo livro removido");
				break;
			case 5:
				System.out.println("5 - A biblioteca cont�m " + " " + list.sizeOfLibrary() + " " + "livro(s)");
				break;
			case 6:
				System.out.println("Insira o n�mero do livro:");
				System.out.println("Seu livro �: " + list.get(in.nextInt()).toString());
				break;
			case 7:
				System.out.println("Aqui est� sua biblioteca");
				list.showLibrary();
				break;
			case 8:
				System.out.println("Aqui est� sua biblioteca em ordem alfab�tica");
				list.showLibraryByAlphabetOrder();
				break;
			case 9:
				System.out.println("Digite o nome do autor");
				String nome = in.next();
				System.out.println("Resultado da pesquisa por autor:");
				System.out.println("Livro(s) do autor: " + nome);
				list.showBookByAuthor(nome);
				break;
			case 10:	
				System.out.println("Insira o ano inicial e final para a pesquisa:");
				Integer a = in.nextInt();
				Integer b = in.nextInt();
				System.out.println("Estes s�o os livros entre os anos " + a + " e " + b +":");
				list.showBookByYears(a,b);
				break;
			case 11:
				System.out.println("Insira os um t�tulo, uma palavra ou frase para a pesquisa");
				String frase = in.next();
				System.out.println("Aqui est� o resultado da sua pesquisa: ");
				list.search(frase);
				break;
			case 12:
				System.out.println("Bye !");
				choose = "n";
				break;
			default:
				System.out.println("N�o existe essa op��o, digite uma opcao valida!");
			}
		}
	}
}

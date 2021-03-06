package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Book;
import model.ListOfBooks;

// O TRABALHO FOI DESENVOLVIDO EM GRUPO E FOI CONVENCIONADO ENTRE OS INTEGRANTES O USO DE VARI?VEIS EM INGL?S
public class Execucao {
	public static Scanner in = new Scanner(System.in);
	public static ListOfBooks list = new ListOfBooks();
	public static String choose = null;
	public static Integer option = null;

	public static void main(String[] args) {

		System.out.println("Digite qualquer coisa para iniciar, caso deseje sair pressione 'N'.");

		choose = in.next();

		while (choose.equalsIgnoreCase("n") == false) {
			showMenu();
			try {
				readOption();
				chooseMenu(option);
			} catch (InputMismatchException e) {
				System.out.println("Caracter indevido. Insira uma das op??es do menu: ");
			} 
		}

		System.out.println("Programa Encerrado");
	}

	public static void showMenu() {
		System.out.println("");
		System.out.println(" ____________________BIBLIOTECA____________________");
		System.out.println("|1-Incluir um livro no in?cio                      |"); // Funcional
		System.out.println("|2-Incluir um livro no final                       |"); // Funcional
		System.out.println("|3-Ordernar os livros em ordem alfabetica de titulo|"); // Funcional
		System.out.println("|4-Remover livro do final da lista                 |"); // Funcional
		System.out.println("|5-Tamanho da biblioteca                           |"); // Funcional
		System.out.println("|6-Pesquisar um livro pela coloca??o               |"); // Funcional
		System.out.println("|7-Mostrar Biblioteca                              |"); // Funcional
		System.out.println("|8-Mostrar Biblioteca em ordem alfab?tica          |"); // Funcional
		System.out.println("|9-Pesquisa pelo nome do autor                     |"); // Funcional
		System.out.println("|10-Pesquisa pelo ano de publica??o                |"); // Funcional
		System.out.println("|11-Pesquisa por caracteres                        |"); // Funcional
		System.out.println("|12-Sair                                           |"); // Funcional
		System.out.println("|__________________________________________________|");
	}

	public static void chooseMenu(Integer option) {
		switch (option) {
		case 1:
			Book livro1 = new Book();
			list.includeUp(livro1);
			break;
		case 2:
			Book livro2 = new Book();
			list.includeDown(livro2);
			break;
		case 3:
			list.sortByAlphabet();
			System.out.println("3 - Ordenado por t?tulo");
			break;
		case 4:
			list.removeEnd();
			break;
		case 5:
			System.out.println("5 - A biblioteca cont?m " + " " + list.sizeOfLibrary() + " " + "livro(s)");
			break;
		case 6:
			System.out.println("Insira o n?mero do livro:");
			System.out.println("Seu livro ?: " + list.get(in.nextInt()).toString());
			break;
		case 7:
			System.out.println("Aqui est? sua biblioteca");
			list.showLibrary();
			break;
		case 8:
			System.out.println("Aqui est? sua biblioteca em ordem alfab?tica");
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
			System.out.println("Estes s?o os livros entre os anos " + a + " e " + b + ":");
			list.showBookByYears(a, b);
			break;
		case 11:
			System.out.println("Insira os um t?tulo, uma palavra ou frase para a pesquisa");
			String frase = in.next();
			System.out.println("Aqui est? o resultado da sua pesquisa: ");
			list.search(frase);
			break;
		case 12:
			System.out.println("Bye !");
			choose = "n";
			break;
		default:
			System.out.println("N?o existe essa op??o, digite uma opcao valida!");
		}
	}
	public static void readOption() {
		// ? preciso instanciar um scanner novo para que o bloco try catch n?o entre em looping por causa do valor que o option recebe do scanner in.
		Scanner scan = new Scanner(System.in);
		option = scan.nextInt();
	}
}

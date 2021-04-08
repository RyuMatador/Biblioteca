package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Book;
import model.ListOfBooks;

// O TRABALHO FOI DESENVOLVIDO EM GRUPO E FOI CONVENCIONADO ENTRE OS INTEGRANTES O USO DE VARIÁVEIS EM INGLÊS
public class Execucao {
	public static Scanner in = new Scanner(System.in);
	public static ListOfBooks list = new ListOfBooks();

	public static void main(String[] args) throws Exception {

		System.out.println("Digite qualquer coisa para iniciar, caso deseje sair pressione 'n'.");

		String choose = in.next();

		while (choose != "n") {
			showMenu();
			int option = 0;
		// try {
				option = in.nextInt();
        /*		} catch (InputMismatchException e) {
				System.out.println("Não digite letras, apenas números. Digite um número:");
			}*/
			
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
				System.out.println("3 - Ordenado por título");
				break;
			case 4:
				list.removeEnd();
				break;
			case 5:
				System.out.println("5 - A biblioteca contém " + " " + list.sizeOfLibrary() + " " + "livro(s)");
				break;
			case 6:
				System.out.println("Insira o número do livro:");
				System.out.println("Seu livro é: " + list.get(in.nextInt()).toString());
				break;
			case 7:
				System.out.println("Aqui está sua biblioteca");
				list.showLibrary();
				break;
			case 8:
				System.out.println("Aqui está sua biblioteca em ordem alfabética");
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
				System.out.println("Estes são os livros entre os anos " + a + " e " + b + ":");
				list.showBookByYears(a, b);
				break;
			case 11:
				System.out.println("Insira os um título, uma palavra ou frase para a pesquisa");
				String frase = in.next();
				System.out.println("Aqui está o resultado da sua pesquisa: ");
				list.search(frase);
				break;
			case 12:
				System.out.println("Bye !");
				choose = "n";
				break;
			default:
				System.out.println("Não existe essa opção, digite uma opcao valida!");
			}
		}
	}

	public static void showMenu() {
		System.out.println("");
		System.out.println(" ____________________BIBLIOTECA____________________");
		System.out.println("|1-Incluir um livro no início                      |"); // Funcional
		System.out.println("|2-Incluir um livro no final                       |"); // Funcional
		System.out.println("|3-Ordernar os livros em ordem alfabetica de titulo|"); // Funcional
		System.out.println("|4-Remover livro do final da lista                 |"); // Funcional
		System.out.println("|5-Tamanho da biblioteca                           |"); // Funcional
		System.out.println("|6-Pesquisar um livro pela colocação               |"); // Funcional
		System.out.println("|7-Mostrar Biblioteca                              |"); // Funcional
		System.out.println("|8-Mostrar Biblioteca em ordem alfabética          |"); // Funcional
		System.out.println("|9-Pesquisa pelo nome do autor                     |"); // Funcional
		System.out.println("|10-Pesquisa pelo ano de publicação                |"); // Funcional
		System.out.println("|11-Pesquisa por caracteres                        |"); // Funcional
		System.out.println("|12-Sair                                           |"); // Funcional
		System.out.println("|__________________________________________________|");
	}
}

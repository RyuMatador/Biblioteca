package aplication;

import java.util.Scanner;

import model.Book;

public class Execucao {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite a escolha:");
		String choose = in.next();
		
		while (choose != "n") {
		System.out.println(" ____________________BIBLIOTECA_____________________");
 		System.out.println("|1-Incluir um livro no início                      |");
 		System.out.println("|2-Incluir um livro no final                       |");
 		System.out.println("|3-Ordernar os livros em ordem alfabetica de titulo|");
 		System.out.println("|4-Remover livro do final da lista                 |");
 		System.out.println("|5-Tamanho da biblioteca                           |");
 		System.out.println("|6-Pesquisar um livro                              |");
 		System.out.println("|7-Sair                                            |");
 		System.out.println("|__________________________________________________|");
		
		int option = in.nextInt();
		
		switch(option) {
		  case 1:
			 	
			 	System.out.println("1-Incluído um livro no início");
				break;
		  case 2:
			  	
			  	System.out.println("2-Incluído um livro no final ");
		    	break;
		  case 3:
			  	
			  	System.out.println("3 - Ordenado por título");
		  	break;
		  case 4:
			  	
			  	System.out.println("4 - Último livro removido");
		  	break;
		  case 5:
			  	System.out.println("5 - Tamanho da biblioteca é" + "/*value.size()*/" + "livros");
		  	break;
		  case 6: 
			  	System.out.println("Seu livro é:");
			  	
			break;
		  case 7: 
			  	System.out.println("Bye !");
			  	choose = "n";
			break;
		  default:
		 	System.out.println("Nao existe essa opção, digite uma opcao valida!");
			
		 }
		}
	
	}
}

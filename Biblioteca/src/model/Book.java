package model;

public class Book implements Comparable<Book>{
	private String title;
	private String isbn;
	private Author author;
	private String editora;
	private String anoPublicacao;
	
	public Book(String title, String isbn, Author author, String editora, String anoPublicacao) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
	}
	
	public Book() {
	
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	@Override
	public String toString() {
		return "Livro [title=" + title + ", isbn=" + isbn + ", authorName=" + this.author.getName() + "," + "authorCountry" + "," + this.author.getCountry() + "," + "editora=" + editora
				+ ", anoPublicacao=" + anoPublicacao + "]";
	}
	@Override
	public int compareTo(Book o) {
		return this.author.getName().compareTo(o.getAuthor().getName());
	}
	
}

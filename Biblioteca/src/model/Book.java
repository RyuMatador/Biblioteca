package model;

public class Book implements Comparable<Book>{
	private String title;
	private String isbn;
	private Author author;
	private String editora;
	private Integer anoPublicacao;
	
	public Book(String title, String isbn, Author author, String editora, Integer anoPublicacao) {
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
	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	@Override
	public String toString() {
		return "Livro [Título=" + title + 
				", Nome do Autor=" + this.author.getName() + 
				", Nacionalidade do Autor=" + "," + this.author.getCountry() +
				", Ano de Publicação=" + anoPublicacao + 
				", Editora=" + editora +
				", ISBN=" + isbn +"]";
	}
	@Override
	public int compareTo(Book o) {
		return this.author.getName().compareTo(o.getAuthor().getName());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (anoPublicacao == null) {
			if (other.anoPublicacao != null)
				return false;
		} else if (!anoPublicacao.equals(other.anoPublicacao))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (editora == null) {
			if (other.editora != null)
				return false;
		} else if (!editora.equals(other.editora))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}

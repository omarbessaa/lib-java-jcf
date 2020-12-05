package omar.bessaa.jcf;

public class Book implements Comparable<Book>{
	private String isbn;
	private String title;
	private String author;
	
	
	public Book(String isbn, String title, String author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}


	public String getIsbn() {
		return isbn;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	@Override
	public String toString() {
		return "(isbn : " + isbn + ", title : " + title + ", author : " + author + ")";
	}


	@Override
	public boolean equals(Object obj) {
		Book b = (Book) obj;
		
		return this.isbn.equals(b.getIsbn());
	}


	@Override
	public int hashCode() {
		return this.isbn.hashCode();
	}

//*************************************** for sort ***********************
	@Override
	public int compareTo(Book bk) {
		return this.isbn.compareTo(bk.getIsbn());
	}
	
	

}

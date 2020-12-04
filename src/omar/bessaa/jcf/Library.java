package omar.bessaa.jcf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Library {

	private Map<String, Book> books = new HashMap<>();

	public Library() {

	}

	public boolean addBook(Book book) {
		// book exists
		if (books.containsKey(book.getIsbn()))
			return false;

		books.put(book.getIsbn(), book);
		return true;
	}

	public boolean removeBook(String isbnIn) {
		// book exists
		if (books.containsKey(isbnIn)) {
			books.remove(isbnIn);
			return true;
		} else
			return false;
	}

	public int getTotalNumberOfBooks() {
		return books.size();
	}

	public Book getBook(String isbnIn) {
		return books.get(isbnIn);
	}

	public Set<Book> getAllBooks() {
		Set<Book> booksSet = new HashSet<Book>();

		for (String book : books.keySet()) {
			booksSet.add(books.get(book));
		}

		return booksSet;
/*
		// an other solution
		Iterator<Book> bk = books.values().iterator();
		while (bk.hasNext()) {
			Book item = bk.next();
			booksSet.add(item);
		}

		return booksSet; */
	}
}

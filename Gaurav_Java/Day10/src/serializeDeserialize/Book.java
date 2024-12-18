package serializeDeserialize;

import java.io.Serializable;

public class Book implements Serializable {
	private transient int bookId; //Never get serialize or persist or write to Byte-Stream
	private String name;
	public Book(int bookId, String name) {
		super();
		this.bookId = bookId;
		this.name = name;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

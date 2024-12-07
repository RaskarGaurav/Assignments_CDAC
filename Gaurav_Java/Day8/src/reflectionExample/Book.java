package reflectionExample;

public class Book {
	private int bookId;
	private String name;
	public Book() {
		super();
		bookId = 0;
		name = "Unknown";
	}
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
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + "]";
	}
	
	
	
	
	
}


public class CH08_History extends CH08_Book {

	private int id;
	private String bookName;
	private String author;

	public CH08_History(){}
	
	public CH08_History(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
		increaseCount();
		id = getCount();
	}
	
	@Override
	public void print() {
		System.out.println("<<<History>>>");
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Id: "+ id +"\nBook Name: "+ bookName+ "\nAuthor: "+ author;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


}


public class CH08_Science extends CH08_Book {

	private int id;
	private String bookName;
	private String publisher;

	public CH08_Science(){}
	
	public CH08_Science(String bookName, String publisher) {
		this.bookName = bookName;
		this.publisher = publisher;
		increaseCount();
		id = getCount();
	}
	
	@Override
	public void print() {
		System.out.println("<<<Science>>>");
		System.out.println(toString());
	}

	@Override
	public String toString() { 

		return "Id: "+ id +"\nBook Name: "+ bookName + "\nPublisher: " + publisher;
	
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}

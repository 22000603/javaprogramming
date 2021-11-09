
public class CH08_Book {

	private int id;
	private String bookName;
	private static int count=0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static void increaseCount() {
		setCount(getCount() + 1);
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		CH08_Book.count = count;
	}
	
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public CH08_Book(){}
	
	public CH08_Book(String bookName) {
		this.bookName = bookName;
		increaseCount();
		id = getCount();
	}
	
	public void print() {
		System.out.println("<<<BOOK>>>");
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Id: "+ id +"\nBook Name: "+ bookName;
	}
	
	public static void main(String[] args) {
		
		CH08_Book book = new CH08_Book("Simple Book");
		CH08_Science science = new CH08_Science("Hello Physics!","ScienceWorld");
		CH08_History history1 = new CH08_History("What is history?","E.H.Carr");
		CH08_History history2 = new CH08_History("What is history? ver 2","E.H.Carr");
		book.print();
		science.print();
		history1.print();
		history2.print();
		
	}

	
	
	

}

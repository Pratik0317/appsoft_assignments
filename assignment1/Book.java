package assignment1;

public class Book {

	private  String title;
	private String author;
	private double price;
	private String  publisher;
	private double ISBN;
	public Book(String title, String author, double price, String publisher, double iSBN) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.ISBN = iSBN;
	}
	public Book() {
	
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getISBN() {
		return ISBN;
	}
	public void setISBN(double iSBN) {
		ISBN = iSBN;
	}
	
}

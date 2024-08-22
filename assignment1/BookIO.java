package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BookIO {

	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	public List<Book> readBook() throws IOException{
		List<Book> bookList = new ArrayList<>();
		System.out.println("Enter the number of Book List you want to add: ");
		int num = Integer.parseInt(bufferedReader.readLine());
		for(int i=0;i<num;i++) {
			
		System.out.println("Enter Book Title:");
		String title = bufferedReader.readLine();
		
		System.out.println("Enter Book Author's Name: ");
		String author = bufferedReader.readLine();
		
		System.out.println("Enter Price of Book: ");
		double price = Double.parseDouble(bufferedReader.readLine());
		
		System.out.println("Enter Publisher's Name: ");
		String publisher = bufferedReader.readLine();
		
		System.out.println("Enter ISBN number: ");
		double isbn = Double.parseDouble(bufferedReader.readLine());
		
		bookList.add(new Book(title, author, price, publisher, isbn));
		
		}
		return bookList;
	}
	
	public void displayBook(List<Book> bookList) {
		for(Book book: bookList) {
			System.out.println("Title: "+book.getTitle().toString()+" Author: "+book.getAuthor()+
					" Price: "+book.getPrice()+" Publisher: "+book.getPublisher()+" ISBN: "+book.getISBN());
		}
	}
	
	public double totalBook(List<Book> bookList) {
		double totalBook = 0;
		for(int i=0;i<bookList.size();i++) {
			totalBook++;
		}
		return totalBook;
	}
	
	public double totalCost(List<Book> bookList) {
		double totalPrice = 0;
		for(Book book: bookList) {
			totalPrice = totalPrice+book.getPrice();
		}
		return totalPrice;
	}
	
}

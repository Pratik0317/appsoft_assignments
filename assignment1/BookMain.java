package assignment1;

import java.io.IOException;
import java.util.List;

public class BookMain {
public static void main(String[] args) throws IOException {
	
	BookIO bookIO = new BookIO();
	List<Book> bookList =  bookIO.readBook();
	bookIO.displayBook(bookList);
	
	double totalBook = bookIO.totalBook(bookList);
	System.out.println("The total number of books: "+totalBook);
	
	double totalCost = bookIO.totalCost(bookList);
	System.out.println("The total cost of a book: "+totalCost);
	
    double maxCost = 0;
	for(Book book: bookList) {
		if(book.getPrice()>maxCost) {
			maxCost = book.getPrice();
		}
	}
	System.out.println("The maximum cost of a book: "+maxCost);
	
	double minCost = 0;
	for(Book book: bookList) {
		if(maxCost>=book.getPrice()) {
			minCost = book.getPrice();
		}
	}
	
	System.out.println("The minimum cost of a book: "+minCost);
	
	double avgCost = totalCost/totalBook;
	System.out.println("The average cost of a book: "+avgCost);
}
}

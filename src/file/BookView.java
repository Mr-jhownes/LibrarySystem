package file;

import java.util.ArrayList;
import java.util.Scanner;

import readerSession.Reader;
import readerSession.SearchReader;

/**
 * @author Jonathan Santos
 *
 */
public class BookView {
	// this method has the recordBook with all the data
	public BookView(ArrayList<Books> recordBook, ArrayList<Reader> records) {

		// scanner to take input from user 
		Scanner options = new Scanner(System.in);
		Scanner names = new Scanner(System.in);
		int select;
		String name;
		
		try {
		
		do {
			
		System.out.println("--Book Session--");
		
		System.out.println("1 - List all the books by title");
		
		System.out.println("2 - List all the books by Author");
		
		System.out.println("3 - Search book by title or author");
		
		System.out.println(("4 - Return to menu"));
		
		while(!options.hasNextInt()) {
			
			System.out.println("Please enter one of the numbers given");
			options.next();
		}
		select = options.nextInt();
		
		}while(select < 0 || select > 4);
		
		
		
		//statement to react for each of the options given to user
		if(select == 1) {
			
			BookList listTitle = new BookList();
			listTitle.bookSortedTitle(recordBook);
			System.out.println("");
			new BookView(recordBook, records);
		 
		}
		
		else if(select == 2) {
			
			BookList listAuthor = new BookList();
			listAuthor.bookSortedAuthor(recordBook);
			System.out.println("");
			new BookView(recordBook, records);
		 
		}
		// if number 3 open the SearchBook class sending the parameters take from user and the recordBook array list
		else if(select == 3){
			System.out.println("Enter the Title or the name of the author:");
			name = names.nextLine();
			
			new SearchBook(recordBook, name);
			
			new BookView(recordBook, records);
			
		}
		else if(select == 4) {
			
			new Display (records, recordBook);
	}
	
		}catch(Exception e) {
			System.out.println("A error happened during execution contact support");
		}
	}

	}
	
	


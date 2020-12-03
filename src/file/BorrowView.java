package file;

import java.util.ArrayList;
import java.util.Scanner;

import readerSession.Reader;
import readerSession.ReaderSorted;
import readerSession.ReaderView;
import readerSession.SearchReader;

/**
 * @author Jonathan Santos
 *
 */
public class BorrowView {

	public BorrowView(ArrayList<Borrowed> recordBorrow, ArrayList<Reader> records, ArrayList<Books> recordBook, ArrayList<Returned> recordReturned) {
		
		//scanner to take the inputs
		Scanner options = new Scanner(System.in);
		Scanner readerId = new Scanner(System.in);
		Scanner bookTitle = new Scanner(System.in);
			
		int selected;
		int id;
		String title;
		
		try {
		
		do {
			System.out.println("--Borrowing Session--");
			System.out.println("1 - Register borrowing book");
			System.out.println("2 - Register book returned");
			System.out.println("3 - List books of a reader");
			System.out.println(("4 - Return to menu"));
				
		while(!options.hasNextInt()) {
			System.out.println("Please enter one of the numbers given");
			options.next();			
			}
				
			selected = options.nextInt();
		}while(selected < 1 || selected > 4);		
			
				
				
		if(selected == 1) {
			
			new registerBorrow(recordBorrow, records, recordBook);
			
		}
			
		else if(selected == 2) {
				
			
			new registerReturn(recordBorrow);		
				 		 
			}
		else if(selected == 3){
			
			System.out.println("Enter the ID of the reader:");
			
			while(!readerId.hasNextInt()) {
				System.out.println("Please only enter numbers for IDs");
			}
			id = readerId.nextInt();
			
			new ReaderBooks(recordReturned, id);
			
			new BookView(recordBook);
			
			
			
					
			}
		else if(selected == 4) {
					
			new Main();
		}
			
		}catch(Exception e) {
			System.out.println("something is wrong here");
				}
			}
			
			
		
	}
	



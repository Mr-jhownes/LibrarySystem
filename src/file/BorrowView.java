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

	public BorrowView(ArrayList<Borrowed> recordBorrow, ArrayList<Reader> records, ArrayList<Books> recordBook) {
		
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
			System.out.println("2 - List all the books borrowed");
			System.out.println("3 - Search reader by name");
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
				
			ReaderSorted alpha = new ReaderSorted();
			alpha.readerSortedAlphabetical(records);
			new ReaderView(records);
					
				 		 
			}
//		else if(selected == 3){
//			System.out.println("Enter the name or surname of the user:");
//			name = names.nextLine();
//					
//			new SearchReader(records, name);
//			new ReaderView(records);
//					
//			}
		else if(selected == 4) {
					
			new Main();
		}
			
		}catch(Exception e) {
			System.out.println("something is wrong here");
				}
			}
			
			
		
	}
	



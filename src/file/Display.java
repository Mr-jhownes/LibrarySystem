package file;
import java.util.ArrayList;
import java.util.Scanner;

import readerSession.Reader;
import readerSession.ReaderView;


/**
 * @author Jonathan Santos
 *
 */
public class Display {

	
	public Display(ArrayList<Reader> records, ArrayList<Books> recordBook, ArrayList<Borrowed> recordBorrow) { 
	
		
	
		//using scanner to the user type the number they want to choose
		Scanner option = new Scanner(System.in);

		// using a try and catch error in case the user mistype the numbers
		try {
			
			//declaring variable outside the loop so it can be used outside
			int selected;
			
			//do while loop to validade that the user input number
		do{
			
			
		System.out.println("--Welcome to library system--");
		System.out.println("Type your option:");
		System.out.println("1 - Book Options");
		System.out.println("2 - Reader options");
		System.out.println("3 - Borrowing options");
		
		
		
	
		 while(!option.hasNextInt()) {
			
			System.out.println("Please enter 1 for Books, 2 for Readers ");
			option.next();
			
		}
		
		 selected = option.nextInt();
			
		}while(selected != 1 && selected != 2 && selected != 3);
	
		if(selected == 1) {
			
			new BookView(recordBook);
			
		}
		else if(selected == 2) {
			
			new ReaderView(records);
		}
		else if(selected == 3) {
			
			new BorrowView(recordBorrow, records, recordBook);
		}
		
			
		}catch (Exception e) {
			System.out.println("something went wrong");
		}
				
				
		
	}


}

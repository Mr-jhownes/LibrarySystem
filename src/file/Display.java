package file;
import java.util.ArrayList;
import java.util.Scanner;

import readerSession.Reader;
import readerSession.readerView;


/**
 * @author Jonathan Santos
 *
 */
public class Display {

	
	public Display(ArrayList<Reader> records, ArrayList<Books> recordBook) { 
	
		
	
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
		
		
	
		 while(!option.hasNextInt()) {
			
			System.out.println("Please enter 1 for Books or 2 for Readers 2");
			option.next();
			
		}
		
		 selected = option.nextInt();
			
		}while(selected != 1 && selected != 2);
		
		
		
		
		if(selected == 1) {
			
			new BookView(recordBook, records);
			
			
		}
		else if(selected == 2) {
			
			new readerView(records, recordBook);
		}
		
		}catch (Exception e) {
			System.out.println("something went wrong");
		}
				
				
		
	}


}

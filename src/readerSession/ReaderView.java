package readerSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import file.Books;
import file.Display;
import file.Main;
/**
 * @author Jonathan Santos
 *
 */

public class ReaderView {

	public ReaderView(ArrayList<Reader> records) {
		
		
		//scanner to take the inputs
		Scanner options = new Scanner(System.in);
		Scanner names = new Scanner(System.in);
		
		int selected;
		String name;
		
		try {
		
		do {
		System.out.println("--Reader Session--");
		System.out.println("1 - List all the readers by ID");
		System.out.println("2 - List all the readers by Name");
		System.out.println("3 - Search reader by name");
		System.out.println(("4 - Return to menu"));
		
		while(!options.hasNextInt()) {
			System.out.println("Please enter one of the numbers given");
			options.next();			
		}
		
		selected = options.nextInt();
		}while(selected < 1 || selected > 4);		
		
		
		
		if(selected == 1) {
			
			ReaderSorted id = new ReaderSorted();
			id.readerSortedId(records);
			new ReaderView(records);
			
		 		 
		}
		else if(selected == 2) {
			
			ReaderSorted alpha = new ReaderSorted();
			alpha.readerSortedAlphabetical(records);
			new ReaderView(records);
			
		 		 
		}
		else if(selected == 3){
			System.out.println("Enter the name or surname of the user:");
			name = names.nextLine();
			
			new SearchReader(records, name);
			new ReaderView(records);
			
		}
		else if(selected == 4) {
			
			new Main();
	}
	
		}catch(Exception e) {
			System.out.println("something is wrong here");
		}
	}
	
	
	
	
}

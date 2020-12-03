/**
 * 
 */
package file;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jonathan
 *
 */
public class ReaderBooks {

	/**
	 * @param recordReturned
	 * @param id 
	 */
	public ReaderBooks(ArrayList<Returned> recordReturned, int id) {
		
		int tst = 0;
		
		for (int i = 0; i < recordReturned.size(); i++) {
			
			if(recordReturned.get(i).getId() == id) {
				tst = recordReturned.get(i).getId();
				System.out.println("The Reader: " + recordReturned.get(i).getReader() + " read: " + recordReturned.get(i).getTitle());
				
			}
		}
		
		if(tst == 0) {
			
			System.out.println("**This reader haven't borrowed any book or the ID doesn't exist** \n");
			
		}
		
	}

}

/**
 * 
 */
package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jonathan
 *
 */
public class registerReturn {
	
	public registerReturn(ArrayList<Borrowed> recordBorrow) {
		
		
		Scanner myScan = new Scanner(System.in);
		
		
		System.out.println("Enter the book title:");
		
		String theBook = myScan.next();
		
		int index = checkBorrow(recordBorrow, theBook);
		String titleBook = recordBorrow.get(index).getTitle();
		String regisDevo = recordBorrow.get(index).getId() + "," + recordBorrow.get(index).getReader() + "," + recordBorrow.get(index).getTitle();
		
		System.out.println("Do you want to return the book? : yes or no");
		
		String confirmReturn = myScan.next();
		
		if(confirmReturn.equalsIgnoreCase("yes")) {
			
		returnBook(titleBook);
		
		bookReturned(regisDevo);
		
		}
		
		else {
			new Main();
			
	}
		
		
	}

	/**
	 * @param regisDevo
	 */
	private void bookReturned(String regisDevo) {
		
		try{    
	         BufferedWriter fw =new BufferedWriter(new FileWriter("returned.txt", true));    
	           
	           fw.write(regisDevo);  
	           fw.newLine();
	           fw.close();    
	           System.out.println("Book Returned.");
	           System.out.println("---------------------------");
	          }catch(Exception e){System.out.println(e);}    
	          new Main();   
	     }    
	
		
	

	/**
	 * @param titleBook
	 */
	private void returnBook(String titleBook) {
	   
		try {
	        


	                StringBuffer newContent = new StringBuffer();

	                BufferedReader br = new BufferedReader(new FileReader("borrow.txt"));
	                String line;
					while ((line = br.readLine()) != null) {
	                    if (!line.trim().contains(titleBook)) {
	                        newContent.append(line);
	                        newContent.append("\n"); // new line

	                    }
	                }
	                    br.close();

	                FileWriter removeLine = new FileWriter("borrow.txt");
	                BufferedWriter change = new BufferedWriter(removeLine);
	                PrintWriter replace = new PrintWriter(change);
	                replace.write(newContent.toString());
	                replace.close();

	    }

	     catch (Exception e) {
	        e.printStackTrace();
	    }

	}
		
	

	/**
	 * @param titleBook
	 */


	/**This is method will check wether if there is a title borrowed
	 * @param recordBorrow
	 * @param theBook 
	 */
	private static int checkBorrow(ArrayList<Borrowed> recordBorrow, String theBook) {
		
		for(int i = 0; i < recordBorrow.size(); i++) {
			
			if(recordBorrow.get(i).getTitle().contains(theBook)) {
				
				return i;
			}
		}
		
		return -1;
		
		
	}

}

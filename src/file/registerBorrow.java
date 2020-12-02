/**
 * 
 */
package file;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import readerSession.Reader;

/**
 * @author Jonathan
 *
 */
public class registerBorrow {

	/**
	 * @param recordBorrow
	 * @param records
	 * @param recordBook
	 */
	public registerBorrow(ArrayList<Borrowed> recordBorrow, ArrayList<Reader> records, ArrayList<Books> recordBook) {
		
		
		
		
		Scanner brw = new Scanner(System.in);
		Scanner rdr = new Scanner(System.in);
		int readerId;
		String bookTitle;
		
		System.out.println("Please entender the Id of the user:");
		
		while(!brw.hasNextInt()) {
		System.out.println("Enter the reader Id");
		brw.next();
		
		}
		readerId = brw.nextInt();
		
		int index = checkId(records, readerId);
		
		int idReader = records.get(index).getId();
		String getinfo = records.get(index).getName() + " " + records.get(index).getSurname();
		
		System.out.println("The id is from the User:" + getinfo);
		System.out.println("");		
		System.out.println("Enter the title of the book");
		
		bookTitle = brw.next();
		
		int indexTwo = checkTitle(recordBook, bookTitle);
		
		
		String getinfo2 = recordBook.get(indexTwo).getTitle();
		
		if(indexTwo == -1) {
			
			System.out.println("Title not found \n");
			
		}
		System.out.println(getinfo2);
		
		Boolean check = checkAvailability(getinfo2, recordBorrow);
			
		
		if(check == true) {
			
			System.out.println("The book is already borrowed \n" );
			new registerBorrow(recordBorrow, records, recordBook);
			
		}
			
		System.out.println(getinfo2 + "\n");
		System.out.println("---------------------------");
		
		
		regisInfo(idReader, getinfo, getinfo2);
		
				
		}
	

	/**
	 * @param getinfo2 
	 * @param indexTwo
	 * @param recordBorrow
	 */
	private Boolean checkAvailability(String getinfo2, ArrayList<Borrowed> recordBorrow) {
		
		
		
		for (int k = 0; k < recordBorrow.size(); k++) {
			
			if(recordBorrow.get(k).getTitle().equals(getinfo2)) {
				
				return true;
			}
			
		}

		return false;
		
}


	/**
	 * @param idReader 
	 * @param getinfo
	 * @param getinfo2
	 */
	private void regisInfo(int idReader, String getinfo, String getinfo2) {
		
		try{    
	         BufferedWriter fw =new BufferedWriter(new FileWriter("borrow.txt", true));    
	           
	           fw.write(idReader +"," + getinfo + "," + getinfo2 + ",borrowed");  
	           fw.newLine();
	           fw.close();    
	           System.out.println("Book Borrowed successfuly");
	           System.out.println("---------------------------");
	          }catch(Exception e){System.out.println(e);}    
	          new Main();   
	     }    
	

	/**
	 * @param records
	 * @param bookTitle
	 * @return 
	 */
	private static int checkTitle(ArrayList<Books> recordBook, String bookTitle) {
		
		for(int i = 0; i < recordBook.size(); i++) {
			
			 if(recordBook.get(i).getTitle().contains(bookTitle)) {
			 //recordBook.get(i).getTitle() ;
			 //avail = recordBook.get(i).getAvailability();
			 return i;
			 }
			}
		return -1;
	}

	/**
	 * @param records
	 * @param readerId 
	 * @return 
	 */
	private static int checkId(ArrayList<Reader> records, int readerId) {
		
		int test = 0;
		String name = null;
		
		for(int i = 0; i < records.size(); i++) {
			
			if(records.get(i).getId() == readerId) {
			test = records.get(i).getId() ;
			return i;
			
		}
		
		}
		if(test == 0) {
			
			System.out.println("Id not found");
		}
		
		
		return -1;

	}
}

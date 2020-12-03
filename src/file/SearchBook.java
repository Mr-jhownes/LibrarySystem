package file;

import java.util.ArrayList;
/**
 * @author Jonathan Santos
 *
 */
public class SearchBook {

	public SearchBook(ArrayList<Books> recordBook, String name) {
		
		seacher(recordBook, name);
	}
		
		
		public void seacher(ArrayList<Books> recordBook, String name) {
			
			System.out.println("");
			System.out.println("Search Results:");
			// Going one by one the elements in the array
	      for(int i = 0; i < recordBook.size(); i++){
	            //System.out.println("Testing: " + array.get(i).getName());
	           // When the element is found, stop the loop and return the index
	    	  
	            if(recordBook.get(i).getAuthor().contains(name)) {
	            	System.out.println("ID:" + recordBook.get(i).getId() + ", " + 
	                recordBook.get(i).getAuthor() + ", " + 
	            	recordBook.get(i).getTitle() + ", " + 
	                recordBook.get(i).getYear());
	            		            	
	            }
	                       

            else if(recordBook.get(i).getTitle().contains(name)) {
            		System.out.println("ID:" + recordBook.get(i).getId() + ", " + 
                    recordBook.get(i).getTitle() + ", " + 
            		recordBook.get(i).getAuthor());
                    
            	}
            }
	      
	      System.out.println("");
	      
	        }
	      
	    }
		
	



package readerSession;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Jonathan Santos
 *
 */
public class SearchReader {
	

	public SearchReader(ArrayList<Reader> records, String name) {
		
		//running the method search
		search(records, name);
		
	
	}
	
	//method which will receive the record from reader, and taking the input from the user
	public void search(ArrayList<Reader> recordReader, String name) {
        
		String nameSearch = "empty";
		
		System.out.println("Result:");
    	
        // looping through the recordReader array
      for(int i = 0; i < recordReader.size(); i++){
           
    	  
           //As it is possible to have a user with the same name the loop is running till the end, making sure to get every reader
            if(recordReader.get(i).getName().equalsIgnoreCase(name)){
               
            nameSearch = recordReader.get(i).getName();
            	//printing all the information using get from getReader
            	System.out.println("ID:" + recordReader.get(i).getId() + ", " +
            			recordReader.get(i).getName()  + " " +
            			recordReader.get(i).getSurname() + ", " +
            			recordReader.get(i).getAge() + ", " +
            			recordReader.get(i).getAddress() );
            	
            }
            else if(recordReader.get(i).getSurname().equalsIgnoreCase(name)) {
            	System.out.println("ID:" + recordReader.get(i).getId() + ", " +
            			recordReader.get(i).getName()  + " " +
            			recordReader.get(i).getSurname() + ", " +
            			recordReader.get(i).getAge() + ", " +
            			recordReader.get(i).getAddress() );
         	
            	
            }
        }
      	
      if(nameSearch.equals("empty")) {
       //by the end of the loop the program will return to the readerView
      			System.out.println("**Reader not found** \n");
      }	
      	
      
    }
 
}

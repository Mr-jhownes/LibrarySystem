package file;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import readerSession.Reader;

/**
 * @author Jonathan Santos
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		new Main();
		
	}
	
	public Main() {
		
	//loading the data when running the program
		ArrayList<Reader> records = new ArrayList<Reader>();
		ArrayList<Books> recordBook = new ArrayList<Books>();
		ArrayList<Borrowed> recordBorrow = new ArrayList<Borrowed>();
		
		//executing the methods
		readerList(records);
		booksList(recordBook);
		borrowList(recordBorrow);
		
		//
		System.out.println(recordBorrow);
		
		//after the load is done send them to the Display class
		new Display(records, recordBook, recordBorrow);
		
	}
	//taking data from the text file and putting into the array list
	public static ArrayList<Reader> readerList(ArrayList<Reader>records) {
        
        
        
        try {
        	
            BufferedReader br = new BufferedReader(new FileReader("reader.txt"));
            String contentLine = br.readLine();
            //variables to store the data
            String[] data;
            int id;
            String name;
            String surname;
            int age;
            String gender;
            String address;
            
            
            while (contentLine != null) {
                
                data = contentLine.split(",");
                id = Integer.parseInt(data[0]);
                name = data[1];
                surname = data[2];
                age = Integer.parseInt(data[3]);
                gender = data[4];
                address = data[5];
                // adding the record to class getReader which will handle them
                records.add(new Reader(id, name, surname, age, gender, address));
                contentLine = br.readLine();
                
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return records;
    }
	//method to take the books from the txt file
	public static ArrayList<Books> booksList(ArrayList<Books>recordBook){
		
try {
        	//reading the file
            BufferedReader bookFile = new BufferedReader(new FileReader("books.txt"));
            String contentLine = bookFile.readLine();
            
            String[] data;
            int id;
            String title;
            String author;
            int year;
            String availability;
            
            
            while (contentLine != null) {
                //inserting the content into array
                data = contentLine.split(",");
                id = Integer.parseInt(data[0]);
                title = data[1];
                author = data[2];
                year = Integer.parseInt(data[3]);
                availability = data[4];
                
                //adding using the class getBooks
                recordBook.add(new Books(id, title, author, year, availability));
                contentLine = bookFile.readLine();
                
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      		
		return recordBook;
		
	}
	
	public static ArrayList<Borrowed> borrowList(ArrayList<Borrowed>recordBorrow){
		
		try {
        	//reading the file
            BufferedReader borrowFile = new BufferedReader(new FileReader("borrow.txt"));
            String contentLine = borrowFile.readLine();
            
            String[] data;
            int id;
            String reader;
            String title;
            String availability;
           
            
            
            while (contentLine != null) {
                //inserting the content into array
                data = contentLine.split(",");
                id = Integer.parseInt(data[0]);
                reader = data[1];
                title = data[2];
                availability = data[3];
                
                
                //adding using the class getBooks
                recordBorrow.add(new Borrowed(id, reader, title, availability));
                contentLine = borrowFile.readLine();
                
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		return recordBorrow;
		
	}
	
}


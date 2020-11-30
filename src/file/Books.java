package file;

/**
 * @author Jonathan Santos
 *
 */
public class Books {
	
	private int id;
    private String title;
    private String author;
    private int year;
    private String availability;
    
    public Books(int id,String title, String author, int year, String availability) {
    	
    	this.id = id;
    	this.title = title;
    	this.author = author;
    	this.year = year;
    	this.availability = availability;
    	
    }

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}
	public String getAvailability() {
		return availability;
	}
    
	@Override
	public String toString() {
		
		return this.id + " " + this.title + " by " + this.author + " " + this.year ;
		
	}

}

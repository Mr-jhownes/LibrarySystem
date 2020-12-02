/**
 * 
 */
package file;

/**
 * @author Jonathan
 *
 */
public class Borrowed {
	
	int id;
	String reader;
	String title;
	String availability;
	
	public Borrowed(int id, String reader, String title, String availability) {
		
		this.id = id;
		this.reader = reader;
		this.title = title;
		this.availability = availability;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReader() {
		return reader;
	}

	public void setReader(String reader) {
		this.reader = reader;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		
		return this.id + " " + this.reader +" "+  this.title + " " + this.availability ;
		
	}

}

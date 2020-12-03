/**
 * 
 */
package file;

/**
 * @author Jonathan
 *
 */
public class Returned {
	
	int id;
	String reader;
	String title;
	
	public Returned(int id, String reader, String title) {
		
		this.id = id;
		this.reader = reader;
		this.title = title;
		
		
	}

	public int getId() {
		return id;
	}

	public String getReader() {
		return reader;
	}

	public String getTitle() {
		return title;
	}

}

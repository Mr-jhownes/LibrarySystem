/**
 * 
 */
package file;

import java.util.ArrayList;

/**
 * @author Jonathan
 *
 */
public class BookSorted {

	/**
	 * @param recordBook
	 */
	public void bookSortedTitle(ArrayList<Books> recordBook) {
		
		ArrayList<Books> tmp = new ArrayList<>();
		
		String bookOne, bookTwo;
		
		System.out.println("--Books Sorted by Title--");
		
		for(int i = 0; i < recordBook.size(); i++) {
			for(int j = i + 1; j < recordBook.size(); j++) {
				
				bookOne = recordBook.get(i).getTitle();
				bookTwo = recordBook.get(j).getTitle();
				
				if((bookOne.compareToIgnoreCase(bookTwo)) > 0) {
					
					tmp.add(recordBook.get(i));
					recordBook.set(i, recordBook.get(j));
					recordBook.set(j, tmp.get(0));
					tmp.clear();
					
				}
			}
		}
		
		for(Books i: recordBook) {
			System.out.println(i);
		}
		
		
	}
	
	public void bookSortedAuthor(ArrayList<Books> recordBook) {
		
		ArrayList<Books> tmp = new ArrayList<>();
		String bookOne, bookTwo;
		
		System.out.println("--Books Sorted By Author--");
		
		for(int i = 0; i < recordBook.size(); i++) {
			for(int j = i + 1; j < recordBook.size(); j++) {
				
				bookOne = recordBook.get(i).getAuthor();
				bookTwo = recordBook.get(j).getAuthor();
				
				if((bookOne.compareToIgnoreCase(bookTwo)) > 0) {
					
					tmp.add(recordBook.get(i));
					recordBook.set(i, recordBook.get(j));
					recordBook.set(j, tmp.get(0));
					tmp.clear();
					
				}
				
			}
		}
			for(int k = 0; k < recordBook.size(); k++){
				
				System.out.println("Author:" + recordBook.get(k).getAuthor() + ", Book: " + 
				recordBook.get(k).getTitle() + ", ID " + 
				recordBook.get(k).getId());
				
			}
		
		
}

}

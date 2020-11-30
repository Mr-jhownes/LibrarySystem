/**
 * 
 */
package readerSession;

import java.util.ArrayList;

/**
 * @author Jonathan
 *
 */
public class ReaderSorted {
	
	/**
	 * @param records
	 */


	public void readerSortedId(ArrayList<Reader> records) {
		
		System.out.println("--- Readers Sorted by ID---");
				
		for(int i = 0; i < records.size(); i++){
			
			Reader  myIds = records.get(i);
			int j = i;
			
			while((j > 0) && (records.get(j - 1).getId() > myIds.getId())) {
			
				records.set(j, records.get(j - 1));
				j--;
			}	
			records.set(j, myIds);
	}
		for(Reader i: records) {
			System.out.println(i);
		}
	
	}
	
	public void readerSortedAlphabetical(ArrayList<Reader> records) {
	
		
		System.out.println("---Readers Sorted by Alphabetical order---");
		
		 ArrayList<Reader> tmp = new ArrayList<>();
		String readerOne, readerTwo;
		
		for(int i = 0; i < records.size(); i++) {
			for(int j = i + 1; j < records.size(); j++){
				
				readerOne = records.get(i).getName();
				readerTwo = records.get(j).getName();
				
				if((readerOne.compareToIgnoreCase(readerTwo)) > 0) {
					
					
					 
					tmp.add(records.get(i));
					records.set(i, records.get(j));
					records.set(j, tmp.get(0));
					tmp.clear();
					
					
				}
				
			}
		}	
			for(Reader i: records) {
			System.out.println(i);
		
			}
	
}
}


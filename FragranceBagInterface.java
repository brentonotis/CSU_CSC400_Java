package fragrance;

/**
 * Fragrance Bag interface for fragrance pkg/FragaranceBagDemo
 * @author Brenton Otis
 */

public interface FragranceBagInterface<T> {
	
	/** Adds new entry to the bag 
	 * @param newEntry object to be added to the bag
	 * @return True if new entry was successful, false if not */
	public boolean add(T newEntry);
	
	/** Gets all entries in bag (by putting into an array)
	  * @return new array of all entries in the bag; if bag empty, returns empty array */
	 public T[] toArray();
	 
	 /** Checks whether a bag is full
	   * @return True if bag is full, false if not */
	public boolean isFull();
		
}

package bags;

/**
 * Interface outlining operations for a bag of objects
 * @author Brenton Otis c/o Frank M. Carrano, Timothy M. Henry
 * @param <T> Generic type
 */

public interface BagInterface<T> {
	
	/** Gets current number of entries in bag
	 * @return integer number of entries in bag */
	public int getCurrentSize();
	
	/** Checks whether a bag is empty
	 * @return True if bag is empty, false if not */
	public boolean isEmpty();
	
	/** Adds new entry to the bag 
	 * @param newEntry object to be added to the bag
	 * @return True if new entry was successful, false if not */
	public boolean add(T newEntry);
	
	/** Removes one unspecified entry from bag (if possible)
	 * @return the removed entry if successful, otherwise null */
	public T remove();
	
	/** Removes one occurrence of a given entry from the bag, if possible
	 * @param anEntry entry to be removed
	 * @return True if removal was successful, false if not */
	public boolean remove(T anEntry);
	
	/** Removes all entries from the bag */
	public void clear();
	
	/** Provides integer frequency of particular entry in bag
	 * @param anEntry entry to be counted
	 * @return number of times anEntry is found in bag */
	 public int getFrequencyOf(T anEntry);
	 
	 /** Checks to see if a specified entry occurs in bag
	  * @param anEntry entry to search for
	  * @return True if entry is found in bag, otherwise false */
	 public boolean contains(T anEntry);
	 
	 /** Gets all entries in bag (by putting into an array)
	  * @return new array of all entries in the bag; if bag empty, returns empty array */
	 public T[] toArray();
}

package stacks;

/** Interface outlining operations for a stack
 *  @author Brenton Otis c/o Frank M. Carrano, Timothy M. Henry
 *  @param <T> Generic type */

public interface StackInterface<T> {
	
	/** Adds new entry to top of stack
	 * @param newEntry object to be added to the stack */
	public void push(T newEntry);
	
	/** Removes and returns stack's top entry
	 * @return object at the top of the stack
	 * @throws EmptyStackException if the stack is empty before the operation */
	public T pop();
	
	/** Retrieves stack's top entry (but does not alter stack/remove entry)
	 * @return object at the top of the stack
	 * @throws EmptyStackException if stack is empty */
	public T peek();
	
	/** Checks whether the stack is empty or not
	 * @return True if stack is empty, otherwise false */
	public boolean isEmpty();
	
	/** Removes all entries from the stack */
	public void clear();
}

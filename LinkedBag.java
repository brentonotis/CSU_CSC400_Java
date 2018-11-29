package bags;

/**
 * Class of bags where entries are stored in a chain of linked nodes
 * @author Brenton Otis c/o Frank M. Carrano, Timothy M. Henry
 * @param <T> generic type
 */

public class LinkedBag<T> implements BagInterface<T> {
	
	private Node firstNode; // Head reference
	private int numberOfEntries; // To track number of nodes/entries in chain/bag
	
	// Default constructor
	public LinkedBag() {
		firstNode = null;
		numberOfEntries = 0;
	}
	
	// Private inner class
	private class Node {
		private T data; // Entry in bag
		private Node next; // Link to next node
		
		private Node(T dataPortion) {
			this(dataPortion, null);
		}
		
		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		}
		
		private T getData() {
			return data;
		}
		
		private Node getNextNode() {
			return next;
		}
		
		private void setNextNode(Node nextNode) {
			next = nextNode;
		}
	}
	
	// Locates given entry within bag, returns reference to node containing the entry
	// if not located, returns null
	private Node getReferenceTo(T anEntry) {
		boolean found = false;
		Node currentNode = firstNode;
		while (!found && (currentNode != null)) {
			if (anEntry.equals(currentNode.data))
				found = true;
			else
				currentNode = currentNode.getNextNode();
		}
		return currentNode;
	}
	
	@Override
	/** Gets current LinkedBag size
	  *  @return current numberOfEntries */
	public int getCurrentSize() {
		return numberOfEntries;
	}

	@Override
	/** Evaluates whether or not LinkedBag is empty
	  * @return True if empty, otherwise returns False */
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}

	@Override
	/** Adds new entry to bag
	 * @param newEntry object to be added as a new entry
	 * @return True */
	public boolean add(T newEntry) {
		// Add to beginning of new chain
		Node newNode =  new Node(newEntry);
		newNode.setNextNode(firstNode);
		// Makes new node reference rest of chain (firstNode null if chain empty)
		// New node at beginning of chain
		firstNode = newNode;
		numberOfEntries++;
		return true;
	}

	@Override
	/** Removes one unspecified entry from the bag, if possible
	 * @return the removed object (if successful), otherwise null */
	public T remove() {
		T result = null;
		if (firstNode != null) {
			result = firstNode.getData();
			firstNode = firstNode.next; // Removes fist node from chain
			numberOfEntries--;
		}
		return result;
	}

	@Override
	/** Removes one occurence of a given entry from the bag (if possible)
	 * @param anEntry entry to be removed
	 * @return True if removal was succesful, otherwise False */
	public boolean remove(T anEntry) {
		boolean result = false;
		Node nodeN = getReferenceTo(anEntry);
		if (nodeN != null) {
			nodeN.data = firstNode.data; // Replace located entry w/ entry in first node, remove first node
			firstNode = firstNode.next;
			numberOfEntries--;
			result = true;
		}
		return result;
	}

	@Override
	// Calls method remove() via isEmpty() to remove all entries from bag
	public void clear() {
		while (!isEmpty())
			remove();
	}

	@Override
	/** Counts number of times given entry appears in bag
	 * @param anEntry entry to be counted
	 * @return number of times anEntry appears in bag */
	public int getFrequencyOf(T anEntry) {
		int frequency = 0;
		int loopCounter = 0;
		Node currentNode = firstNode;
		while ((loopCounter < numberOfEntries) && (currentNode != null)) {
			if (anEntry.equals(currentNode.data))
				frequency++;
			loopCounter++;
			currentNode = currentNode.getNextNode();
		}
		return frequency;
	}

	@Override
	/** Traverses linked chain in search of a particular entry
	 *  @param anEntry entry to search for
	 *  @return True if entry found, otherwise false */
	public boolean contains(T anEntry) {
		boolean found = false;
		Node currentNode = firstNode;
		while (!found && (currentNode != null)) {
			if (anEntry.equals(currentNode.data))
				found = true;
			else
				currentNode = currentNode.getNextNode();
		}
		return found;
	}

	@Override
	/** Retrieves all entries in the bag
	 * @return New array of all entries in bag */
	public T[] toArray() {
		@SuppressWarnings("unchecked") // New array contains null entries
		T[] result = (T[])new Object[numberOfEntries];
		int index = 0;
		Node currentNode = firstNode;
		while ((index < numberOfEntries) && (currentNode != null)) {
			result[index] = currentNode.data;
			index++;
			currentNode = currentNode.getNextNode();
		}
		return result;
	}	
}

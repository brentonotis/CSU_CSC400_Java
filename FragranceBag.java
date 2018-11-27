package fragrance;

/**
 * Class that implements the BagInterface<MyType> in Java
 * @author Brenton Otis
 */

public final class FragranceBag<T> implements FragranceBagInterface<T> {

	private final T[] myBag;
	private int numberofProducts;
	private static final int Default_Capacity = 20;
	private static final int Max_Capacity = 1000;
	
	/** Default constructor; Creates initial bag with default capacity (20) */
	public FragranceBag() {
		this(Default_Capacity);
	}
	
	/** Constructor; Creates initial bag with desiredCapacity
	 * @param desiredCapacity capacity needed for new bag */
	public FragranceBag(int desiredCapacity) {
		if (desiredCapacity <= Max_Capacity) {
			@SuppressWarnings("unchecked") // Null entries in new array
			T[] tempBag = (T[])new Object[desiredCapacity]; // Unchecked cast
			myBag = tempBag;
			numberofProducts = 0;
		}
		else {
			throw new IllegalStateException("Exceeds maximum capacity");
		}
	}

	@Override
	/** Adds new entry to bag
	 * @param newEntry object being added as new entry
	 * True if addition is successful, otherwise false */
	public boolean add(T newEntry) {
		boolean result = true;
		if (isFull()) {
			result = false;
		}
		else {
			myBag[numberofProducts] = newEntry;
			numberofProducts++;
		}
		return result;
	}

	@Override
	/** Retrieves all entries in bag (puts them in a new array)
	 * @return new array of all entries in bag */
	public T[] toArray() {
		@SuppressWarnings("unchecked") // Null entries in new array
		T[] result = (T[])new Object[numberofProducts];
		for (int index = 0; index < numberofProducts; index++) {
			result[index] = myBag[index];
		}
		return result;
	}

	@Override
	// returns true if number of products exceeds bag length, otherwise false
	public boolean isFull() {
		return numberofProducts >= myBag.length;
	}
	
}

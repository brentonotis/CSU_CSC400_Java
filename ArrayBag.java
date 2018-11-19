package bags;

/**
 * Class of bags for fixed-size array
 * @author Brenton Otis c/o Frank M. Carrano, Timothy M. Henry
 * @param <T> Generic type
 */

public final class ArrayBag<T> implements BagInterface<T> {
	
	private final T[] bag;
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY = 25;
	
	/** Default constructor - creates empty bag with default/initial capacity of 25 */
	public ArrayBag() {
		this(DEFAULT_CAPACITY);
	}
	
	/** Constructor; Creates empty bag with given initial capacity
	 * @param desiredCapacity integer capacity desired */
	public ArrayBag(int desiredCapacity) {
		// Cast safe b/c null entries in new array
		@SuppressWarnings("unchecked")
		T[] tempBag = (T[])new Object[desiredCapacity]; // Unchecked cast
		numberOfEntries = 0;
	}

	@Override
	public int getCurrentSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(T newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
}

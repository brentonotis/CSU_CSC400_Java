package bags;

/** Tests the methods add, toArray, isEmpty and getCurrentSize from class LinkedBag
 * @author Brenton Otis c/o Frank M. Carrano, Timothy M. Henry
 * @param <T> generic type
 */

public class LinkedBagDemo {
	
	public static void main (String[] args) {
		System.out.println("Creating empty bag.");
		BagInterface<String> aBag = new LinkedBag<>();
		testIsEmpty(aBag, true);
		displayBag(aBag);
		
		String[] contentsOfBag = {"A", "D", "B", "A", "C", "A", "D"};
		testAdd(aBag, contentsOfBag);
		testIsEmpty(aBag, false);
	}
	
	// Tests method isEmpty; If bag empty, 'empty' should be True, otherwise False
	private static void testIsEmpty(BagInterface<String> bag, boolean empty) {
		System.out.print("\nTesting isEmpty with ");
		if(empty)
			System.out.println("an empty bag:");
		else
			System.out.println("a bag that is not empty:");
		
		System.out.print("isEmpty finds the bag ");
		if (empty && bag.isEmpty())
			System.out.println("empty: OK.");
		else if (empty)
			System.out.println("not empty, but it is: ERROR.");
		else if (!empty && bag.isEmpty())
			System.out.println("empty, but it is not empty: ERROR.");
		else
			System.out.println("not empty: OK.");
	}
	
	// method to test add() method of ArrayBag class
	private static void testAdd(BagInterface<String> aBag, String[] content) {
		System.out.print("Adding string to bag: ");
		for (int index = 0; index < content.length; index++) {
			if (aBag.add(content[index])) {
				System.out.print(content[index] + " ");
			}
			else {
				System.out.print("\nUnable to add " + content[index] + " to bag.");
			}
			System.out.println();
			displayBag(aBag);
		}
	}
		
	// tests method toArray by displaying bag
	private static void displayBag(BagInterface<String> aBag) {
		System.out.print("Bag contains the following strings: ");
		Object[] bagArray = aBag.toArray();
		for (int index = 0; index < bagArray.length; index++) {
			System.out.print(bagArray[index] + " ");
		}
		System.out.println();
	}
}

package fragrance;

/**
 * Test class verifying add() and toArry() methods of FragranceBag class/interface
 * @author Brenton Otis
 */

public class FragranceBagDemo {
	
	// driver
	public static void main (String[] args) {
		// Adds products to empty bag (w/ default capacity (20)) and prints (toArray())
		System.out.println("Testing below capacity..."); System.out.println();
		
		FragranceBagInterface<String> testBag = new FragranceBag<>();
		String[] FirstBagProducts = {"Burberry", "Polo", "CK", "Guess", "Gap"};
		testAdd(testBag, FirstBagProducts);
		
		// Adds products to exceed max capacity of new bag (3) and prints (toArray())
		System.out.println();
		System.out.println("Testing to exceed capacity (of 3)..."); System.out.println();
		testBag = new FragranceBag<>(3);
		String[] SecondBagProducts = {"Burberry", "Polo", "CK", "Guess"};
		testAdd(testBag, SecondBagProducts);
		
		System.out.println();
		System.out.println("...Testing complete");
	}
	
	// method to test add() method of ArrayBag class
	private static void testAdd(FragranceBagInterface<String> testBag, String[] product) {
		System.out.println("Adding products to bag: ");
		for (int index = 0; index < product.length; index++) {
			if (testBag.add(product[index])) {
				System.out.print(product[index] + " ");
			}
			else {
				System.out.print("\nUnable to add " + product[index] + " to bag.");
			}
			System.out.println();
			displayBag(testBag);
		}
	}
	
	// method to test toArry() (by displaying/printing contents of bag)
	private static void displayBag(FragranceBagInterface<String> testBag) {
		System.out.print("Bag contains the following products: ");
		Object[] bagArray = testBag.toArray();
		for (int index = 0; index < bagArray.length; index++) {
			System.out.print(bagArray[index] + " ");
		}
		System.out.println();
	}		
}

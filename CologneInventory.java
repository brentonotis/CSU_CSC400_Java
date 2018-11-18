import java.util.ArrayList;

/**
 * Class that acts as inventory management system for Cologne manufacturer/storage
 * Still in pre-planning phase w/ CRC/UML cards but getting ahead of myself here per usual :)
 * @author Brenton Otis
 */

public class Cologne {
	
	public static String cologneName;
	public static double colognePrice;
	public static double cologneSize;
	public static ArrayList<Cologne> cologneArr;
	
	public static void main (String[] args) {
		
		ArrayList<Cologne> cologneArr = new ArrayList<Cologne>();
		
		addCologne("name", 13.13, 4);
		addCologne("name2", 14.12, 5);
		
		int i = 0;
		while (i < cologneName.length()) {
			cologneArr.add(new Cologne(cologneName, colognePrice, cologneSize));
			i++;
		}		
		System.out.println(getCologneArr());
	}
	
	// Constructor
	public Cologne(String productName, double Price, double Size) {
		cologneName = productName;
		colognePrice = Price;
		cologneSize = Size;
	}
	
	// Add cologne object
	public static void addCologne (String productName, double Price, double Size) {
		cologneArr.add(new Cologne(productName, Price, Size));
	}
	
	// Return cologne by specific index
	public Cologne getCologneAt(int index) {
		return cologneArr.get(index);
	}
	
	// Return all cologne objects
	public static ArrayList<Cologne> getCologneArr() {
		return cologneArr;
	}
}	

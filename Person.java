package portfolio_final;

/**
 * Class that creates person with last name, first name (strings) and age parameters (int)
 * Stores people in a queue (customer inner class) that then sorts based on last name and/or age
 * Prompts user to add five people to the queue and sorts (via quick sort) in descending order
 * @author Brenton Otis
 */

import java.util.*;

public class Person {
	
	public String firstName;
	public String lastName;
	public int age;
	public final static int MAX_CAP = 5; // max capacity/num. of names to input; change to expand/reduce
	
	// driver
	@SuppressWarnings("resource")
	public static void main (String[] args) {
		
		String nameFirst;
		String nameLast;
		int ageInt;
		
		Scanner scnr = new Scanner(System.in);
		
		Queue q = new Queue();
		
		for (int i = 0; i < MAX_CAP; i++) {
			System.out.println();
			System.out.println("Enter info. for person " + (i + 1) + ":");
			System.out.print(" First name:");
			nameFirst = scnr.next();
			System.out.print(" Last name:");
			nameLast = scnr.next();
			System.out.print(" Age:");
			ageInt = scnr.nextInt();
			
			Person p = new Person(nameFirst, nameLast, ageInt);
			
			q.push(p);
		}
		
		q.sort_init();
		
		q.sortByLast();
		System.out.println();
		System.out.println("Queue sorted in descending order by last name: ");
		q.printAll();
		
		q.sortByAge();
		System.out.println();
		System.out.println("Queue sorted in descending order by age: ");
		q.printAll();		
	}
	
	// constructor
	public Person(String fn, String ln, int a) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = a;
	}
	
	// inner class - comparator of Person object, sorts by last name
	public static class LastNameSort implements Comparator<Person> {
		// sorts by last name in descending order
		public int compare(Person first, Person second) {	
			return -(first.lastName.compareTo(second.lastName));
		}
	}
	
	// inner class - comparator of Person object, sorts by age
	public static class AgeSort implements Comparator<Person> {
		// sorts by age in descending order
		public int compare(Person first, Person second) {
			return -(first.age - second.age);
		}	
	}
	
	// custom queue inner class integrates sort & print methods
	public static class Queue {
		
		public Person arrayRaw[];
		public Person arraySort[];
		public int indexBegin;
		public int indexEnd;
		public int sortLength;
		
		// constructor
		public Queue() {
			this.arrayRaw = new Person[MAX_CAP];
			this.indexBegin = 0;
			this.indexEnd = 0;
		}
		
		// adds person to end of queue (array) and extends (indexEnd)
		public void push(Person aPerson) {
			arrayRaw[indexEnd] = aPerson;
			indexEnd++;
		}
		
		// Extends beginning of queue (similar to popping top of a stack)
		public void pop() {
			indexBegin++;
		}
		
		// returns beginning of queue (but doesn't remove, similar to peeking at top of stack)
		public Person peek() {
			return arrayRaw[indexBegin];
		}
		
		// evaluates if queue is empty
		public int isEmpty() {
			if (indexBegin == indexEnd) {
				return 1;
			}
			else return 0;
		}
		
		// initializes sort
		public void sort_init() {
			sortLength = indexEnd - indexBegin;
			arraySort = new Person[sortLength];
			// iterates over existing queue and moves elements to new queue (array)
			for (int i = indexBegin; i < indexEnd; i++) {
				arraySort[i] = arrayRaw[i];
			}		
		}
		
		// .sort() implements quick sort, sorts by last name
		public void sortByLast() {
			Arrays.sort(arraySort, new LastNameSort());
		}
		
		// .sort() implements quick sort, sorts by age
		public void sortByAge() {
			Arrays.sort(arraySort, new AgeSort());
		}
		
		// displays all content of queue (array)
		public void printAll() {
			for (int i = 0; i < sortLength; i++) {
				System.out.println(arraySort[i].firstName + " " + arraySort[i].lastName + " " + arraySort[i].age);
			}
		}
	}
}

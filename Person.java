package portfolio_final;

import java.util.*;

public class Person implements Comparable<Person> {
	
	private String lastName;
	private String firstName;
	private int age;
	
	public Person(String nameLast, String nameFirst, int agePerson) {
		
		lastName = nameLast;
		firstName = nameFirst;
		age = agePerson;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return lastName + "," + firstName + ":" + age;
	}
	
	@Override
	public int compareTo(Person secondPerson) {
		int lastNameCompare = this.lastName.compareTo(secondPerson.lastName);
		return lastNameCompare;
	}
	
	public static void main (String[] args) {
		
		Queue<Person> people = new PriorityQueue<>();
		
		Person firstPerson = new Person("Otis","Brenton",31);
		Person secondPerson = new Person("Kalmus","Kaylen",31);
		Person thirdPerson = new Person("Otis","Moxie",9);
		Person fourthPerson = new Person("Kalmus","Yogi",6);
		Person fifthPerson = new Person("Fresh","Dougie",42);
		
		people.add(firstPerson);
		people.add(secondPerson);
		people.add(thirdPerson);
		people.add(fourthPerson);
		people.add(fifthPerson);
		
		System.out.println("Before sorting: " + people);
			
		Arrays.sort(people.toArray());
		
		System.out.println(people);
		
		
	}
		
}
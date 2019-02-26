/**
 * Author: Ignatius Akeeh
 * Class ID: 305
 * Assignment #: 2
 * Description: This class test the calculator class.
 */
package cse360assign2;

public class Main {

	/**
	 * This main method use to test calculator class
	 * 
	 * @param args not use in this class 
	 */
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("Testing Calculator!");
		System.out.println("Part 1:");
		
		System.out.println("Adding 4");
		cal.add(4);
		
		System.out.println("Subtracting 2");
		cal.subtract(2);
		
		System.out.println("Multiplying 2");
		cal.multiply(2);
		
		System.out.println("Adding 5");
		cal.add(5);
		
		System.out.printf("Total: %d\n", cal.getTotal());
		System.out.println("Showing history: ");
		System.out.println(cal.getHistory());
		
		System.out.println("\nPart 2:");
		System.out.println("Diving 0");
		cal.divide(0);
		System.out.printf("Total: %d\n", cal.getTotal());
		System.out.println("Showing history: ");
		System.out.println(cal.getHistory());
		
		System.out.println("\nPart 3:");
		System.out.println("Adding 3");
		cal.add(3);
		
		System.out.println("Subtracting 1");
		cal.subtract(1);
		
		System.out.println("Multiplying 6");
		cal.multiply(6);
		
		System.out.println("Adding 15");
		cal.add(15);
		
		System.out.printf("Total: %d\n", cal.getTotal());
		System.out.println("Showing history: ");
		System.out.println(cal.getHistory());

	}

}

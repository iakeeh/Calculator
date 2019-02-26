/**
 * Author: Ignatius Akeeh
 * Class ID: 305
 * Assignment #: 2
 * Description: This class test the calculator class.
 */
package cse360assign3;

public class Main {

	/**
	 * This main method use to test calculator class
	 * 
	 * @param args not use in this class 
	 */
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(4);
		cal.subtract(2);
		cal.multiply(2);
		cal.add(5);
		cal.getHistory();

	}

}

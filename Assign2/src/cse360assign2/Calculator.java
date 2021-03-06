/**
 * Author: Ignatius Akeeh
 * Class ID: 305
 * Assignment #: 2
 * Description: This class take a integer variable total.
 *              Then perform the method add, subtract, multiply, and divide on total.
 *              The value in total one can find it with the getTotal method. Also, the history of 
 *              the method use on total one can find it using the getHistory method. 
 */
package cse360assign2;

public class Calculator {
	private int total;
	private String history;

	/**
	 * This constructor set the initial value of total to zero.
	 * Also, initialize history to "0 ".
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0 ";
	}
	
	/**
	 * Return the value in total back to where it is call from.
	 * It has no parameter.
	 * 
	 * @return  the value in total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method add the value given in the parameter to total.
	 * Also, add what method did to history.
	 * 
	 * @param value   the integer value given
	 */
	public void add (int value) {
		total = total + value;
		history = history + "+ " + value + " ";
	}
	
	/**
	 * This method subtract the value given in the parameter to total.
	 * Also, add what method did to history.
	 * 
	 * @param value  the integer value given
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + "- " + value + " ";
	}
	
	/**
	 * This method multiply the value given in the parameter to total.
	 * Also, add what method did to history.
	 * 
	 * @param value the integer value given
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + "* " + value + " ";
	}
	
	/**
	 * This method divide total by the value given in the parameter.
	 * If the value given is zero then total get set to zero.
	 * Also, add what method did to history.
	 * 
	 * @param value  the integer value given
	 */
	public void divide (int value) {
		if(value==0) {
			total = 0;
			history = "0 ";
		}
		else {
			total = total / value;
			history = history + "/ " + value + " ";
		}
	}
	
	/**
	 * Return the string of all action done to total since this class since beginning.
	 * 
	 * @return  string of all action perform on total
	 */
	public String getHistory () {
		return history;
	}
}
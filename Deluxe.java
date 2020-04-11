 /**
 * Deluxe Pizza Class
 * 
 * Methods include - pizzaPrice(), toString()
 * 
 * @author Karneet Arora, Manel Bermad
 */

package application;
import java.util.ArrayList; 

public class Deluxe extends Pizza {

	final static int small = 14; 
	final static int surchargeMed = 2; 
	final static int surchargeLarge = 4; 
	public static String style; 
	public static String size;

	
	/**
	 * Constructor for Deluxe Pizza
	 * @param style, size, toppings
	 */
	public Deluxe(String style, String size,  ArrayList<String> toppings) {
		super(style, size, toppings);
	}

	@Override
	/**
	 * Overrides the super pizzaPrice() method and returns the price of the Deluxe pizza
	 * @return pizza price as an integer 
	 */
	public int pizzaPrice() {
		switch(size) {
		case "Small":
			return small;
		case "Medium":
			return small + surchargeMed; 
		case "Large":
			return small + surchargeMed + surchargeLarge; 
		default:
			return small + surchargeMed; 
		}
	}
	
	@Override
	/**
	* toString print the style, size, and toppings of the pizza 
	* @return pizza details as a String
	*/
	public String toString() {
		return super.toString(); 
	}

}

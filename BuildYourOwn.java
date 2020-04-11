 /**
 * Build Your Own class
 * Methods include - pizzaPrice(), toString()
 * 
 * @author Karneet Arora, Manel Bermad
 */

package application;

import java.util.ArrayList;

public class BuildYourOwn extends Pizza{
	
	final int small = 5; 
	final int surchargeMed = 2; 
	final int surchargeLarge = 4; 
	final int chargePerTopping = 2; 
	public static String style; 
	public static String size;
	int numOfToppings;
	
	
	/**
	 * Constructor for Build Your Own Pizza
	 * @param style, size, toppings
	 */
	public BuildYourOwn(String style, String size, ArrayList<String> toppings) {
		super(style, size, toppings);
	}

	@Override
	/**
	 * Overrides the super pizzaPrice() method and returns the price of the Build Your Own pizza
	 * Price is based on the number size and number of toppings picked by the user
	 * @return pizza price as an integer 
	 */
	public int pizzaPrice() {
		switch(size) {
		case "Small":
			return small + numOfToppings * chargePerTopping;
		case "Medium":
			return small + surchargeMed + numOfToppings * chargePerTopping; 
		case "Large":
			return small + surchargeMed + surchargeLarge + numOfToppings * chargePerTopping; 
		default:
			return small + surchargeMed + numOfToppings * chargePerTopping; 
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

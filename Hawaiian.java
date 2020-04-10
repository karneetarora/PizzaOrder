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
	ArrayList<String> top= new ArrayList<String>(); 
	int numOfToppings;
	
	public BuildYourOwn(String style, String size, ArrayList<String> top) {
		super(style, size, top);
	}

	@Override
	public int pizzaPrice() {
		switch(size) {
		case "Small":
			return small;
		case "Medium":
			return small + surchargeMed; 
		case "Large":
			return small + surchargeMed + surchargeLarge; 
		default:
			return small;
		}
	}
	
	@Override
	/**
	* toString print the style, size, and toppings of the pizza 
	* @return pizza details as a String
	*/
	public String toString() {
		return style + " " + size + " " + top;
	}

}

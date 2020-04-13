 /**
 * Hawaiian Class
 * Methods include - pizzaPrice(), toString()
 * 
 * @author Karneet Arora, Manel Bermad
 */

package application;
import java.lang.String;
import java.util.ArrayList;


public class Hawaiian extends Pizza{
	
	final static int small = 8;	
	final static int surchargeMed = 2;	
	final static int surchargeLarge = 4; 
	public static String style; 


	/**
	 * Constructor for Hawaiian Pizza
	 * @param style Hawaiian
	 * @param size Small, Medium, or Large
	 * @param toppings List of toppings
	 */
	public Hawaiian(String style, String size, ArrayList<String> toppings) {
		super(style, size, toppings);
	}
	
	@Override
	/**
	 * Overrides the super pizzaPrice() method and returns the price of the Hawaiian pizza
	 * @return pizza price as an integer 
	 */
	public int pizzaPrice() {
		switch(this.size) {
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
		return super.toString() +  "\nPrice = $" + this.pizzaPrice() + "\n"; 
	}
	

}

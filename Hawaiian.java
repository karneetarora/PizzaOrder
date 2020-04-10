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
	public static String size;
	ArrayList<String> top = new ArrayList<String>(); 
	
	public Hawaiian(String style, String size, ArrayList<String> top) {
		super(style, size, top);
	}

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

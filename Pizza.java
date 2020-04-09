 /**
 * Pizza Abstract Class
 * Methods include - pizzaPrice(), toString()
 * 
 * @author Karneet Arora, Manel Bermad
 */

package application;

import java.util.ArrayList;

public abstract class Pizza {  
	protected String style;  
	protected String size;  
	protected ArrayList<String> toppings;   
	public Pizza(String style, String size, ArrayList<String> toppings) { 
		this.style = style; 
		this.size = size; 
		this.toppings = toppings; 
	}    
	public Pizza(String style, String size) { }    
	public abstract int pizzaPrice();   
	
	/**
	* toString print the style, size, and toppings of the pizza 
	* @return pizza details as a String
	*/
	public String toString() {  
		return this.style + " " + this.size + " " + this.toppings; 
	}        
}  

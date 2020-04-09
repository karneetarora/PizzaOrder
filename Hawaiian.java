package application;
import java.lang.String;
import java.util.ArrayList;


public class Hawaiian extends Pizza{
	
	final static int small = 8;	
	final static int surchargeMed = 2;	
	final static int surchargeLarge = 4; 
	public static String name; 
	public static String size;
	ArrayList<String> top = new ArrayList<String>(); 
	
	public Hawaiian(String pizzaName, String pizzaSize, ArrayList<String> selectedToppingsList) {
		name = pizzaName; 
		size = pizzaSize; 
		top = selectedToppingsList; 
		
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
	public String toString() {
		return name + " " + size + " " + "" + top;
	}

}

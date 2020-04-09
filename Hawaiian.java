package application;

public class Hawaiian extends Pizza{
	
	final static int small = 8;	
	final static int surchargeMed = 2;	
	final static int surchargeLarge = 4; 
	public static String size;

	public int pizzaPrice() {
		size = "Medium"; 
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
		return "This string.";
	}
	
	public static void main(String[] args) {
	}

}

package application;

import java.util.ArrayList;

public abstract class Pizza {
protected String style;
protected String size;
protected ArrayList<String> toppings;
public Pizza(String style, String size, ArrayList<String> toppings) { }
public Pizza(String style, String size) { }
public abstract int pizzaPrice();
public String toString() { 
	//implement

}

}

 /**
 *Build Your Own JUnit Test Case
 * 
 * Tested the pizzaPrice() method for Build Your Own Pizza
 * In each case, we tested a different number of toppings chosen 
 * and different sizes.
 * We did not test for toppings < 0 or toppings  > 6 as it is handled by the controller file
 * and will prevent the user from making invalid selections.  
 * @author Karneet Arora, Manel Bermad
 */

package application;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class BuildYourOwnTest {

	/**
	 * Test method for {@link application.BuildYourOwn#pizzaPrice()}.
	 */
	@Test
	public void testPizzaPrice() {
		
		//3 Equivalent classes, based on Size  
		ArrayList<String> toppings = new ArrayList<String>(); 
		toppings.add("Cheese");
		toppings.add("Chicken");
		toppings.add("Beef");
		Pizza s = new BuildYourOwn("Build Your Own", "Small", toppings); 
		assertEquals(s.pizzaPrice(), 11);
		
		toppings.clear(); 
		toppings.add("Pineapple");
		Pizza p = new BuildYourOwn("Build Your Own", "Small", toppings); 
		assertEquals(p.pizzaPrice(), 7);
		
		toppings.clear(); 
		toppings.add("Ham");
		toppings.add("Mushroom");
		toppings.add("Onion");
		toppings.add("Pepperoni");
		toppings.add("Pineapple");
		toppings.add("Saussage");
		Pizza m = new BuildYourOwn("Build Your Own", "Medium", toppings); 
		assertEquals(m.pizzaPrice(), 19);
		
		toppings.clear(); 
		toppings.add("Ham");
		toppings.add("Saussage");
		Pizza t = new BuildYourOwn("Build Your Own", "Medium", toppings); 
		assertEquals(t.pizzaPrice(), 11);
		
		toppings.clear(); 
		toppings.add("Cheese");
		Pizza l = new BuildYourOwn("Build Your Own", "Large", toppings); 
		assertEquals(l.pizzaPrice(), 13);
		
		toppings.clear(); 
		toppings.add("Cheese");
		toppings.add("Mushroom");
		toppings.add("Onion");
		toppings.add("Pepperoni");
		toppings.add("Saussage");
		Pizza f = new BuildYourOwn("Build Your Own", "Large", toppings); 
		assertEquals(f.pizzaPrice(), 21);
		

	}

}

 /**
 * Controller Class of the first scene
 * Handles the main screen, allowing user to pick the type, size, and toppings
 * of a pizza. Also handles all buttons and text areas on the screen
 * Methods include - add toppings, remove toppings
 * 
 * @author Karneet Arora, Manel Bermad
 */

package application;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class p4controller {
	public String type; 
	public String size; 

    @FXML
    private Button buttonAddTopping;

    @FXML
    private Button buttionRemoveTopping;

    @FXML
    private Button buttonClearSelection;

    @FXML
    private Button buttonAddToOrder;

    @FXML
    private Button buttonShowOrder;

    @FXML
    private ListView<String> selectedToppingsList;

    @FXML
    private ListView<String> toppingsList;

    @FXML
    private ImageView imageView;

    @FXML
    private ComboBox<String> pizzaComboBox;

    @FXML
    private ComboBox<String> sizeComboBox;

    @FXML
    private TextArea textArea;
    
    int toppingsCounter = 0;

    @FXML
    /**
     * Adds the selected toppings to the pizza order 
     * @param Add button clicked
     */
    void actionAddTopping(ActionEvent event) {
    	// check counter!
    	if(toppingsCounter < 6  && !toppingsList.getSelectionModel().isEmpty()) { // and has selected something
    		toppingsCounter++;
    		selectedToppingsList.getItems().add(toppingsList.getSelectionModel().getSelectedItem());
    		toppingsList.getItems().remove(toppingsList.getSelectionModel().getSelectedItem());	    		
    	}
    	else if(toppingsCounter == 6 ) {
    		textArea.appendText("Only up to 6 toppings can be selected.\n");
    	}
    }
    
    @FXML
    /**
     * Removes the selected toppings from the list 
     * @param Remove button clicked
     */
    void actionRemoveTopping(ActionEvent event) {
	   if(!selectedToppingsList.getSelectionModel().isEmpty()) {
		   toppingsList.getItems().add(selectedToppingsList.getSelectionModel().getSelectedItem());
		   selectedToppingsList.getItems().remove(selectedToppingsList.getSelectionModel().getSelectedItem());
		   toppingsCounter--; 
	   }
    }
   
    @FXML
    /**
     * Clears the form and the selected toppings list 
     * Resets the form to "Build Your Own" and restores the original available toppings list
     * @param Clear button clicked
     */
    void actionClearSelection(ActionEvent event) {
    	selectedToppingsList.getItems().clear();
    	pizzaComboBox.setValue("Build Your Own");
    	toppingsList.getItems().clear();
    	toppingsList.getItems().addAll("Beef", "Cheese", "Chicken", "Green Pepper", "Ham", "Mushroom", "Onion", "Pepperoni", "Pineapple", "Saussage");
    	toppingsCounter = 0; 
    }

    Image photoBuildYourOwnPizza  =  new Image("application/BuildYourOwnPizza.png.jpg");
    Image photoHawaiianPizza = new Image("application/HawaiianPizza.png.jpg");
    Image photoDeluxPizza = new Image("application/DeluxPizza.png.jpg");

    @FXML
    /**
     * 
     * @param event
     */
    void selectedPizza(ActionEvent event) {
    	toppingsCounter = 0;
    	if(pizzaComboBox.getValue().equals("Hawaiian")) {
    		imageView.setImage(photoHawaiianPizza);
   		
        	toppingsList.getItems().clear();
        	toppingsList.setDisable(true);
        	buttonAddTopping.setDisable(true);
        	buttionRemoveTopping.setDisable(true);
        	selectedToppingsList.getItems().clear();
        	selectedToppingsList.getItems().addAll("Ham", "Pineapple");
        	
    	}else if(pizzaComboBox.getValue().equals("Deluxe")) {
    		imageView.setImage(photoDeluxPizza);

        	toppingsList.getItems().clear();
        	toppingsList.setDisable(true);
        	buttonAddTopping.setDisable(true);
        	buttionRemoveTopping.setDisable(true);
        	selectedToppingsList.getItems().clear();
        	selectedToppingsList.getItems().addAll("Sausage", "Pepperoni", "Green Pepper", 
        											"Onion", "Mushroom");// collection?	
    	}else { // if build your own
    		imageView.setImage(photoBuildYourOwnPizza);
    		
        	toppingsList.getItems().clear();
        	toppingsList.setDisable(false);
        	buttonAddTopping.setDisable(false);
        	buttionRemoveTopping.setDisable(false);
        	selectedToppingsList.getItems().clear();

        	toppingsList.getItems().addAll("Chicken", "Ham", "Mushroom", "Onion", "Pepperoni","Pineapple", "Saussage","Beef", "Cheese", "Green Pepper");
    	}
    }
    
    @FXML
    /**
     * 
     * @param Add to Order button clicked
     */
    void actionAddToOrder(ActionEvent event) {
    	textArea.clear();
    	if (!selectedToppingsList.getItems().isEmpty()) {
    		type = pizzaComboBox.getValue();
    		size = sizeComboBox.getValue();
    		
    		List<String> lst = selectedToppingsList.getItems(); 
    		ArrayList<String> toppings = new ArrayList<String>(lst);
    		
    		switch(type) {
    		case "Deluxe":
    			Pizza pizza = new Deluxe(type, size, toppings);
    			break;
    		case "Hawaiian":
    			pizza = new Hawaiian(type, size, toppings);
    			break;
    		case "Build Your Own":
    			pizza = new BuildYourOwn(type, size, toppings);
    			break; 
    		default:
    			break; 
    		}  		
    		textArea.appendText("Your pizza has been added to your order.");
    	}else {
    		//remove system.out.print and use textArea.appendText
    		//System.out.println("not good to add, curr is " );
    		textArea.appendText("Please select at least 1 topping.\n");
    	}
    }
    
    @FXML
    /**
     * 
     * @param Show Order button clicked
     */
    void actionShowOrder(ActionEvent event) {

    	//implement    	
    }
    
}

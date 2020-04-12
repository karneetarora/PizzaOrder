 /**
 * Controller Class of the Second scene
 * Displays all the detail orders for the pizzas and the total price
 * of the pizzas. Also handles the clear and back button on the screen.
 * 
 * @author Karneet Arora, Manel Bermad
 */


package application;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class scene2 {

    @FXML
    private Button buttonClear;

    @FXML
    private Button buttonBack;

    @FXML
    private TextArea pizzaDisplay;

    @FXML
    private TextArea numberOfPies;

    @FXML
    private TextArea totalPrice;

    @FXML
    /**
     * Clears the pizza orders
     * Clears the price and number of pizza fields
     * @param Clear Button clicked 
     */
    void actionClear(ActionEvent event) {
    	numberOfPies.clear(); 
    	totalPrice.clear(); 
    	pizzaDisplay.clear(); 
    }

    @FXML
    /**
     * Closes the current screen and goes back to the main screen 
     * @param Back Button clicked 
     */
    void actionGoBack(ActionEvent event) throws IOException {
    	Parent firstScene = FXMLLoader.load(getClass().getResource("FirstScreen.fxml"));
    	Scene firstScreen = new Scene(firstScene);
    	
    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    	window.setScene(firstScreen);
    	window.show(); 
    }
    
    /**
     * Displays total number of pizzas being ordered 
     * @param total number of pizzas added to the cart
     */
    void numberOfPizzas(int num) { 
    	numberOfPies.appendText(num + "\n");
    }

}


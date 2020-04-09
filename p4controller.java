package application;

import java.lang.String;

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
    void actionAddTopping(ActionEvent event) {
    	// check counter!
    	if(toppingsCounter < 6  && !toppingsList.getSelectionModel().isEmpty()) { // and has selected something
    		toppingsCounter++;
    		selectedToppingsList.getItems().add(toppingsList.getSelectionModel().getSelectedItem());
    		toppingsList.getItems().remove(toppingsList.getSelectionModel().getSelectedItem());
    		    		
    	}

    }
    
   @FXML
    void actionRemoveTopping(ActionEvent event) {

	   if(!selectedToppingsList.getSelectionModel().isEmpty()) {
		   toppingsList.getItems().add(selectedToppingsList.getSelectionModel().getSelectedItem());
		   selectedToppingsList.getItems().remove(selectedToppingsList.getSelectionModel().getSelectedItem());
	   }
    }
   
    @FXML
    void actionClearSelection(ActionEvent event) {
    	toppingsList.getItems().clear();
    	pizzaComboBox.setValue("Build Your Own");

    }

    Image photoBuildYourOwnPizza  =  new Image("application/BuildYourOwnPizza.png");
    Image photoHawaiianPizza = new Image("application/HawaiianPizza.png");
    Image photoDeluxPizza = new Image("application/DeluxPizza.png");

    @FXML
    void selectedPizza(ActionEvent event) {
    	toppingsCounter = 0;
    	if(pizzaComboBox.getValue().equals("Hawaiian")) {
    		//type = pizzaComboBox.getValue();
    		//size = sizeComboBox.getValue();

    		imageView.setImage(photoHawaiianPizza);
   		
        	toppingsList.getItems().clear();
        	toppingsList.setDisable(true);
        	buttonAddTopping.setDisable(true);
        	buttionRemoveTopping.setDisable(true);
        	selectedToppingsList.getItems().clear();
        	selectedToppingsList.getItems().addAll("Ham", "Pineapple");
        	
    	//	Pizza H = new Hawaiian(size, selectedToppingsList);
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
        	selectedToppingsList.getItems().clear();

        	toppingsList.getItems().addAll("Chicken", "Ham", "Mushroom", "Onion", "Pepperoni",
        										"Pineapple", "Saussage","Beef", "Cheese", "Green Pepper");

    	}
    }
    
    @FXML
    void actionAddToOrder(ActionEvent event) {
    	textArea.clear();
    	if (!selectedToppingsList.getItems().isEmpty()) {
    		textArea.appendText("Your pizza has been added to your order.");
    	}else {
    		//remove system.out.print and use textArea.appendText
    		System.out.println("not good to add, curr is " );
    		textArea.appendText("Please select at least 1 topping.");
    		
    	}
    }
    
    
    @FXML
    void actionShowOrder(ActionEvent event) {

    	//implement 
    	
    }
}

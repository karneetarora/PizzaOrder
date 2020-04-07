package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

public class p4controller {

    @FXML
    private MenuButton buildMenu;

    @FXML
    private MenuItem pizzaDeluxe;

    @FXML
    private MenuItem pizzaHawaiian;

    @FXML
    private MenuItem pizzaBuildYourOwn;

    @FXML
    private MenuButton sizeMenu;

    @FXML
    private MenuItem sizeSmall;

    @FXML
    private MenuItem sizeMedium;

    @FXML
    private MenuItem sizeLarge;

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
    void actionAddToOrder(ActionEvent event) {

    }

    @FXML
    void actionAddTopping(ActionEvent event) {

    }

    @FXML
    void actionClearSelection(ActionEvent event) {
    	selectedToppingsList.getItems().clear();

    }

    @FXML
    void actionRemoveTopping(ActionEvent event) {

    }

    @FXML
    void actionShowOrder(ActionEvent event) {

    }


    
    
    

    @FXML
    void selectedDeluxe(ActionEvent event) {

    	toppingsList.getItems().clear();
    	toppingsList.setDisable(true);
    	buttonAddTopping.setDisable(true);
    	buttionRemoveTopping.setDisable(true);
    	selectedToppingsList.getItems().clear();
    	selectedToppingsList.getItems().addAll("Sausage", "Pepperoni", "Green Pepper", 
    			"Onion", "Mushroom");// collection?
    	
    }

    @FXML
    void selectedHawaiian(ActionEvent event) {
    	toppingsList.getItems().clear();
    	toppingsList.setDisable(true);
    	buttonAddTopping.setDisable(true);
    	buttionRemoveTopping.setDisable(true);
    	selectedToppingsList.getItems().clear();
    	selectedToppingsList.getItems().addAll("Ham", "Pineapple");
    }
    
    @FXML
    void selectBuildYourOwn(ActionEvent event) {
    	// How to make this option default??
    	toppingsList.getItems().clear();
    	toppingsList.setDisable(false);
    	buttonAddTopping.setDisable(false);
    	selectedToppingsList.getItems().clear();

    	toppingsList.getItems().addAll("Chicken", "Ham", "Mushroom", "Onion", "Pepperoni",
    										"Pineapple", "Saussage","Beef", "Cheese", "Green Pepper");

        
    }
    
    
    
    
    

    @FXML
    void selectLarge(ActionEvent event) {

    }

    @FXML
    void selectMedium(ActionEvent event) {

    }

    @FXML
    void selectSmall(ActionEvent event) {

    }


}

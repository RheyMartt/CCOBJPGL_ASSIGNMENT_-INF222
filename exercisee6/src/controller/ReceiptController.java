package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class ReceiptController implements Initializable{

    @FXML
    Label name1, name2, name3;

    @FXML
    Label quan1, quan2, quan3;

    @FXML 
    Label prize1, prize2, prize3;

    @FXML
    Label total1;

    @Override
    public  void initialize(URL arg0, ResourceBundle arg1){

        if (HomeController.blamp.getProductStatus() == true) {
            name1.setText(HomeController.blamp.getProductName());
            quan1.setText(String.valueOf(HomeController.blamp.getProductQuantity()));
            prize1.setText(String.valueOf(HomeController.blamp.getProductPrice()));
        } else {
            name1.setVisible(false);
            quan1.setVisible(false);
            prize1.setVisible(false);
        }

        if (HomeController.clamp.getProductStatus() == true) {
            name2.setText(HomeController.clamp.getProductName());
            quan2.setText(String.valueOf(HomeController.clamp.getProductQuantity()));
            prize2.setText(String.valueOf(HomeController.clamp.getProductPrice()));
        } else {
            name2.setVisible(false);
            quan2.setVisible(false);
            prize2.setVisible(false);
        }

        if (HomeController.wlamp.getProductStatus() == true) {
            name3.setText(HomeController.wlamp.getProductName());
            quan3.setText(String.valueOf(HomeController.wlamp.getProductQuantity()));
            prize3.setText(String.valueOf(HomeController.wlamp.getProductPrice()));
        } else {
            name3.setVisible(false);
            quan3.setVisible(false);
            prize3.setVisible(false);
        }

        total1.setText(CheckoutController.total);
    
    }

}
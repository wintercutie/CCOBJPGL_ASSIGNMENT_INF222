package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OrderController implements Initializable {


    @FXML

    Label name1, name2, name3, qty1, qty2, qty3, finalamount1, finalamount2, finalamount3, Total;

    @FXML
    Stage stage;

    @FXML
    Scene scene;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (HomeController.blamp.getProductStatus()) {
            name1.setText(HomeController.blamp.getProductName());
            qty1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
            finalamount1.setText(Double.toString(HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity()));
            name1.setVisible(true);
            qty1.setVisible(true);
            finalamount1.setVisible(true);
            // price1.setVisible(true);
        }

        if (HomeController.clamp.getProductStatus()) {
            name2.setText(HomeController.clamp.getProductName());
            qty2.setText(Double.toString(HomeController.clamp.getProductQuantity()));
            finalamount2.setText(Double.toString(HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity()));
            name2.setVisible(true);
            qty2.setVisible(true);
            finalamount2.setVisible(true);
            // price2.setVisible(true);

    }
    
        if (HomeController.wlamp.getProductStatus()) {
            name3.setText(HomeController.wlamp.getProductName());
            qty3.setText(Double.toString(HomeController.wlamp.getProductQuantity()));
            finalamount3.setText(Double.toString(HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity()));
            name3.setVisible(true);
            qty3.setVisible(true);
            finalamount3.setVisible(true);
            // price3.setVisible(true);
    }

        double amt1 = HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity();
        double amt2 = HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity();
        double amt3 = HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity();
        
        
        double total = amt1 + amt2 + amt3;
        Total.setText(Double.toString(total));

    }

}
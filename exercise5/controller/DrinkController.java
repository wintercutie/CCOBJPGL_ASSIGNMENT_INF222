package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinkController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Gsm gsm = new Gsm();
    Sarsi sarsi = new Sarsi();
    Jinro jinro = new Jinro();
    Sprite sprite = new Sprite();
    Ripe ripe = new Ripe();

    public void initialize() {

        gsm.setAlcohol("alcoholic drink");
        gsm.setTaste("the tang of lime, the sweetness of orange liqueur and the distinctive taste of gin.");

        sarsi.setAlcohol("non-alcoholic drink");
        sarsi.setTaste("minty and sweet with hints of salt with a bitter undertone.");

        jinro.setAlcohol("alcoholic drink");
        jinro.setTaste("very fresh and fruity!");

        sprite.setAlcohol("non-alcoholic drink");
        sprite.setTaste("like sugar with a little bit of a lemony-limey taste.");

        ripe.setAlcohol("non-alcoholic drink");
        ripe.setTaste("sweet, creamy, and a refreshing taste to beat the heat!");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("GSM Blue Margarita is an " + gsm.getAlcohol() + " that has " + gsm.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Sarsi Root Beer is a " + sarsi.getAlcohol() + " that is " + sarsi.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Jinro Soju Green Grape is an " + jinro.getAlcohol() + " that is " + jinro.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Sprite Lemon-Lime Drink is a " + sprite.getAlcohol() + " that tastes " + sprite.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Ripe Mango Shake is a " + ripe.getAlcohol() + " that is " + ripe.getTaste());
        }

        alert.showAndWait();

    }
}

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

    Coke coke = new Coke();
    Pepsi pepsi = new Pepsi();
    Rootbeer rootbeer = new Rootbeer();
    Royal royal = new Royal();
    Sprite sprite = new Sprite();

    public void initialize() {

        coke.setTaste("not so sweet");
        coke.setFlavor("refreshing");

        pepsi.setTaste("sweet");
        pepsi.setFlavor("refreshing");

        rootbeer.setTaste("super sweet");
        rootbeer.setFlavor("smooth");

        royal.setTaste("sweet");
        royal.setFlavor("fruity");

        sprite.setTaste("not so sweet");
        sprite.setFlavor("citrusy");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Taste: " + coke.getTaste() + "|" + "Flavor:" + coke.getFlavor());
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Taste: " + pepsi.getTaste() + "|" + "Flavor:" + pepsi.getFlavor());
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Taste: " + rootbeer.getTaste() + "|" + "Flavor:" + rootbeer.getFlavor());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("Taste: " + royal.getTaste() + "|" + "Flavor:" + royal.getFlavor());
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Taste: " + sprite.getTaste() + "|" + "Flavor:" + sprite.getFlavor());
        }

        alert.showAndWait();

    }
}
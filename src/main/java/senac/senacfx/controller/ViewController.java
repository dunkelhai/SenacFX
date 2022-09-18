package senac.senacfx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import senac.senacfx.gui.util.Alerts;

public class ViewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button bTest;
    @FXML
    public void onBtTestAction(){
        Alerts.showAlert("ERRO", "DEU RUIM", "VAI EXPLODIR", Alert.AlertType.ERROR);
    }
}
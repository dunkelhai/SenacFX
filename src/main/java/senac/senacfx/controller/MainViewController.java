package senac.senacfx.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import senac.senacfx.application.Main;
import senac.senacfx.gui.util.Alerts;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemDepartment;
    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction(){
        System.out.println("onMenuItemSellerAction");
    }

    @FXML
    public void onMenuItemDepartmentAction(){
        System.out.println("onMenuItemDepartmentAction");
    }

    @FXML
    public void onMenuItemAboutAction(){
        System.out.println("onMenuItemAboutAction");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    private void loadView(String absoluteName){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = loader.load();

            Scene mainScene = Main.getMainScene();
            
        }catch (IOException e){
            Alerts.showAlert("IO EXCEPTION", "Error loading view", e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}

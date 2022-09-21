package senac.senacfx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import senac.senacfx.db.DbException;
import senac.senacfx.gui.util.Constraints;
import senac.senacfx.model.entities.Department;

import java.net.URL;
import java.util.ResourceBundle;

public class DepartmentFormController implements Initializable {

    private Department entity;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private Label labelErrorName;

    @FXML
    private Button btSave;

    @FXML
    private Button btCancel;

    //Contolador agora tem uma instancia do departamento
    private void setDepartment(Department entity){
        this.entity = entity;
    }

    @FXML
    public void onBtSaveAction() {
        System.out.println("onBtSaveAction");
    }

    @FXML
    public void onBtCancelAction() {
        System.out.println("onBtCancelAction");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeNodes();
    }

    private void initializeNodes() {
        Constraints.setTextFieldInteger(txtId);
        Constraints.setTextFieldMaxLength(txtName, 30);

    }

    private void updateFormData(){
        if (entity == null){
            throw new IllegalStateException("Entidade nula");
        }
        
        txtId.setText(String.valueOf(entity.getId()));
        txtName.setText(entity.getName());
    }

}

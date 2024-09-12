package com.example.demo;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class CreateMyTreasureController implements Initializable {
    @FXML
    private Button btnSubmit;

    @FXML
    private TextField txtComment;

    @FXML
    private TextField txtLocation;

    @FXML
    private TextField txtName;

    @FXML
    private Label lblTreasure;


    @FXML
    private ComboBox<String> cmbLocation;


    public void CreateNewTreasure(ActionEvent actionEvent) {

        MyTreasure myTreasure = new MyTreasure();
        myTreasure.setName(txtName.getText());
        myTreasure.setLocation(cmbLocation.getSelectionModel().getSelectedItem());
        myTreasure.setComment(txtComment.getText());

        lblTreasure.setVisible(true);
        lblTreasure.setText(myTreasure.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblTreasure.setVisible(false);
        cmbLocation.getItems().addAll(Arrays.asList("Shed","Garage","Basement"));
    }
}

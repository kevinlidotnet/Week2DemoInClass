package com.example.demo;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class CreateMyTreasureController {
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


    public void CreateNewTreasure(ActionEvent actionEvent) {
        MyTreasure myTreasure = new MyTreasure();
        myTreasure.setName(txtName.getText());
        myTreasure.setLocation(txtLocation.getText());
        myTreasure.setComment(txtComment.getText());
        lblTreasure.setText(myTreasure.toString());
    }
}

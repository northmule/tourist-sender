package ru.coderun.touristsender.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainSettings {

    @FXML
    private TextField address;

    @FXML
    private Button checkConnect;

    @FXML
    private Label connectResult;

    @FXML
    private ImageView logoImage;

    @FXML
    private AnchorPane mainWindow;

    @FXML
    private TextField nameBd;

    @FXML
    private TextField passwordBd;

    @FXML
    private TextField port;

    @FXML
    private Button save;

    @FXML
    private TextField userBd;

    @FXML
    void onClickCheckConnect(ActionEvent event) {

    }

    @FXML
    void onClickSave(ActionEvent event) {

    }

}

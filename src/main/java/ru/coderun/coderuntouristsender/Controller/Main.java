package ru.coderun.coderuntouristsender.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Main
{

    @FXML
    private AnchorPane mainWindow;

    @FXML
    private AnchorPane bottomWindow;

    @FXML
    private Button buttonLogin;

    @FXML
    private TextField inputLogin;

    @FXML
    private PasswordField inputPassword;

    private String prevText;

    @FXML
    public void onClickButtonLogin(ActionEvent event)
    {
        if (!prevText.equals("Нажал")) {
            prevText = buttonLogin.getText();
        }
        buttonLogin.setText(prevText);
    }

}

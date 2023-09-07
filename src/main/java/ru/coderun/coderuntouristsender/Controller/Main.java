package ru.coderun.coderuntouristsender.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ru.coderun.coderuntouristsender.MainApplication;

import java.io.IOException;
import java.net.URL;

public class Main {

    @FXML
    private Button buttonLogin;

    @FXML
    private TextField inputLogin;

    @FXML
    private PasswordField inputPassword;

    @FXML
    private ImageView logoImage;

    @FXML
    private AnchorPane mainWindow;

    @FXML
    private ImageView settingIcon;

    @FXML
    void onClickButtonLogin(ActionEvent event) {

    }

    @FXML
    void onClickSettingIcon(MouseEvent event) {
        settingIcon.getScene().getWindow().hide();
        Stage main = (Stage)settingIcon.getScene().getWindow();
        URL fxmlLocation = getClass().getResource("/ru/coderun/coderuntouristsender/main-settings.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);
        Parent newWindow;
        try {
            newWindow = fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        main.setScene(new Scene(newWindow));
        main.show();

    }

}

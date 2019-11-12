package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Division extends Observer {

    private Stage stage;

    @FXML
    private Label labelDivision;

    public Division(final Subject subject) {
        super(subject);

        // Create the new stage
        this.stage = new Stage();

        // Load the FXML file
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gui/Division.fxml"));

            // Set this class as the controller
            loader.setController(this);

            // Load the scene
            this.stage.setScene(new Scene(loader.load()));

            // Setup the window/stage
            this.stage.setTitle("Division");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void showStage() {
        this.stage.show();
    }

    @Override
    void update() {
        this.labelDivision.setText("The Division is: " + subject.getNumberA()/subject.getNumberB());
    }
}

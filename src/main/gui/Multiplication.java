package main.gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import main.Observer;
import main.Subject;

import java.io.IOException;

public class Multiplication extends Observer {

    private Stage stage;

    @FXML
    private Label labelMultiplication;

    public Multiplication(Subject subject) {
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


    @Override
    public void update() {
        this.labelMultiplication.setText("Division is: " + subject.getNumberA()/subject.getNumberB());
    }
}

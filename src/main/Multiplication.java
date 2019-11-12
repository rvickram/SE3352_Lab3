package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gui/Multiplication.fxml"));

            // Set this class as the controller
            loader.setController(this);

            // Load the scene
            this.stage.setScene(new Scene(loader.load()));

            // Setup the window/stage
            this.stage.setTitle("Multiplication");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void showStage() {
        this.stage.show();
    }


    @Override
    public void update() {
        this.labelMultiplication.setText("Multiplication is: " + subject.getNumberA()*subject.getNumberB());
    }
}

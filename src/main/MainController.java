package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    private Stage stage;
    private Subject subject;

    public MainController() {
        // Create the new stage
        stage = new Stage();

        // Load the FXML file
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gui/main.fxml"));

            // Set this class as the controller
            loader.setController(this);

            // Load the scene
            stage.setScene(new Scene(loader.load()));

            // Setup the window/stage
            stage.setTitle("SE3352 - Lab 3");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    void showStage() {
        this.stage.showAndWait();
    }


    @FXML
    void actionOpenWindows(ActionEvent event) {
        //instantiate the numbersubject class (stores values)
        this.subject = new NumberSubject();

        //open all required windows:
        SetNumbersController setNumbersController = new SetNumbersController(this.subject);
        setNumbersController.showStage();

        Division division = new Division(this.subject);
        this.subject.attach(division);
        division.showStage();

        Multiplication multiplication = new Multiplication(this.subject);
        this.subject.attach(multiplication);
        multiplication.showStage();

        Addition addition = new Addition(this.subject);
        this.subject.attach(addition);
        addition.showStage();
    }
}

package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SetNumbersController {

    private Stage stage;
    private Subject subject;

    @FXML
    private TextField textboxValueA;
    @FXML
    private TextField textboxValueB;
    @FXML
    private Button buttonSave;


    public SetNumbersController(final Subject subject) {
        // Create the new stage
        stage = new Stage();

        // Load the FXML file
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gui/SetNumbers.fxml"));

            // Set this class as the controller
            loader.setController(this);

            // Load the scene
            stage.setScene(new Scene(loader.load()));

            // Setup the window/stage
            stage.setTitle("Set Numbers");

            this.subject = subject;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void showStage() {
        this.stage.show();
    }

    @FXML
    void actionSave(ActionEvent event) {
        if (textboxValueA.getText().trim().isEmpty() || textboxValueB.getText().isEmpty()) {
            Main.showErrorMsg("You must enter an integer value for both numbers!");
        }
        else {
            try {
                int numberA = Integer.parseInt(textboxValueA.getText());
                int numberB = Integer.parseInt(textboxValueB.getText());

                this.subject.setNumberA(numberA);
                this.subject.setNumberB(numberB);
                this.subject.notifyObservers();
            } catch (NumberFormatException e) {
                e.printStackTrace();
//                Main.showErrorMsg("Invalid number entered!");
            }
        }
    }
}

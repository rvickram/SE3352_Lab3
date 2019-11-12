package main;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        MainController mainController = new MainController();

        mainController.showStage();
    }


    public static void main(String[] args) {
        launch(args);
    }


    public static void showErrorMsg(final String message) {
        try {
            JOptionPane.showMessageDialog(new JFrame(), message, "Error!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

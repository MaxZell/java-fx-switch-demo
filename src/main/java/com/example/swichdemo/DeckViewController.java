package com.example.swichdemo;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class DeckViewController {

    @FXML
    private Label deckNameLabel;

    @FXML
    private Label deckInfoLabel;

    private String deckName;

    private String deckInfo;

    private Pane contentPane;

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public void setDeckInfo(String deckInfo) {
        this.deckInfo = deckInfo;
    }

    public void setContentPane(Pane contentPane) {
        this.contentPane = contentPane;
    }

    public void initialize() {
        deckNameLabel.setText(deckName);
        deckInfoLabel.setText(deckInfo);
    }

    @FXML
    private void goBack() {
        // Load the home screen FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeScreen.fxml"));
        try {
            Parent root = loader.load();
            contentPane.getChildren().setAll(root);
//            Parent root = loader.load();
//            HomeScreenController controller = loader.getController();
////            controller.setContentPane(contentPane);
//
//            // Create a new TranslateTransition to slide the old screen out of view
//            TranslateTransition slideOut = new TranslateTransition(Duration.seconds(0.5), contentPane);
//            slideOut.setFromX(0);
//            slideOut.setToX(-contentPane.getWidth());
//
//            // Set the home screen as the content of the contentPane and play the slide animation
//            contentPane.getChildren().setAll(root);
//            slideOut.setOnFinished(event ->  contentPane.getChildren().setAll(root));
//            slideOut.play();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
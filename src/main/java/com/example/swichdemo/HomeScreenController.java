package com.example.swichdemo;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class HomeScreenController {
    @FXML
    public Pane contentPane;

    @FXML
    private void showDeck1() throws IOException {
        showDeck("Deck 1", "This is the information for Deck 1");
    }

    @FXML
    private void showDeck2() throws IOException {
        showDeck("Deck 2", "This is the information for Deck 2");
    }

    @FXML
    private void showDeck3() throws IOException {
        showDeck("Deck 3", "This is the information for Deck 3");
    }

    private void showDeck(String deckName, String deckInfo) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DeckView.fxml"));
        Parent root = loader.load();
        DeckViewController controller = loader.getController();
        controller.setDeckName(deckName);
        controller.setDeckInfo(deckInfo);
        controller.setContentPane(contentPane);
        controller.initialize();

        contentPane.getChildren().setAll(root);

//        // Create a new TranslateTransition to slide the new screen into view
//        TranslateTransition slideIn = new TranslateTransition(Duration.seconds(0.2), root);
//        slideIn.setFromX(contentPane.getWidth());
//        slideIn.setToX(0);
//
//        // Create a new TranslateTransition to slide the old screen out of view
//        TranslateTransition slideOut = new TranslateTransition(Duration.seconds(0.2), contentPane);
//        slideOut.setFromX(0);
//        slideOut.setToX(-contentPane.getWidth());
//
//        // Set the new screen as the content of the contentPane and play the slide animations
//        contentPane.getChildren().setAll(root);
//        slideOut.setOnFinished(event -> contentPane.getChildren().setAll(root));
//        slideIn.play();
//        slideOut.play();
    }
}
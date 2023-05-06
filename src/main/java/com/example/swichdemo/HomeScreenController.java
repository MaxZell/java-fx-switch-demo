package com.example.swichdemo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.scene.layout.Pane;

public class HomeScreenController {
    @FXML
    private Pane contentPane;

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
        controller.initialize();
        contentPane.getChildren().setAll(root);
    }
}
package com.example.swichdemo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DeckViewController {

    @FXML
    private Label deckNameLabel;

    @FXML
    private Label deckInfoLabel;

    private String deckName;

    private String deckInfo;

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public void setDeckInfo(String deckInfo) {
        this.deckInfo = deckInfo;
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
            Scene scene = new Scene(root);
            Stage stage = (Stage) deckNameLabel.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
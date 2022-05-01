package com.kodilla.piskvorky;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.HashSet;


public class PiskvorkyRunner {

    public void newGame() {

        Piskvorky piskvorky = new Piskvorky();
        while(!piskvorky.isFinishGame()) {
            piskvorky.computerMove();
            piskvorky.playersMove();
            piskvorky.summary(piskvorky.getComputerPositions());
            piskvorky.summary(piskvorky.getPlayersPositions());
        }

        System.out.println("wywołało się");
    }

    public void buttonComputerAction(Integer integer, Button button) {
        Label label = new Label ("");
        if (integer == 1) {
            button.setOnAction (value-> label.setText("O"));
            button.setDisable(true);
        }
    }

    public void buttonHumanAction(Button button) {
        Label label = new Label ("");
        button.setOnAction (value-> label.setText("X"));
        button.setDisable(true);
    }
}

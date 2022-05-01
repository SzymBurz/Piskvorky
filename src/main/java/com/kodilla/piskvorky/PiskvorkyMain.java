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
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PiskvorkyMain extends Application {

    private Image imageback = new Image("file:src/main/resources/background.jpeg");

    public static void main(String[] args){

        launch(args);
        PiskvorkyRunner piskvorkyRunner = new PiskvorkyRunner();
        piskvorkyRunner.newGame();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

            BackgroundSize backgroundSize = new BackgroundSize(600, 600, true, true, true, false);
            BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
            Background background = new Background(backgroundImage);

            Text text = new Text();
            text.setFont(Font.font(72));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(170, 170, 170, 170));
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setBackground(background);

        Button newbtn1 = new Button("1");
        Button newbtn2 = new Button("2");
        Button newbtn3 = new Button("3");
        Button newbtn4 = new Button("4");
        Button newbtn5 = new Button("5");
        Button newbtn6 = new Button("6");
        Button newbtn7 = new Button("7");
        Button newbtn8 = new Button("8");
        Button newbtn9 = new Button("9");

        newbtn1.setMinSize(170, 170);
        newbtn2.setMinSize(170, 170);
        newbtn3.setMinSize(170, 170);
        newbtn4.setMinSize(170, 170);
        newbtn5.setMinSize(170, 170);
        newbtn6.setMinSize(170, 170);
        newbtn7.setMinSize(170, 170);
        newbtn8.setMinSize(170, 170);
        newbtn9.setMinSize(170, 170);

        grid.add(newbtn1, 1, 1, 1, 1);
        grid.add(newbtn2, 1, 2, 1, 1);
        grid.add(newbtn3, 1, 3, 1, 1);
        grid.add(newbtn4, 2, 1, 1, 1);
        grid.add(newbtn5, 2, 2, 1, 1);
        grid.add(newbtn6, 2, 3, 1, 1);
        grid.add(newbtn7, 3, 1, 1, 1);
        grid.add(newbtn8, 3, 2, 1, 1);
        grid.add(newbtn9, 3, 3, 1, 1);

        newbtn1.setOnAction(actionEvent ->  {
            newbtn1.setText("X");
            newbtn1.setDisable(true);
        });

        newbtn2.setOnAction(actionEvent ->  {
            newbtn2.setText("X");
            newbtn2.setDisable(true);
        });

        newbtn3.setOnAction(actionEvent ->  {
            newbtn3.setText("X");
            newbtn3.setDisable(true);
        });

        newbtn4.setOnAction(actionEvent ->  {
            newbtn4.setText("X");
            newbtn4.setDisable(true);
        });

        newbtn5.setOnAction(actionEvent ->  {
            newbtn5.setText("X");
            newbtn5.setDisable(true);
        });

        newbtn6.setOnAction(actionEvent ->  {
            newbtn6.setText("X");
            newbtn6.setDisable(true);
        });

        newbtn7.setOnAction(actionEvent ->  {
            newbtn7.setText("X");
            newbtn7.setDisable(true);
        });

        newbtn8.setOnAction(actionEvent ->  {
            newbtn8.setText("X");
            newbtn8.setDisable(true);
        });

        newbtn9.setOnAction(actionEvent ->  {
            newbtn9.setText("X");
            newbtn9.setDisable(true);
        });

            Scene scene = new Scene(grid, 900, 900, Color.BLACK);

            primaryStage.setTitle("Piskvorky");
            primaryStage.setScene(scene);
            primaryStage.show();

    }
}

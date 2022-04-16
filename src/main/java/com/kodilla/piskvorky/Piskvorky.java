package com.kodilla.piskvorky;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Piskvorky {

    /*
      1 | 2 | 3
      4 | 5 | 6
      7 | 8 | 9
   */
    boolean finishGame = false;

    final Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    final Set<Integer> positions = new HashSet<>(Arrays.asList(arr));
    Set<Integer> playersPositions = new HashSet<>();
    Set<Integer> computerPositions = new HashSet<>();

    public Piskvorky() {

    }

    public void computerMove() {

        for (Integer pos : positions) {
            if(!playersPositions.contains(pos) && computerPositions.size() == playersPositions.size()) {
                computerPositions.add(pos);
            }
        }
    }

    public void playersMove() {

        boolean endMove = false;

        while (!endMove) {
            Scanner myInput = new Scanner(System.in);
            int a = myInput.nextInt();
            if (a > 0 && a < 10 && !computerPositions.contains(a)) {
                playersPositions.add(a);
                endMove = true;
            }
        }
    }

    public void summary(HashSet<Integer> set) {

        // winning scenarios

        final Integer[] a = { 1, 2, 3 };
        final Integer[] b = { 4, 5, 6 };
        final Integer[] c = { 7, 8, 9 };
        final Integer[] d = { 1, 4, 7 };
        final Integer[] e = { 2, 5, 8 };
        final Integer[] f = { 3, 6, 9 };
        final Integer[] g = { 1, 5, 9 };
        final Integer[] h = { 3, 5, 7 };

        if (set.contains(a) || set.contains(b) || set.contains(c) || set.contains(d) || set.contains(e) || set.contains(f) || set.contains(g) || set.contains(h)) {
            System.out.println(set + " has won!");
            finishGame = true;
        } else if (set.size() == 5) {
            System.out.println("nobody has won!");
        }
    }

    public boolean isFinishGame() {
        return finishGame;
    }

    public Set<Integer> getPlayersPositions() {
        return playersPositions;
    }

    public Set<Integer> getComputerPositions() {
        return computerPositions;
    }
}

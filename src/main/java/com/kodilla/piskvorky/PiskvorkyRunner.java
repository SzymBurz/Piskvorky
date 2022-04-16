package com.kodilla.piskvorky;

import java.util.HashSet;

public class PiskvorkyRunner {

    public void newGame() {

        Piskvorky piskvorky = new Piskvorky();

        while(!piskvorky.isFinishGame()) {
            piskvorky.computerMove();
            piskvorky.playersMove();
            piskvorky.summary((HashSet<Integer>) piskvorky.getComputerPositions());
            piskvorky.summary((HashSet<Integer>) piskvorky.getPlayersPositions());
        }
    }
}

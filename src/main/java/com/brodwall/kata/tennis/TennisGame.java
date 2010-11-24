package com.brodwall.kata.tennis;

public class TennisGame {

    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    public void playerOneScores() {
        this.playerOneScore++;
    }

    public void playerTwoScores() {
        this.playerTwoScore++;
    }

    public String getScore() {
        if (playerOneScore >= 4 || playerTwoScore >= 4) {
            if (playerOneScore > playerTwoScore + 1) {
                return "player one wins";
            }
            if (playerTwoScore > playerOneScore + 1) {
                return "player two wins";
            }
            if (playerOneScore == playerTwoScore+1) {
                return "advantage player one";
            }
            if (playerTwoScore == playerOneScore+1) {
                return "advantage player two";
            }
        }
        if (playerOneScore != playerTwoScore) {
            return getScoreName(playerOneScore) + "-" + getScoreName(playerTwoScore);
        } else if (playerOneScore >= 3) {
            return "deuce";
        } else {
            return getScoreName(playerOneScore) + "-all";
        }
    }

    private String getScoreName(int score) {
        String[] scoreNames = new String[] { "love", "fifteen", "thirty", "forty" };
        return scoreNames[score];
    }


}

package sk.zemco.appslabexercises;

import java.util.List;

public class ShiritoriRoundResult {

    private final boolean gameOver;
    private final List<String> words;

    public ShiritoriRoundResult(boolean gameOver, List<String> words) {
        this.gameOver = gameOver;
        this.words = words;
    }

    public static ShiritoriRoundResult gameOver() {
        return new ShiritoriRoundResult(true, null);
    }

    public static ShiritoriRoundResult roundOver(List<String> words) {
        return new ShiritoriRoundResult(false, words);
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public List<String> getWords() {
        return words;
    }

}

package sk.zemco.appslabexercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// TODO: finish javadoc
public class Shiritori {

    private List<String> words;
    private boolean gameOver;

    public Shiritori() {
        this.words = new ArrayList<>();
    }

    public List<ShiritoriRoundResult> runGame(String... words) {
        return runGame(Arrays.asList(words));
    }

    public List<ShiritoriRoundResult> runGame(List<String> words) {
        return words.stream()
                .map(this::play)
                .collect(Collectors.toUnmodifiableList());
    }

    public ShiritoriRoundResult play(String word) {
        // check if the game is already over
        if (gameOver) {
            return ShiritoriRoundResult.gameOver();
        }

        // trim leading and trailing whitespace
        if (word != null) {
            word = word.trim();
        }

        if (isWordValid(word)) {
            words.add(word.trim());
            return ShiritoriRoundResult.roundOver(List.copyOf(words));
        }

        this.gameOver = true;
        return ShiritoriRoundResult.gameOver();
    }

    /**
     * Checks if a word is valid move for the next round.
     *
     * @param word word to check
     * @return {@code true} if the word is a valid move, otherwise {@code false}
     */
    private boolean isWordValid(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }

        // check if every character is a letter
        if (!word.chars().allMatch(Character::isLetter)) {
            return false;
        }

        // check if the word is the first played word of a game
        if (words.size() == 0) {
            return true;
        }

        // check if the word was already played
        if (words.contains(word)) {
            return false;
        }

        // check if the last letter of last played word matches the first letter of this word
        String lastWord = words.get(words.size() - 1);
        char lastChar = lastWord.charAt(lastWord.length() - 1);
        char firstChar = word.charAt(0);
        return Character.toLowerCase(lastChar) == Character.toLowerCase(firstChar);
    }

    public void restart() {
        this.gameOver = false;
        this.words = new ArrayList<>();
    }

    public List<String> getWords() {
        return words;
    }

    public boolean isGameOver() {
        return gameOver;
    }

}

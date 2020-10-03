package sk.zemco.appslabexercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ShiritoriTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(List<String> words, List<ShiritoriRoundResult> expectedResults) {
        Shiritori shiritori = new Shiritori();
        List<ShiritoriRoundResult> results = shiritori.runGame(words);

        assertNotNull(results);
        assertEquals(words.size(), results.size());

        boolean shouldGameOver = expectedResults.get(expectedResults.size() - 1).isGameOver();
        assertEquals(shouldGameOver, shiritori.isGameOver());

        for (int i = 0; i < results.size(); i++) {
            ShiritoriRoundResult result = results.get(i);
            ShiritoriRoundResult expectedResult = expectedResults.get(i);

            assertNotNull(result);
            assertEquals(expectedResult.isGameOver(), result.isGameOver());
            assertEquals(expectedResult.getWords(), result.getWords());
        }
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                createTestCase(List.of("word", "dowry", "yodel", "leader", "righteous", "serpent"), -1),
                createTestCase(List.of("motive", "beach", "event"), 1),
                createTestCase(List.of("hive", "eh", "hive"), 2)
        );
    }

    private static Arguments createTestCase(List<String> words, int numOfGoodWords) {
        if (numOfGoodWords == -1) {
            numOfGoodWords = words.size();
        }

        Stream<ShiritoriRoundResult> goodResults = IntStream.range(0, numOfGoodWords)
                .mapToObj(i -> words.stream()
                        .limit(i + 1)
                        .collect(Collectors.toUnmodifiableList()))
                .map(ShiritoriRoundResult::roundOver);

        Stream<ShiritoriRoundResult> gameOverResults = IntStream.range(numOfGoodWords, words.size())
                .mapToObj(i -> ShiritoriRoundResult.gameOver());

        List<ShiritoriRoundResult> results = Stream.concat(goodResults, gameOverResults)
                .collect(Collectors.toUnmodifiableList());

        return Arguments.of(words, results);
    }

}

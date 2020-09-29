package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import sk.zemco.appslabexercises.rps.RPSOption;
import sk.zemco.appslabexercises.rps.RPSResult;
import sk.zemco.appslabexercises.rps.RockPaperScissors;

import java.util.stream.Stream;

public class RockPaperScissorsTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(RPSOption player1, RPSOption player2, RPSResult expected) {
        Assertions.assertEquals(expected, RockPaperScissors.rps(player1, player2));
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of(RPSOption.ROCK, RPSOption.PAPER, RPSResult.PLAYER2),
                Arguments.of(RPSOption.PAPER, RPSOption.ROCK, RPSResult.PLAYER1),
                Arguments.of(RPSOption.PAPER, RPSOption.SCISSORS, RPSResult.PLAYER2),
                Arguments.of(RPSOption.SCISSORS, RPSOption.SCISSORS, RPSResult.DRAW),
                Arguments.of(RPSOption.SCISSORS, RPSOption.PAPER, RPSResult.PLAYER1)
        );
    }

}

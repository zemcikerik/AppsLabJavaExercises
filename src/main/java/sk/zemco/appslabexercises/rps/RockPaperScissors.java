package sk.zemco.appslabexercises.rps;

public final class RockPaperScissors {

    public static RPSResult rps(RPSOption player1, RPSOption player2) {
        if (player1 == player2) {
            return RPSResult.DRAW;
        }

        RPSOption winningMove = switch (player1) {
            case ROCK -> RPSOption.PAPER;
            case PAPER -> RPSOption.SCISSORS;
            case SCISSORS -> RPSOption.ROCK;
        };

        return player2 != winningMove ? RPSResult.PLAYER1 : RPSResult.PLAYER2;
    }

    private RockPaperScissors() { }

}

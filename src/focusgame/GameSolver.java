package focusgame;

import java.util.Random;

public class GameSolver {

    int play(NumberGame game) {
        int upper = game.getUpperBound();
        int lower = 0;
        int guess = upper / 2;
        long seed = System.nanoTime();
        Random rand = new Random(seed);
// get a random number between 0 and 9. Add 1 so the value is 1 - 10.
        while (game.guess(guess) == false) {

            if (game.getMessage().equals("too small")) {

                lower = guess;

            }
            if (game.getMessage().equals("too large")) {
                upper = guess;

            }
            guess = rand.nextInt(upper-lower) + lower + 1;
        }
        return guess;
    }
}

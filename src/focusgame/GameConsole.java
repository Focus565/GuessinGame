package focusgame;

import java.util.Scanner;

public class GameConsole {

    public int play(NumberGame game) {
        Scanner cmd = new Scanner(System.in);
        System.out.println(game);
        System.out.println(game.getMessage());
        int guess = cmd.nextInt();
        while (game.guess(guess) == false) {
            System.out.println(game.getMessage());
            cmd = new Scanner(System.in);
            guess = cmd.nextInt();
        }
        return guess;
    }
}

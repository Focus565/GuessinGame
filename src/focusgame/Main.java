/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focusgame;

/**
 *
 * @author Focus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumberGame game = new FocusGame(100);
        GameSolver test = new GameSolver();
        GameConsole ui = new GameConsole();
        
        System.out.println("Answer is " + test.play(game));
        System.out.println(game.getCount());
    }

}

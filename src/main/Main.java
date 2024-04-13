package main;
import javax.swing.JFrame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ///balls
        System.out.println("new Game");
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure!");

        GamePanel game = new GamePanel();
        window.add(game);
        window.pack();


        window.setLocationRelativeTo(null);
        window.setVisible(true);
        game.setUpGame();
//        game.requestFocusInWindow();
        game.startGameThread();
    }
}
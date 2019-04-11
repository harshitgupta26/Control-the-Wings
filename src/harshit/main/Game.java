package harshit.main;

import javax.swing.*;
import java.awt.*;

public class Game {

    public static final int GAME_HEIGHT = 500;
    public static final int GAME_WIDTH = 800;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel panel = new GamePanel();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

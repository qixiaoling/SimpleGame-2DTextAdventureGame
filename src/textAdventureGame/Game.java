package textAdventureGame;

import javax.swing.*;
import java.awt.*;

public class Game {
    JFrame myWindow;
    Container con;
    public static void main(String[] args) {
        new Game();
    }

    public Game(){
        myWindow = new JFrame();
        myWindow.setSize(800, 600);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.getContentPane().setBackground(Color.BLACK);
        myWindow.setVisible(true);
        con = myWindow.getContentPane();

    }
}

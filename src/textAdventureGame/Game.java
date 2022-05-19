package textAdventureGame;

import javax.swing.*;
import java.awt.*;

public class Game {
    JFrame myWindow;
    Container con;

    JPanel titleNamePanel;
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

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.BLUE);
        con.add(titleNamePanel);

    }
}

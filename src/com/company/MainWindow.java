package com.company;

import com.company.classes.MonsterClass;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(int weight, int height, Team team, MonsterClass[] monsters) {
        setSize(weight, height);
        /*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int locationX = (int) ((screenSize.getWidth() - weight) / 2);
        int locationY = (int) ((screenSize.getHeight() - height) / 2);
        setLocation(locationX, locationY);*/
        setLocationRelativeTo(null);
        add(new GameField(team, monsters));
        setVisible(true);
    }
}

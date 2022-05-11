package com.company.classes.monsters;

import com.company.classes.CharacterClass;
import com.company.classes.MonsterClass;

import javax.swing.*;

public class RetardedBat extends MonsterClass {

    public RetardedBat(CharacterClass[] players) {
        super(players);
        this.speed = 1000;
        this.attackAmount = 100;
        this.health = 50;
        this.maxHealth = 50;
        this.image = new ImageIcon("images/monster/bat.png").getImage();
    }
}

package com.company.classes.characters;

import com.company.classes.CharacterClass;

public class Archer  extends CharacterClass {
    public Archer(String name, int x, int y, int leftKey, int rightKey, int upKey, int downKey, int leftAttackKey, int rightAttackKey, int abilityKey) {
        super(name, x, y, leftKey, rightKey, upKey, downKey, leftAttackKey, rightAttackKey,1,2, abilityKey);
        this.setAttackAmount(50);
        this.setMaxHealthPoints(500);
        setHealthPoints(500);
        this.className = "Archer";
        /*this.setLevel(1);
        this.setMaxHealthPoints(1000);
        this.setHealthPoints(1000);
        this.setManaPoints(200);
        this.setMaxManaPoints(200);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(5);
        this.setName(name);*/

        /*this.setX(300);
        this.setY(300);*/
        this.uploadImage("images/archer/base.png", "images/archer/left.png", "images/archer/right.png");


    }

    public void left() {
        int newPositionX = this.getX() >= 40 ?  this.getX() - 40 : 320;
        tryChangePosition(newPositionX, this.getY());
    }
    public void right() {
        int newPositionX = this.getX() < 320 ?  this.getX() + 40 : 0;
        tryChangePosition(newPositionX, this.getY());

    }
    public void up() {
        int newPositionY = this.getY() >= 80 ?  this.getY() - 80 : 320;
        tryChangePosition(this.getX(), newPositionY);
    }
    public void down() {
        int newPositionY = this.getY() < 320 ?  this.getY() + 80 : 0;
        tryChangePosition(this.getX(), newPositionY);
    }
}

package com.lobotomycardgame.gamecore.models;

public class UnitCard extends Card{
    int defense;
    int attack;


    public UnitCard (
            String name, int attack , int defense
    ){
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

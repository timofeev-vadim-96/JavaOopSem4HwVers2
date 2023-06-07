package tasks.impl;

import tasks.Hero;

public class Mage extends Hero {
    private int mana;

    public Mage(String nickname, int health, int mana, int level) {
        super(nickname, health, level);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return String.format("Nickname: %s, health: %s, mana: %s, level: %s", nickname, health, mana, level);
    }
}

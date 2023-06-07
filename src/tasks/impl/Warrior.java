package tasks.impl;

import tasks.Hero;

public class Warrior extends Hero{
    public int stamina;

    public int getStamina() {
        return stamina;
    }

    public Warrior(String nickname, int health, int stamina, int level) {
        super(nickname, health, level);
        this.stamina = stamina;
    }


    @Override
    public String toString() {
        return String.format("Nickname: %s, health: %s, stamina: %s, level: %s", nickname, health, stamina, level);
    }
}

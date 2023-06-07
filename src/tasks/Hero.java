package tasks;

public abstract class Hero implements Comparable<Hero> {
    protected String nickname;
    protected int health;
    protected int level;

    public Hero(String nickname, int health, int level) {
        this.nickname = nickname;
        this.health = health;
        this.level = level;
    }

    @Override
    public int compareTo(Hero inputHero) {
        return Integer.compare(this.level, inputHero.level);
    }
}

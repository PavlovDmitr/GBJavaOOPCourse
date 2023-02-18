package units;

import java.util.Random;

public abstract class BaseHero implements Interf {

    protected int attack;
    protected int defens;
    protected int minDmg;
    protected int maxDmg;
    protected int currentHp;
    protected int maxHp;
    protected int speed;
    protected String heroID;
    protected Team team;


    public BaseHero(int hp, int speed, int defens, int minDmg, int maxDmg) {
        this.attack = 1;
        this.defens = defens;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.currentHp = hp;
        this.maxHp = hp;
        this.speed = speed;

        this.heroID = String.valueOf(HeroesNames.values()[new Random().nextInt(HeroesNames.values().length)]);
    }

    public BaseHero() {
        this(1, 1, 1, 1, 1);
    }

    public void healed(int heal) {
        this.currentHp = heal + this.currentHp > this.maxHp ? this.maxHp : heal + this.currentHp;
    }

    public void GetDamage(int damage) {
        if (this.currentHp - damage > 0) {
            this.currentHp -= damage;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public String getName(){
        return this.heroID;
    }

    public Team getTeam() {
        return team;
    }

    
}
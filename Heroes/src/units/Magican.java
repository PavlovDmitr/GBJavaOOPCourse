package units;

public class Magican extends BaseHero {
        private int mana;

    public Magican(int hp, int speed, int defens, int minDmg, int maxDmg, int mana) {
        super(hp, speed, defens, minDmg, maxDmg);
        this.mana = mana;
    }

    public Magican(int hp, int mana) {
        this(hp, 110, 30, -20, -30, mana);
        
    }

    public Magican(int mana) {
        this(100, mana);
    }

    public Magican(Team nameTeam){
        this(50);
        super.team = nameTeam;
    }


    @Override
    public String getInfo() {
        return "Маг ".concat(heroID);
    }

    @Override
    public void step() {
        
        
    }
}

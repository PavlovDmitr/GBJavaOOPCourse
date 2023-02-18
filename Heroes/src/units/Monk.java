package units;

public class Monk extends BaseHero {
        private int mana;

    public Monk(int hp, int speed, int defens, int minDmg, int maxDmg, int mana) {
        super(hp, speed, defens, minDmg, maxDmg);
        this.mana = mana;
    }

    public Monk(int hp, int mana) {
        this(hp, 120, 30, -50, -50, mana);
        
    }

    public Monk(int mana) {
        this(180, mana);
    }

    public Monk(Team nameTeam){
        this(50);
        super.team = nameTeam;
    }


    @Override
    public String getInfo() {
        return "Монах ".concat(heroID);
    }

    @Override
    public void step() {
        
        
    }
}

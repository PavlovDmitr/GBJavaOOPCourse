package units;

public class Archer extends BaseHero {
        private int shoots;

    public Archer(int hp, int speed, int defens, int minDmg, int maxDmg, int shoots) {
        super(hp, speed, defens, minDmg, maxDmg);
        this.shoots = shoots;
    }

    public Archer(int hp, int shoots) {
        this(hp, 200, 20, 30, 35, shoots);
    }

    public Archer(int shoots) {
        this(150, shoots);
    }

    public Archer(Team nameTeam){
        this(30);
        super.team = nameTeam;
    }

    @Override
    public String getInfo() {
        return "Лучник ".concat(heroID);
    }

    @Override
    public void step() {
        
        
    }
}

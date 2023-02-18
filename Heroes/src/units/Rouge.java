package units;

public class Rouge extends BaseHero {
        private int lacky;

    public Rouge(int hp, int speed, int defens, int minDmg, int maxDmg, int lacky) {
        super(hp, speed, defens, minDmg, maxDmg);
        this.lacky = lacky;
    }

    public Rouge(int hp, int lacky) {
        this(hp, 250, 30, 30, 35, lacky);
        
    }

    public Rouge(int lacky) {
        this(180, lacky);
    }

    public Rouge(Team nameTeam) {
        this(1);
        super.team = nameTeam;
    }



    @Override
    public String getInfo() {
        return "Разбойник ".concat(heroID);
    }

    @Override
    public void step() {
        
        
    }
}

package units;

public class Spearman extends BaseHero {
        private int shoots;

    public Spearman(int hp, int speed, int defens, int minDmg, int maxDmg, int shoots) {
        super(hp, speed, defens, minDmg, maxDmg);
        this.shoots = shoots;
    }

    public Spearman(int hp, int shoots) {
        this(hp, 150, 50, 45, 50, shoots);
    }

    public Spearman(int shoots) {
        this(250, shoots);
    }

    public Spearman(Team nameTeam) {
        this(10);
        super.team = nameTeam;
    }


    @Override
    public String getInfo() {
        return "Копейщик ".concat(heroID);
    }

    @Override
    public void step() {
        
        
    }
}

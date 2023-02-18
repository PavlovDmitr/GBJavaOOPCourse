package units;

public class Arbalester extends BaseHero {
        private int shoots;

    public Arbalester(int hp, int speed, int defens, int minDmg, int maxDmg, int shoots) {
        super(hp, speed, defens, minDmg, maxDmg);
        this.shoots = shoots;
    }

    public Arbalester(int hp, int shoots) {
        this(hp, 150, 30, 40, 50, shoots);
        
    }

    public Arbalester(int shoots) {
        this(200, shoots);
    }

    public Arbalester(Team nameTeam){
        this(20);


        super.team = nameTeam;
    }


    @Override
    public String getInfo() {
        return "Арбалетчик ".concat(heroID);
    }

    @Override
    public void step() {
        
        
    }
}

package units;

public class Villager extends BaseHero {
    private int delivery;

    public Villager(int hp, int speed, int defens, int minDmg, int maxDmg, int delivery) {
        super(hp, speed, defens, minDmg, maxDmg);
        this.delivery = delivery;
    }

    public Villager(int hp, int delivery) {
        this(hp, 100, 10, 1, 2, delivery);

    }

    public Villager(int delivery) {
        this(80, delivery);
    }

    public Villager(Team nameTeam) {
        this(1);
        super.team = nameTeam;
    }

    @Override
    public String getInfo() {
        return "Крестьянин ".concat(heroID);
    }

    @Override
    public void step() {

    }
}

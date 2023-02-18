import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import units.*;


public class Main {
    public static void main(String[] args) {
        List<BaseHero> team1 = createTeam(Team.RED);
        List<BaseHero> team2 = createTeam(Team.BLUE);

        List<BaseHero> fight = new ArrayList<>();
        fight.addAll(team1);
        fight.addAll(team2);


        fight.sort(new Comparator<BaseHero>() {
            
            @Override
            public int compare(BaseHero o1, BaseHero o2){
                return o2.getSpeed() - o1.getSpeed();
            }
        });

        for (BaseHero baseHero : fight) {
            System.out.printf("%s | %s | %s, \n", baseHero.getInfo(), baseHero.getSpeed(), baseHero.getTeam());
        }


    }
    public static List<BaseHero> createTeam(Team name) {
        List<BaseHero> team = new ArrayList<>();

        int teamsUnitsCount = 10;
        for (int i = 0; i < teamsUnitsCount; i++) {
            switch (new Random().nextInt(0,8)) {
                case 0:
                    team.add(new Magican(name));
                    break;
                case 1:
                    team.add(new Magican(name));
                    break;
                case 2:
                    team.add(new Arbalester(name));
                    break;
                case 3:
                    team.add(new Archer(name));
                    break;
                case 4:
                    team.add(new Monk(name));
                    break;
                case 5:
                    team.add(new Rouge(name));
                    break;
                case 6:
                    team.add(new Spearman(name));
                    break;
                case 7:
                    team.add(new Villager(name));
                    break;
            }
            
        }
        return team;
    }
}



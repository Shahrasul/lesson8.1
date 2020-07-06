package kg.geektech.les8.game.players;

public class RPG_Game {
    public static void start() {
        Boss boss = new Boss(50, 10000);
        Warrior warrior = new Warrior(15, 250, "Warrior");
        Magic magic = new Magic(15, 250, "Joldow-Alladin");
        Medic medic = new Medic(0, 230, 20, "Aibolit");
        Medic youngMedic = new Medic(0, 260, 5, "Med brat");
        Hunter hunter = new Hunter(25, 270, "Hunter");
        Thor thor = new Thor(25,300,"God of Thunder");
        Golem golem = new Golem(5,1000,"Gaga");
        Witcher witcher = new Witcher(0,300,"BABA YAGA");

        Hero[] heroes = {warrior, magic, medic, youngMedic, hunter, thor,golem} ;

        printStatistics(boss, heroes);
        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes);
        }
    }

    private static void round(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0) {
            if (boss.isStun()){
                heroesHit(boss, heroes);
                heroesApplySuperAbilities(boss,heroes);
                boss.setStun(false);
            }else {
                bossHit(boss, heroes);
                heroesHit(boss, heroes);
                heroesApplySuperAbilities(boss, heroes);
            }
        }
        printStatistics(boss, heroes);
    }

    private static void bossHit(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
                if (hero.getHealth() > 0) {
                    hero.setHealth(hero.getHealth() - boss.getDamage());
                }
        }
    }

    private static void heroesHit(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());
            }
        }
    }

    private static void heroesApplySuperAbilities(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].applySuperAbility(boss, heroes);
            }
        }
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("_________________");
        System.out.println("Boss health: " + boss.getHealth() + "[" + boss.getDamage() + "]");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getName() +
                    " health: " + heroes[i].getHealth() + "[" + heroes[i].getDamage() + "]");
        }
        System.out.println("_________________");
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }
}

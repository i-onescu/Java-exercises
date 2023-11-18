package exercise1;

public class Main {
    public static void main(String[] args) {
        Monster vampire = new Vampire();
        Monster werewolf = new Werewolf();
        Monster zombie = new Zombie();

        Monster[] monsters = new Monster[]{vampire, zombie, werewolf};
        showStats(monsters);

        //vampire fights werewolf
        fight(vampire, werewolf);
        System.out.println();

        showStats(monsters);

        //Winner fights zombie
        if (vampire.getHp() > 0) {
            vampire.setHp(10);
            fight(vampire, zombie);
        } else if (werewolf.getHp() < 0) {
            vampire.setHp(10);
            fight(werewolf, zombie);
        }
        System.out.println();

        showStats(monsters);
    }

    public static void fight(Monster monster1, Monster monster2) {
        while ((monster1.getHp() > 0) && (monster2.getHp() > 0)) {
            monster1.attack(monster2);
            if (monster2.getHp() <= 0) {
                System.out.println("The " + monster1.getMonster() + " has slain the " + monster2.getMonster() + ".");
                break;
            }
            monster2.attack(monster1);
            if (monster1.getHp() <= 0) {
                System.out.println("The " + monster2.getMonster() + " has slain the " + monster1.getMonster() + ".");
                break;
            }
        }
    }

    public static void showStats(Monster[] monsters){
        //it was too late when I realized that I could just do "monster.toString()" because i already overwrote toString() in each Monster subclass
        for (Monster monster : monsters) {
            if (monster instanceof Vampire vampire1) {
                System.out.println(((Vampire) monster).toString());
            } else if (monster instanceof Werewolf werewolf1) {
                System.out.println(((Werewolf) monster).toString());
            } else if (monster instanceof Zombie zombie1) {
                System.out.println(((Zombie) monster).toString());
            }
        }
        System.out.println();
    }

}


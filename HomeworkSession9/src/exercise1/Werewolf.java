package exercise1;

import java.util.Random;

public class Werewolf extends Monster {
    @Override
    public void attack(Monster theEnemy) {
        Random random = new Random();
        switch (random.nextInt(1, 5)) {
            case 1 -> {
                System.out.println("Werewolf throws the enemy a distance. The enemy gets up and recovers swiftly.");
                inflictDamage(1,theEnemy);
            }
            case 2 -> {
                System.out.println("Werewolf strikes enemy with a kick to the body, breaking its ribs.");
                inflictDamage(2,theEnemy);
            }
            case 3 -> {
                System.out.println("Werewolf claws the enemy with its giant claws, and tears its flesh.");
                inflictDamage(3,theEnemy);
            }
            case 4 -> {
                System.out.println("Werewolf goes insane with rage and rips one of the enemies limbs off.");
                inflictDamage(4,theEnemy);
            }
        }
    }

    @Override
    public void attack(Monster theEnemy, int attackPower) {
        switch (attackPower) {
            case 1 -> {
                System.out.println("Werewolf throws the enemy a distance. The enemy gets up and recovers swiftly.");
                inflictDamage(1,theEnemy);
            }
            case 2 -> {
                System.out.println("Werewolf strikes enemy with a kick to the body, breaking its ribs.");
                inflictDamage(2,theEnemy);
            }
            case 3 -> {
                System.out.println("Werewolf claws the enemy with its giant claws, and tears its flesh.");
                inflictDamage(3,theEnemy);
            }
            case 4 -> {
                System.out.println("Werewolf goes insane with rage and rips one of the enemies limbs off.");
                inflictDamage(4,theEnemy);
            }
            default -> System.out.println("Zombie cannot attack with that power.");
        }
    }

    @Override
    public String toString() {
        if (hp > 0) {
            return "Werewolf{Health Points =" + getHp() + ", alive}";
        } else {
            return "Werewolf{Health Points =" + getHp() + ", dead}";
        }
    }
}

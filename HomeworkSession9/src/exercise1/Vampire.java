package exercise1;

import java.util.Random;

public class Vampire extends Monster {
    @Override
    public void attack(Monster theEnemy) {
        Random random = new Random();
        switch (random.nextInt(1, 5)) {
            case 1 -> {
                System.out.println("Vampire shrieks and disorients the enemy, no damage done.");
                inflictDamage(1, theEnemy);
            }
            case 2 -> {
                System.out.println("Vampire strikes the enemy with its claws and cuts its flesh.");
                inflictDamage(2, theEnemy);
            }
            case 3 -> {
                System.out.println("Vampire bites the enemy and partially drains its body of blood.");
                inflictDamage(3, theEnemy);
            }
            case 4 -> {
                System.out.println("Vampire summons swarm of rabid bats upon the enemy and wreaks destruction on its body.");
                inflictDamage(4, theEnemy);
            }
        }
    }

    @Override
    public void attack(Monster theEnemy, int attackPower) {
        switch (attackPower) {
            case 1 -> {
                System.out.println("Vampire shrieks and disorients the enemy, no damage done.");
                inflictDamage(1, theEnemy);
            }
            case 2 -> {
                System.out.println("Vampire strikes the enemy with its claws and cuts its flesh.");
                inflictDamage(2, theEnemy);
            }
            case 3 -> {
                System.out.println("Vampire bites the enemy and partially drains its body of blood.");
                inflictDamage(3, theEnemy);
            }
            case 4 -> {
                System.out.println("Vampire summons swarm of rabid bats upon the enemy and wreaks destruction on its body.");
                inflictDamage(4, theEnemy);
            }
            default -> System.out.println("Vampire cannot attack with that power.");
        }
    }

    @Override
    public String toString() {
        if (hp > 0) {
            return "Vampire{Health Points =" + getHp() + ", alive}";
        } else {
            return "Vampire{Health Points =" + getHp() + ", dead}";
        }
    }
}

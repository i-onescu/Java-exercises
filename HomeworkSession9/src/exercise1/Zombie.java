package exercise1;

import java.util.Random;

public class Zombie extends Monster {
    @Override   //when method is called without parameter it applies a random attack
    public void attack(Monster theEnemy) {
        Random random = new Random();
        switch (random.nextInt(1, 5)) {
            case 1 -> {
                System.out.println("Zombie flails its arms towards the enemy... Misses.");
                inflictDamage(1, theEnemy);
            }
            case 2 -> {
                System.out.println("Zombie strikes a hard blow to the head of the enemy.");
                inflictDamage(2, theEnemy);
            }
            case 3 -> {
                System.out.println("Zombie bites the enemy, ripping its flesh and inflicting poison damage on the enemy.");
                inflictDamage(3, theEnemy);
            }
            case 4 -> {
                System.out.println("Zombie jumps on the enemy and claws viciously inflicting maximum damage.");
                inflictDamage(4, theEnemy);
            }
        }
    }

    @Override
    public void attack(Monster theEnemy, int attackPower) {
        switch (attackPower) {
            case 1 -> {
                System.out.println("Zombie flails its arms towards the enemy... Misses.");
                inflictDamage(1, theEnemy);
            }
            case 2 -> {
                System.out.println("Zombie strikes a hard blow to the head of the enemy.");
                inflictDamage(2, theEnemy);
            }
            case 3 -> {
                System.out.println("Zombie bites the enemy, ripping its flesh and inflicting poison damage on the enemy.");
                inflictDamage(3, theEnemy);
            }
            case 4 -> {
                System.out.println("Zombie jumps on the enemy and claws viciously inflicting maximum damage.");
                inflictDamage(4, theEnemy);
            }
            default -> System.out.println("Zombie cannot attack with that power.");
        }
    }

    @Override
    public String toString() {
        if (hp > 0) {
            return "Zombie{Health Points =" + getHp() + ", alive}";
        } else {
            return "Zombie{Health Points =" + getHp() + ", dead}";
        }
    }
}

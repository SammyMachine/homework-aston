package org.sammyxd;

import java.util.Random;

public class Zombie extends Enemy {
    private static final Random random = new Random();

    public Zombie(int health) {
        super(health);
    }

    @Override
    public boolean isAlive() {
        if (super.isAlive()) {
            return true;
        } else if (random.nextInt(100) < 20) {
            setHealth(10);
            System.out.println("Зомби воскресает с 10 HP!");
            return true;
        }
        return false;
    }
}

package org.sammyxd;

import java.util.Random;

public class Archer extends Hero {
    private static final int DAMAGE = 7;

    private static final Random random = new Random();

    public Archer(String name) {
        super(name, 90);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует врага из лука!");
        if (random.nextInt(100) < 30) {
            System.out.println(getName() + " наносит критический удар!");
            enemy.takeDamage(DAMAGE * 2);
        } else {
            enemy.takeDamage(DAMAGE);
        }
    }
}

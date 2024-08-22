package org.sammyxd;

import java.util.Random;

public class Warrior extends Hero {
    private static final int DAMAGE = 10;

    private static final Random random = new Random();

    public Warrior(String name) {
        super(name, 100);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует врага мечом!");
        enemy.takeDamage(DAMAGE);
    }

    @Override
    public void takeDamage(int damage) {
        if (random.nextInt(100) < 50) {
            System.out.println(getName() + " блокирует атаку и не получает урона!");
        } else {
            super.takeDamage(damage);
        }
    }
}

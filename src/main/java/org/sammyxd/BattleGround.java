package org.sammyxd;

import java.util.List;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Воин");
        Hero mage = new Mage("Маг");
        Hero archer = new Archer("Лучник");

        simulateBattle(warrior, List.of(new Enemy(50), new Zombie(30), new Dragon(100)));
        simulateBattle(mage, List.of(new Enemy(35), new Zombie(25)));
        simulateBattle(archer, List.of(new Enemy(40), new Dragon(80)));
    }

    public static void simulateBattle(Hero hero, List<Enemy> enemies) {
        for (Enemy enemy : enemies) {
            System.out.println("\n" + hero.getName() + " начинает бой с " + enemy.getClass().getSimpleName() + "!");
            while (hero.isAlive() && enemy.isAlive()) {
                hero.attackEnemy(enemy);
                if (enemy.isAlive()) {
                    enemy.attackHero(hero);
                }
            }

            if (!hero.isAlive()) {
                System.out.println(hero.getName() + " пал в бою");
                break;
            } else if (!enemy.isAlive()) {
                System.out.println("Враг " + enemy.getClass().getSimpleName() + " повержен!");
            }
        }

        if (hero.isAlive()) {
            System.out.println("\n" + hero.getName() + " одержал победу над всеми врагами!");
        }
    }
}

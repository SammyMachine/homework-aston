package org.sammyxd;

public class Dragon extends Enemy {
    private static final int DAMAGE = 20;

    public Dragon(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Дракон атакует героя " + hero.getName() + " пламенем и наносит " + DAMAGE + " урона!");
        hero.takeDamage(DAMAGE);
    }
}

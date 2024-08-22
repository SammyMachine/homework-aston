package org.sammyxd;

public class Enemy implements Mortal {
    private static final int DAMAGE = 5;

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    public void attackHero(Hero hero) {
        System.out.println("Враг атакует героя " + hero.getName() + " и наносит " + DAMAGE + " урона!");
        hero.takeDamage(DAMAGE);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println("Враг получил " + damage + " урона, здоровье врага: " + health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}

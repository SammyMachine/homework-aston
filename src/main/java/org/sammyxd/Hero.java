package org.sammyxd;

public abstract class Hero implements Mortal {
    private final String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    protected void heal(int healing) {
        this.health += healing;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " получил " + damage + " урона, здоровье героя: " + health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackEnemy(Enemy enemy);
}

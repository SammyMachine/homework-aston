package org.sammyxd;

public class Mage extends Hero {
    private static final int DAMAGE = 15;
    private static final int HEAL = 3;

    public Mage(String name) {
        super(name, 80);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует врага магией!");
        enemy.takeDamage(DAMAGE);

        selfHealing();
    }

    private void selfHealing() {
        heal(HEAL);
        System.out.println(getName() + " исцеляет себя на " + HEAL + " HP. Здоровье теперь: " + getHealth());
    }
}

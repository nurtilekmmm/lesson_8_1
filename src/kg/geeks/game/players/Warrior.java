package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Warrior extends Hero {
    private int criticalDamage;
    public Warrior(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        this.criticalDamage = RPG_Game.random.nextInt(4) + 2;
        boss.setHealth(boss.getHealth() - this.getDamage() * criticalDamage);
        System.out.println("Warrior hits critically: " +
                this.getDamage() * criticalDamage);
    }
}

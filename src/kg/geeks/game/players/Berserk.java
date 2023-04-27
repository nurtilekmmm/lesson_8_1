package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOCK_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        this.blockedDamage = RPG_Game.random.nextInt(boss.getDamage());
        boss.setHealth(boss.getHealth() - this.getDamage() + blockedDamage);
        System.out.println("Berserk blocked damage and revert:" + this.getDamage() + " + " + blockedDamage);
    }
}
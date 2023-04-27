package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Magic extends Hero {
    private int magicAttack;
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (getHealth() > 0) {
            this.magicAttack = RPG_Game.random.nextInt(10) + 2;
            for (int i = 0; i < heroes.length; i++) {

                if (heroes[i].getHealth() > 0 && heroes[i] != this) {
                    heroes[i].setDamage(heroes[i].getDamage() + magicAttack);
                }
            }
            System.out.println(this.getClass().getSimpleName() + " increased attack of all heroes by " +magicAttack);
        }
    }
}

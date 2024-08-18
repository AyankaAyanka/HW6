public class Boss extends GameEntity{
    private WEAPON weapon;

    public WEAPON getWeapon() {
        return weapon;
    }

    public void setWeapon(WEAPON weapon) {
        this.weapon = weapon;
    }

    public Boss(String name, int damage, int HP, WEAPON weapon) {
        super(HP, damage, name);
        this.weapon = weapon;

    }

        public void printInfo() {
            System.out.println("Boss Name: " + getName());
            System.out.println("HP: " + getHP());
            System.out.println("Damage: " + getDamage());
            System.out.println("Weapon Type: " + weapon.getType());
            System.out.println("Weapon Name: " + weapon.getName());

    }

}


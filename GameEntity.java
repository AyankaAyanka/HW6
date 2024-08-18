public class GameEntity {
    private int HP;
    private int damage;
    private String name;

    public GameEntity(int HP, int damage, String name) {
        this.HP = HP;
        this.damage = damage;
        this.name = name;

    }
    public int getHP() {
        return HP;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setName(String name) {
        this.name = name;
    }
}

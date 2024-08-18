public class Main {
    public static void main(String[] args) {
        WEAPON sword = new WEAPON(WeaponType.SWORD, "Light of Foliar Incision-");
        Boss boss = new Boss("Dark Lord", 1000, 150, sword);
        boss.printInfo();

        WEAPON bow = new WEAPON(WeaponType.BOW, "Hunter's path");
        Sceleton skeleton1 = new Sceleton("Sceleton Archer", 20000, 12000, bow, 12);
        Sceleton skeleton2 = new Sceleton("Sceleton Sniper", 25000, 16000, bow, 15);

        skeleton1.printInfo();
        System.out.println();
        skeleton2.printInfo();
    }
}
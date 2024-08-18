public class Sceleton extends Boss {
    private int arrowCount;

    public Sceleton(String name, int damage, int HP, WEAPON weapon, int arrowCount) {
        super(name, damage, HP, weapon);
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Arrow Count: " + arrowCount);

    }
}

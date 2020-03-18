package lesson7;

public class King extends Unit {
    private int gold;
    public King(int healthScore, int speed, int gold) {
        super(healthScore, speed);
        getGold(gold);
    }


    public int getGold(int gold) {
        return this.gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public void Rest(Unit rest) {
        System.out.println("Король отдыхает");
    }
}

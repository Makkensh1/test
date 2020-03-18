package lesson7;

public class Knight extends BattleUnit {
    private  int horseSpeed;
    public Knight(int healthScore, int speed, int attackScore, int horseSpeed) {
        super(healthScore, speed, attackScore);
        getHorseSpeed(horseSpeed);
    }


    public int getHorseSpeed(int horseSpeed) {
        return this.horseSpeed;
    }

    public void setHorseSpeed(int horseSpeed) {
        this.horseSpeed = horseSpeed;
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Рыцарь атакует");
    }

    @Override
    public void Rest(Unit rest) {
        System.out.println("Рыцарь отдыхает");
    }
}

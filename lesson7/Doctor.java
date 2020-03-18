package lesson7;

public class Doctor extends BattleUnit {
    private  int medicineScore;
    public Doctor(int healthScore, int speed, int attackScore, int medicineScore) {
        super(healthScore, speed, attackScore);
        setMedicineScore(medicineScore);
    }


    public int getMedicineScore() {
        return medicineScore;
    }

    public void setMedicineScore(int medicineScore) {
        this.medicineScore = medicineScore;
    }

    @Override //говорит о том что переопределяем метод родительского класса или  реализация интерфейса
    // TODO: 18.03.20 без Override программа будет работать но это указатель компилятору что мы переопределяем метод
    public void attack(BattleUnit friend) {
        System.out.println("Доктор атакует");
    }

    @Override
    public void Rest(Unit rest) {
        System.out.println("Доктор отдыхает");
    }
}

package lesson7;

abstract public class BattleUnit extends Unit implements CanAttack { //extends наследование implemets -реализация интерфейса
    // класс заключает контракт на реализаицию всех нереализованных методов интерфейса
    // TODO: 18.03.20  множественное наследование классов через extends запрещено
    // TODO: 18.03.20  можно имплиминтировать несколько интерфейсов
    // abstract нельзя создать новый объект (ь.е BattleUnit = new BattleUnit нельзя), могут быть методы с реализацией и без реализации
    protected int attackScore;

    public BattleUnit(int healthScore, int speed, int attackScore) {
        super(healthScore, speed); //super вызов конструктора родительского метода
        setAttackScore(attackScore);
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }
    @Override
    public void runFromField() {
        System.out.println("runFromField CanAttack");
    }
}

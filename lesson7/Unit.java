package lesson7;

abstract public class Unit implements CanRest {
    protected String name = "Unit";
    protected int healthScore; //если модификатор private то дочерним классам не передеается
                // protected  всем дочерним классам + внутри пакета
    protected int speed;

    public Unit(int healthScore, int speed) {
        this.healthScore = healthScore;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getHealthScore() {
        return healthScore;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthScore(int healthScore) {
        this.healthScore = healthScore;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isAlive() {
        return healthScore > 0;
    }
    public  void  run(){
        System.out.println(name + "двигается со скоростью " + speed);
    }
}

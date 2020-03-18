package lesson7;

public interface CanRest {

    void Rest (Unit rest);

    default  void runFromField(){
        System.out.println("runFromField CanRest");
    }
}

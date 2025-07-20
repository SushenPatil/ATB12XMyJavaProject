package ex_20_OOPs_Super_Abstraction;

import java.sql.SQLOutput;

public class Lab187_Interface_P1 {
    public static void main(String[] args) {
     car1 c = new car1();
     c.drive();
    }
}

class car1 implements breaks,engine1{

void drive(){
    Startengine();
    Stopengine();
    applybreak();

}


    @Override
    public void applybreak() {
        System.out.println(" Apply break");
    }


    @Override
    public void Startengine() {
        System.out.println(" Strat engine");
    }

    @Override
    public void Stopengine() {
        System.out.println(" Stop engine");
    }

}

interface breaks{
    void applybreak();
}


interface engine1{
    void Startengine();
    void Stopengine();

    default void testengine(){
        System.out.println(" Engine should be tested");
    }
}

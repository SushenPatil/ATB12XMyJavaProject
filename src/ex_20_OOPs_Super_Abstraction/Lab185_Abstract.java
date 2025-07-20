package ex_20_OOPs_Super_Abstraction;

public class Lab185_Abstract {
    public static void main(String[] args) {
        son s1 = new son();
        s1.loan50k();

    }
}















class  normal{
    // Concrete class -> Complete class
}

abstract class Father{
    // Incomplete abstract method
    abstract void loan50k();


}

class son extends Father{

    @Override
    void loan50k() {
        System.out.println(" Loan given!!");
    }
}
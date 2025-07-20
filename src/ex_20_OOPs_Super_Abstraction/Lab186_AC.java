package ex_20_OOPs_Super_Abstraction;

public class Lab186_AC {
    public static void main(String[] args) {
Wagnor w = new Wagnor();
w.driver();
    }
}
class Wagnor extends engine implements Tyres,Gearbox{

    void  driver(){
        stopengine();
        stopengine();
        blacktyre();
        MRFtyre();


    }

    @Override
    public void blacktyre() {

    }

    @Override
    public void MRFtyre() {

    }

    @Override
    void startengine() {

    }


    // Complete class
}

abstract class engine{

    abstract void startengine(); // -> Incomplete function

     void stopengine(){  // -> Complete function
         System.out.println(" Stop");
     }

}

interface Tyres {

    void blacktyre();// -> Incomplete function

    void MRFtyre();//-> Incomplete function

//    default burnouttyre() { // Complete function with default keyword
//
//    }
//
//    default griptyre() {// Complete function with default keyword
//
//    }
//
//    static roundtyre() {
//
//    }
}
interface Gearbox{

}
package ex_19_OOPs_Part2.poly.methodoverriding;

public class Lab175 {
    public static void main(String[] args) {

        Sushen s1 = new Sushen();
        s1.home();
        s1.work();

        Father f1 = new Father();
        f1.home();
        f1.work();

        Father f2 = new Sushen(); // Dynamic dispatch
          f2.work();
          f2.home();
    }
}

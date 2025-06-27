package ex_19_OOPs_Part2.poly.methodoverloading;

public class Lab174_MOloading {
    public static void main(String[] args) {


        Mathoperations m1 = new Mathoperations();

        int r = m1.add1(3, 4);
        System.out.println(r);

        int r1 = m1.add2(3,4,5);
        System.out.println(r1);

        double r3 = m1.add3(34.5,45.6);
        System.out.println(r3);

    }
}
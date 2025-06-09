package ex_09_Switch;

public class Practice6 {
    public static void main(String[] args) {


    final int a = 1;
    final int b = 2;
    int x = 3;
switch (x) {
        case a: System.out.println("A"); break;
        case b: System.out.println("B"); break;
        case a + b: System.out.println("A+B"); break; // Error
    }
}
}
//Expected Answer:
//a + b isn’t a compile-time constant. Java requires case values to be literals or final constants.
package Task;

public class Lab_06_Task_18th_May {
    public static void main(String[] args) {
        int a = 11;
        int b = 12;
        int c = a + b + a++ + b++ + ++a + ++b;
        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);

    }
}

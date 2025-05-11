package MyJavaCode;

import java.util.Scanner;

public class Multiplyoftwonumber {
    public static void main(String[] args) {
        System.out.println("Enter the multiply of two number");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        float mul = a * b;
        System.out.println("Multiply of two number =" + mul);
    }
}

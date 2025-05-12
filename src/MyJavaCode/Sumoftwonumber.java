package MyJavaCode;

import java.util.Scanner;

public class Sumoftwonumber {
    public static void main(String[] args) {
        System.out.println("Enter the any two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two number is:" + sum);

    }
}

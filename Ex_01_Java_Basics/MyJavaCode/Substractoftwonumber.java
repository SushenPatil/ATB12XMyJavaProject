package MyJavaCode;

import java.util.Scanner;

public class Substractoftwonumber {
    public static void main(String[] args) {
        System.out.println("Enter the two substract number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sub = a - b;
        System.out.println("Substraction of two number ="  + sub);
    }
}

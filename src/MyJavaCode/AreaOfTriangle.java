package MyJavaCode;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of b");
        double b = sc.nextDouble();
        System.out.println("Enter the value of h");
        double h = sc.nextDouble();

        double A = b*h/2;
        System.out.println("Area of triangle is =" + A);
    }
}

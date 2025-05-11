package MyJavaCode;

import java.util.Scanner;

public class FindTheAreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the  radious of circle");
        Scanner sc = new Scanner(System.in);
        double R1 = sc.nextDouble();
        double R2 = sc.nextDouble();
        double Area = 3.142 * R1 * R2;
        System.out.println("Area of circle = " + Area);
    }
}

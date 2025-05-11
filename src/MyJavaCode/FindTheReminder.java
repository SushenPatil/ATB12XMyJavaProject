package MyJavaCode;

import java.util.Scanner;

public class FindTheReminder {
    public static void main(String[] args) {
        System.out.println("Enter the two number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double reminder = a % b;
        System.out.println(" Reminder of two number =" +  reminder);
    }
}

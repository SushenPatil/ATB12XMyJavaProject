package Task;

// The ternary operator and let me know if I give you a number. Let me know if it is even or odd.

import java.util.Scanner;

public class Lab02_Task_17th_Week {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

String result= (a % 2 == 0) ? "even" : "odd";
        System.out.println("The number " + a + " is " + result + ".");
    }
}

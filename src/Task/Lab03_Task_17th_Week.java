package Task;
/* Use the ternary operator, nested ternary operator.
If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers.*/

import java.util.Scanner;

public class Lab03_Task_17th_Week {
    public static void main(String[] args) {
        System.out.println(" Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        int c = sc.nextInt();
       float result = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);


       System.out.println(result);

    }
}


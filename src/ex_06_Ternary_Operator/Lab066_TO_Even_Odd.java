package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab066_TO_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result = (a%2==0)? "Even":"Odd";
        System.out.println(result);
    }
}

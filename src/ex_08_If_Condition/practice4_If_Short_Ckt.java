package ex_08_If_Condition;

import MyJavaCode.Main;

import java.util.Scanner;

public class practice4_If_Short_Ckt {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        if(a!=0&&b/a>1){
            System.out.println(" Condition is true");
        }
    }
}

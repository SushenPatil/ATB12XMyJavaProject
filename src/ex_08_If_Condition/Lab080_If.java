package ex_08_If_Condition;

import java.util.Scanner;

public class Lab080_If {
    public static void main(String[] args){
        System.out.println("Enter the age");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>18) {
            System.out.println(" You are allowed for Voting...!");

        }
    }
}

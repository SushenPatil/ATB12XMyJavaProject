package ex_08_If_Condition;

import java.util.Scanner;

public class Practice3_If {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
    int number = sc.nextInt();
        if(number>0||number==0){
            System.out.println("Number are Positive or negative");

        }else {
            System.out.println("Number is zero");
        }
    }
}

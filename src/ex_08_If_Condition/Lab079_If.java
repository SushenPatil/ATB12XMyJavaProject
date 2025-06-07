package ex_08_If_Condition;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab079_If {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//System.out.println(" Enter the Age ");
//int age = sc.nextInt();
//if(age<18)
//        {
//            System.out.println("You can vote!");
//        }
//else {
//    System.out.println("You can't vote!");
//}
//
//
//}
//}
//
//
//
//}
//}

    public static void main(String[] args) {
        System.out.println(" Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        if (number % 2 == 0) {
            System.out.println(" Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}

package ex_08_If_Condition;

import java.util.Scanner;

public class Practice2_Ifelseif {
    public static void main(String[] args){
        System.out.println("Ente the number");
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        if(number>0){
            System.out.println("Number is positive");
        } else if (number==0) {
            System.out.println("Number is zero");
        }else
            System.out.println("Number is negative");

        }

    }

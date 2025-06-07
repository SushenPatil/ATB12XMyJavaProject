package ex_08_If_Condition;

import java.util.Scanner;

public class Practice4_If {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if (a > 0) {
            if (a < 100) {
                System.out.println("Number is between 1 and 99");
            }
        }

    }
}

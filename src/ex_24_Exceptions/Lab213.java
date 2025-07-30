package ex_24_Exceptions;

import java.util.Scanner;

public class Lab213 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            int v =sc.nextInt();
            int a = 10/v;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
            System.out.println("close scanner");
        }

    }
}

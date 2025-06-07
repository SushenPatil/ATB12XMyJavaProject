package ex_08_If_Condition;

import java.util.Scanner;

public class Practice_If_Else_If_Scanner {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(" Greater number a is->" + a);
        } else if (b > c && b > a) {
            System.out.println(" Greater number b is->" + b);
        }
            else{
                System.out.println(" Greater number c is->" + c);
            }

        }
    }


package ex_09_Switch;

import java.util.Scanner;
// You need to take a user input and ask for the integer from 1 to 7.
public class Lab084_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");
int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Thu");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Enter the day from 1 to 7 only, you pool !");

        }

    }
}

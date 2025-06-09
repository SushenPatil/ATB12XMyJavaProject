package ex_09_Switch;

import java.util.Scanner;

public class Practice1_Switch_Years {
    public static void main(String[] args) {
        System.out.println("Enter the Year from 1 t0 12");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
        int year = sc.nextInt();
        switch(year){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Enter the year from 1 to 12 only, you pool");

        }
    } else {
            System.out.println("You are mad, Why you are entering non int values");
        }
    }
}

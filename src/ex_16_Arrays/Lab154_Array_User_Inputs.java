package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the element ");
        int size = sc.nextInt();
        String[] number_Marks = new String[size];
       for(int i=0; i<number_Marks.length; i++){
            System.out.println("Enter the element");
           number_Marks[i] = sc.next();
        }
       System.out.println(" --- Print the values");

        for(String marks : number_Marks){
            System.out.println(marks);
       }

        sc.close();




    }
}

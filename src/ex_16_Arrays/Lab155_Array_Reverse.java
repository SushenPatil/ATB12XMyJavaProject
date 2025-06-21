package ex_16_Arrays;

import java.util.Scanner;

public class Lab155_Array_Reverse {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int size = sc.nextInt();
//         int[] reverse = new int[size];
//
//         for(int i=0;i<size;i++);
//        System.out.println("Enterthe number");
//        reverse[i]=sc.nextInt();
//        System.out.println("Get the reverse number");
//        for (int i=reverse.length;i>=0;i++){
//            System.out.println("Number i"+"" );
//        }
//sc.close();
//
//    }
        int[] numbers = {1, 2, 3, 4, 5};
        // int[] numbers = {1, 2, 3, 4, 5};

        // 5,4,3,2,1
        for(int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]);
        }


    }
}

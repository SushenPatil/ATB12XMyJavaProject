package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
//        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
//        Arrays.sort(numbers);
//        System.out.println(numbers[numbers.length - 2]);
//        System.out.println(numbers[numbers.length - 3]);
//        System.out.println(numbers[numbers.length - 4]);
//        System.out.println(numbers[numbers.length - 5]);


            int[] numbers = {12, 45, 67, 23, 89, 45, 89};

            int highest = 0;
            int secondHighest = 0;

            for (int num : numbers) {
                if (num > highest) {
                    secondHighest = highest;
                    highest = num;
                } else if (num > secondHighest && num != highest) {
                    secondHighest = num;
                }
            }

            System.out.println("Highest number: " + highest);
            System.out.println("Second highest number: " + secondHighest);
        }



    }



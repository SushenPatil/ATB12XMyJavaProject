package ex_10_For_Loop;

public class Lab104_For_IQ_P1 {
    public static void main(String[] args) {
        for(int i=0;i<10;){
            System.out.println(i);
        }
    }
}

//This Java code has a bug that will create an infinite loop. Here's the issue:
//The for loop is missing the increment statement:
//
//int i=0 - initializes i to 0
//i<10 - condition to continue while i is less than 10
//The third part (increment) is empty
//
//Since i never gets incremented, it remains 0 throughout the loop.
//The condition i<10 is always true (0 < 10), so the loop runs forever, continuously printing 0.
package ex_10_For_Loop;

public class Lab101_For_Loop_IQ {
    public static void main(String[] args) {

        for(int i=1;i>10;i++){
            System.out.println(i);
        }
    }
}
//⚠️ Important Problem
//This code has a logical error! The loop condition i>10 means "continue while i is greater than 10."
//Since i starts at 1, and 1 is NOT greater than 10, the loop will never run.

//Line 1: public static void main(String[] args)
//
//This is the main method - the starting point of every Java program
//public means it can be accessed from anywhere
//static means you don't need to create an object to run it
//void means it doesn't return any value
//String[] args allows the program to receive input from the command line
//
//Line 2: for(int i=1; i>10; i++)
//This is a for loop with three parts:
//
//int i=1 - Creates a variable i and sets it to 1
//i>10 - The condition to check before each loop iteration
//i++ - Increases i by 1 after each loop
//
//Line 3: System.out.println(i);
//
//Prints the value of i to the console
//println adds a new line after printing


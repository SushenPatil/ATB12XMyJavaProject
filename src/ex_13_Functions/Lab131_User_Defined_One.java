package ex_13_Functions;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {
        // Call the function
int sum = sum_of_two_number(4,5);
int sum1 =sum_of_two_number(10,20);
        System.out.println(sum);
    }

    // Create a function

    static int sum_of_two_number(int a,int b){
        return a+b;
    }
}

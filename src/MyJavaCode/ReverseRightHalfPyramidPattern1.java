package MyJavaCode;

import java.util.Scanner;

public class ReverseRightHalfPyramidPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=4; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

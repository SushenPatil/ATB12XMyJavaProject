package MyJavaCode;

import java.util.Scanner;

public class RightHalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the n value");
        int n = sc.nextInt();

        for (int i =1; i<=n; i++) {
                for (int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

                }

            }
/* How above pattern logic works
i > 1     2       3         4
j > 1,2   1,2,3   1,2,3,4   1,2,3,4

i j
1 1
2 2
3 3
4 4
 */




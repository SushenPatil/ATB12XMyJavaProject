package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the num1");
//        if (scanner.hasNextInt()) {
//       int a= scanner.nextInt();
//        } else {
//            System.out.println("Enter the int only, ");
//            System.exit(0);
//        }
//        System.out.println("Enter the num2");
//        if (scanner.hasNextInt()) {
//            int b = scanner.nextInt();
//        } else {
//            System.out.println("Enter the int only, ");
//            System.exit(0);
//        }
//    }
//}
Scanner sc = new Scanner(System.in);
int a = readint(sc, "Enter the num 1");
int b = readint(sc, "Enter the num 2");
}

static int readint(Scanner sc, String print){
   // System.out.println(print);
        if(sc.hasNextInt()) {
            return sc.nextInt();
        }else{
                System.out.println(" Enter the integer only!");
                System.exit(0);
                return 0;
            }
        }
    }

package ex_24_Exceptions;

public class Lab208 {
    public static void main(String[] args){
        int b=0;
        int c =0;
        try {
            try {
                b=10/c;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}

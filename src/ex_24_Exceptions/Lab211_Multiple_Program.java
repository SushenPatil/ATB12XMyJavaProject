package ex_24_Exceptions;

public class Lab211_Multiple_Program {
    public static void main(String[] args){
        int a=0;
        int b=0;
        try {
            int c  =10/a;
            String s1 = null;
            s1.trim();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println();
        }
        catch (Exception e) {
            System.out.println();
        }

    }
}

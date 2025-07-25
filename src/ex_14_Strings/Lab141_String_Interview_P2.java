package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP (s1)
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello"); // OA (s2,s3,s5)
        String s5 = new String("hello");


        // == -> Comparison -> String => this check the ref location
        System.out.println(s1 == s3); // false
        System.out.println(s1 == s2); //false
        System.out.println(s2 == s3);// false

        System.out.println(s1 == s4);// true
        System.out.println(s3 == s5);//false


        // equals ( content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value
    }
}

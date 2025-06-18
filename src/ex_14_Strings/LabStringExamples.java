package ex_14_Strings;

public class LabStringExamples {
    public static void main(String[] args) {
        String s ="Sushen";
        char c=s.charAt(0);// it will take index of
        System.out.println(c);
        System.out.println(s.codePointAt(0)); // it will take unicode
        String s1= "Sushen";
        int a = s1.indexOf("S");
        System.out.println(a);

        int idx2 = "Sushen".lastIndexOf("n"); // 3
        System.out.println(idx2);


        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("-", "Sushen", "Patil");
        System.out.println(s11);

        String s12 = "Sushen".replace('s', 'e'); // "Jovo"
        System.out.println(s12);

        boolean b1 = "Sushen".startsWith("Su"); // true
        System.out.println(b1);
    }
}

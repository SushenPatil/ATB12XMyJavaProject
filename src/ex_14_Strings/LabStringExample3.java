package ex_14_Strings;

public class LabStringExample3 {
    public static void main(String[] args) {
        String s ="Sushen";
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));
        System.out.println(s.subSequence(1,4));
        System.out.println(s.trim());
        System.out.println(s.repeat(3));
        System.out.println(s.equalsIgnoreCase("sushen"));
        System.out.println(String.format("%s=%d","age",25 ));

        char[] arr = "Sushen".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']

        boolean s1="  ".isBlank();
        System.out.println(s1);
        boolean s2 ="  ".isEmpty();
        System.out.println(s2);
    }
}

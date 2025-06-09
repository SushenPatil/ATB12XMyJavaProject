package ex_09_Switch;

public class Practice5_Pattern_to_Switch {
    public static void main(String[] args) {
        // JDK 17+
       Object obj = "Hello";
//        if (obj instanceof String s) {
//            System.out.println(s.length());
//        } else if (obj instanceof Integer i) {
//            System.out.println(i * 2);
//        }
        switch (obj) {
            case String s -> System.out.println(s.length());
            case Integer i -> System.out.println(i * 2);
            default -> {}
        }
    }
}

package ex_09_Switch;

public class Practice4_Null_Handeling {
    public static void main(String[] args) {
        String input = null;
        switch (input) {
            case "A": System.out.println("A"); break;
            default: System.out.println("Default");
        }
    }
}

package ex_09_Switch;

public class Practice2_Case_Sensitive {
    public static void main(String[] args) {
        String fruit = "Apple";
        switch (fruit.toLowerCase()) {
            case "apple": System.out.println("Sweet");

            case "banana": System.out.println("Yellow");

            default: System.out.println("Unknown fruit");
        }
        }
    }


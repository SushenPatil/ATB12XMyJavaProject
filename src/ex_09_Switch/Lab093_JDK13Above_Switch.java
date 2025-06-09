package ex_09_Switch;

public class Lab093_JDK13Above_Switch {
    public static void main(String[] args) {
        int itemcode = 001;
        switch(itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("No item code");
        }
    }
}
//Key Features:
//Arrow Syntax (->)
//
//Introduced in Java 14 as a standard feature (previewed in 12 and 13).
//
//Replaces the colon (:) and eliminates the need for break (no fall-through).
//
//No break Needed
//
//Unlike traditional switch, the arrow syntax automatically breaks after each case.
//
//default Case
//
//Runs if itemCode doesn’t match any case.
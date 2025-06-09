package ex_09_Switch;

import java.util.Scanner;

public class Practice3_Switch_to_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            default -> "Unknown";

        };

    }
}
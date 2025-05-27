package Task;
/*Again, use the nested ternary. You have to figure it out if I am an adult, minor, or senior.
What is the condition? The condition is very simple. If my age is greater than 18,
then I can be minor or adult or senior. But if my age is greater than 65, then I am a senior.
If I am between 18 to 65, then I am an adult.*/

public class Lab04_Task_17th_week {
    public static void main(String[] args) {
        int age = 70; // You can change the age to test

        String category = (age <= 18) ? "Minor" : ((age > 65) ?"Adult" : "Senior"  );

        System.out.println("You are an " + category + ".");
    }
}

/* public class AgeCategory {
    public static void main(String[] args) {
        int age = 45; // You can change the age to test

        String category;

        if (age <= 18) {
            category = "Minor";
        } else if (age > 65) {
            category = "Senior";
        } else {
            category = "Adult";
        } */
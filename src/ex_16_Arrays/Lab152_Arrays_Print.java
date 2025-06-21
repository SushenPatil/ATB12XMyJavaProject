package ex_16_Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {

        int marks[] = {70,80,90,100};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        // Using for loop  print the output
        for (int i=0; i < marks.length;i++) {
            System.out.println(marks[i]);
        }
            // Using enhanced for loop print the output
            for(int mark : marks){
                System.out.println(mark);
        }
    }
}

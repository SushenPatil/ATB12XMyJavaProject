package ex_16_Arrays;

public class Lab151_Arrays_Part2 {
    public static void main(String[] args) {
        String name[] = {"Sushen","Suman","Patil"};
        System.out.println(name.length);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        String name1[] = new String[3];
        name1[0] ="Sushen";
        name1[1] = "Suman";
        name1[2] = "Patil";
        System.out.println(name1[0]);
        System.out.println(name1[1]);
        System.out.println(name1[2]);

        boolean is_male_data[] = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;
        System.out.println(is_male_data[0]);
        System.out.println(is_male_data[1]);
    }
}

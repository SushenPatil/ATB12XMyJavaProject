package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        non_retun_fun();

        String a = return_fun();
        System.out.println(a);

    }
    // Non return type function
    static void non_retun_fun() {
        System.out.println("non retun fun");
    }
// Return type of function
static String return_fun() {
    System.out.println("return_fun");
    return "sushen";
}

    static boolean return_boolean(){
        return true;
    }

    static float return_float_pi_value(){
        return 3.14f;
    }

    static byte return_byte(){
        return 100;
    }

    static long return_long(){
        return 10l;
    }



}

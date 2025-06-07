package ex_06_Ternary_Operator;

public class Lab065_TO_INTERVIEW_Max_Two_TO {
    public static void main(String[] args) {
        int x = -5;
        int y = -10; // 5 4 3 2 1 0 -1 -2 -3 -4 -5
     //   System.out.println(Math.max(x,y));

        int max = x > y ? x :y;
        System.out.println(max);
    }
}
/* | **Test Case**              | **Input (x, y)**                       | **Expected Output** | **Reason**                                          |
| -------------------------- | -------------------------------------- | ------------------- | --------------------------------------------------- |
| Equal values               | `10, 10`                               | `10`                | Ensures max is correct when both numbers are equal. |
| Negative numbers           | `-5, -10`                              | `-5`                | Checks behavior with negative integers.             |
| One zero                   | `0, 100`                               | `100`               | Validates if zero is handled properly.              |
| Both zero                  | `0, 0`                                 | `0`                 | Ensures correctness when both are neutral values.   |
| Large integers             | `Integer.MAX_VALUE, Integer.MIN_VALUE` | `Integer.MAX_VALUE` | Tests upper and lower bounds of int type.           |
| Very close values          | `999999, 1000000`                      | `1000000`           | Confirms correctness on close comparisons.          |
| Swapped logic              | `x = 20, y = 10`                       | `20`                | Makes sure logic still works when `x > y`.          |
| One positive, one negative | `x = 10, y = -10`                      | `10`                | Ensures correct behavior with mixed signs.          |
 */

/*Recursive Method for Calculating Factorial
Function Description
Complete the factorial function in the editor below. Be sure to use recursion.

factorial has the following paramter:

int n: an integer
Returns

int: the factorial of 
Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of .

Input Format

A single integer,  (the argument to pass to factorial).

Constraints

Your submission must contain a recursive function named factorial.
Sample Input

3
Sample Output

6
 */
import java.util.Scanner;

public class Day_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Day_9 ob = new Day_9();
        int fact = ob.fact(n);
        System.out.println(fact);
        sc.close();
    }

    int fact(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);

    }
}


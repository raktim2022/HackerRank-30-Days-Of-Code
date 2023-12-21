
/*Task
Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.

Example

Print 4 3 2 1. Each integer is separated by one space.

Input Format

The first line contains an integer,  (the size of our array).
The second line contains  space-separated integers that describe array 's elements.

Output Format

Print the elements of array  in reverse order as a single line of space-separated numbers.

Sample Input

4
1 4 3 2
Sample Output

2 3 4 1

*/
import java.util.*;

public class Day_7 {
    public static void main(String[] args)
    {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
    {
        arr[i] = sc.nextInt();
    }
    for(int j = n-1;j>=0;j--)
    {
        System.out.print(arr[j] + " ");
    }
    sc.close();
    }
    
}

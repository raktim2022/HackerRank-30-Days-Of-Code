
/*Task
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.

Example


Print abc def

Input Format

The first line contains an integer,  (the number of test cases).
Each line  of the  subsequent lines contain a string, .

Constraints

Output Format

For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak 

*/
import java.util.*;
public class Day_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<=t;i++)
        {
            String s1 = "", s2 = "";
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 != 0)
                    s2 = s2 + s.charAt(j);
                else
                    s1 = s1 + s.charAt(j);
            }
            System.out.print(s1 + " " + s2 + "\n");
        }
        sc.close();
    }
}
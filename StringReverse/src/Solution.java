import java.io.*;
import java.util.*;

/*
Sample Input
madam

Sample Output
Yes
*/

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

       /* First Way
       char a[] = A.toCharArray();
        char b[] = a;
        for (int i = a.length-1; i >= 0  ; i--) {
            b[i] = a[a.length-i-1];
        }
        String B = new String(b);
        if(B.equals(A)){
            System.out.println("Yes");
        }else System.out.println("No");
        */

        /* Second Way
        int count = 0;
        for(int i=0; i<A.length()/2;i++)
            if( A.charAt(i) == A.charAt(A.length()-i-1)) count++;
        System.out.println( (count == A.length()/2) ? "Yes" : "No") ;
        */

        //Third Way
        String result = "Yes";
        for (int i = 0; i < A.length()/2 ; i++) {
            if(A.charAt(i)!=A.charAt(A.length()-i-1)){
                result = "No";
            }
        }
        System.out.println(result);

    }
}




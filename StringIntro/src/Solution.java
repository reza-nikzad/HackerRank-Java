import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
/*
 Sample Input 0
hello
java

 Sample Output 0
9
No
Hello Java
*
*
* */
public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        String answer;
        answer = (A.compareTo(B)>0) ? "Yes":"No";

        System.out.println(A.length()+B.length());
        System.out.println(answer);
        System.out.println(capitalize(A)+" "+capitalize(B));
    }

    private static String capitalize(String a) {
        char[] b = a.toCharArray();
        b[0] = Character.toUpperCase(b[0]);// toUpperCase for char
        return new String(b) ;// or : String.valueOf(b);
    }
}




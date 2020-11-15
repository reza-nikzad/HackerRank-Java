import java.io.*;
import java.math.BigInteger;
import java.util.*;
/*
Sample Input

        1234
        20
Sample Output

        1254
        24680
*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String no1 = scanner.nextLine();
        String no2 = scanner.nextLine();
        BigInteger bigInteger1 = new BigInteger(no1);
        BigInteger bigInteger2 = new BigInteger(no2);
        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
    }
}
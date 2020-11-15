import java.io.*;
import java.util.*;
/*
Sample Input
        5
        1 -2 4 -5 1
Sample Output
        9
 */
public class Solution {

    public static void main(String[] args) {
        /*
        Enter your code here.
        Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution.
        */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[size];
        for (int i = 0; i < size ; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int itter = 0;
        for (int i = 0; i < size ; i++) {
            for (int j = i; j < size; j++) {
                for (int k =i; k<=j ; k++) {
                    sum += arr[k];
                }
                if(sum <0){
                    itter++;
                }
                sum = 0;
            }
        }
        System.out.println(itter);
        scanner.close();
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Sample Input

5 // number of array list
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5 //number of queries: Check whether they are exist or not
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
*/
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeA = Integer.parseInt(scanner.nextLine());//number of Arraylists
        int[][] line = new int[sizeA][];
        for (int i = 0; i < sizeA; i++) {
            int sizeB = scanner.nextInt();
            line[i] = new int[sizeB];
            for (int j = 0; j < sizeB ; j++) {
                line[i][j]= scanner.nextInt();
            }
        }

        scanner.nextLine();
        int rev = scanner.nextInt();
        for (int i = 0; i < rev ; i++) {
            scanner.nextLine();
            int a = scanner.nextInt()-1;
            int b = scanner.nextInt()-1;
            try {
                System.out.println(line[a][b]);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }


    }
}

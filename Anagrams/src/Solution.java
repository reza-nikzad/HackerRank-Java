import java.util.Scanner;

/*
* Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
*
* */

public class Solution {

    public static long countOccurences(String s, char c){
        return s.chars().filter(ch -> ch == c).count();
    }
    static boolean isAnagram(String a, String b) {
        for (int c =97; c<=122; c++ ){
            if (countOccurences(a.toLowerCase(),(char) c) != countOccurences(b.toLowerCase(),(char) c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

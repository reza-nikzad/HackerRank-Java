
import java.util.Scanner;
/*
Sample Input 0

welcometojava
3
Sample Output 0
ava
wel
*/

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        //FIRST WAY
        String[] temp = new String[s.length()-k+1];
        for (int i = 0; i < temp.length ; i++) {
            temp[i] =s.substring(i,i+k);
        }
        smallest = temp[0];
        largest = temp[temp.length-1];
        for (int j = 0; j < temp.length ; j++) {
            if(smallest.compareTo(temp[j])>0){
                smallest=temp[j];
            }
            if(largest.compareTo(temp[j])<0){
                largest=temp[j];
            }
        }
        /*SECOND WAY
        List<String> temp = new ArrayList<>();

        for (int i = 0; i < s.length()-k+1 ; i++) {
            temp.add(s.substring(i,i+k));
        }
        temp.sort(String::compareTo);
        smallest = temp.get(0);
        largest = temp.get(temp.size()-1);*/
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
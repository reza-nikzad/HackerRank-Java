import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Sample Input:
He is a very very good boy, isn't he?

Sample Output:
10
He
is
a
very
very
good
boy
isn
t
he
 is composed of any of the following: English alphabetic letters,
  blank spaces,
   exclamation points (!),
    commas (,),
  question marks (?),
   periods (.),
    underscores (_),
     apostrophes ('),
      and at symbols (@).
*/
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.isEmpty()) s=",";
        String[] result= s.split("([^A-Za-z]+)");
        System.out.println(result.length);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        //using pattern matcher
        /*String pt = "(\\w+)";
        Pattern pattern = Pattern.compile(pt);
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.groupCount());
        while(matcher.find()){
            System.out.println(matcher.group());
        }*/

        /*
        StringTokenizer tokenizer = new StringTokenizer(s);
        System.out.println(tokenizer.countTokens(""));
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }*/

        scan.close();
    }
}
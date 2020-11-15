import java.math.BigDecimal;
import java.util.*;
/*
Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
Sample Output

90
56.6
50
02.34
0.12
.12
0
000.000
-100
 */
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        s[n] = "Nope";
        s[n+1] = "Nope";
        Arrays.sort(s,((String n1,String n2) ->  {
            if (!(n1.equals("Nope")) && !(n2.equals("Nope"))){
                BigDecimal bd1 = new BigDecimal(n1);
                BigDecimal bd2 = new BigDecimal(n2);
                return bd2.compareTo(bd1);}
            return 0;})
        );
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
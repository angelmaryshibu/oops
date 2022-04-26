import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i,n;
        System.out.println("enter the size of string:");
        n=s.nextInt();
        System.out.println("enter the string");
        String t[]=new String[n];
        for(i=0;i<n;i++)
        {
            t[i]=s.nextLine();
        }
        System.out.println("the sorted string is:");
        Arrays.sort(t);
        for(String x:t)
        System.out.println(x);
    }
}

import java.lang.*;
import java.util.Scanner;
class pallindrome
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a string");
        String str=s.nextLine();
        int len=str.length();
        int flag=0;
        for(int i=0;i<=(len/2);i++)
        {
            if(str.charAt(i)!=str.charAt(len-i-1))
              { flag=1;}
        }
        if(flag==0)
         System.out.println("string is pallindrome");
        else
          System.out.println("string not a pallindrome");
    }
}

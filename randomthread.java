import java.util.Random;
import java.lang.*;
class randomthread extends Thread{
    public void run()
    {   Random r=new Random();
        for(int i=0;i<=10;i++)
        {
            int n=r.nextInt(100);
            if(n%2==0)
            {
                new even(n).start();
            }
            else
               new odd(n).start();
            
        }
    }
}
class even extends Thread{
    int num;
    public even(int num)
    {
        this.num=num;
    }
    public void run()
    {
        System.out.println("square of:"+num+"="+num*num);
    }
}
class odd extends Thread{
    int num;
    public odd(int num)
    {
        this.num=num;
    }
    public void run()
    {
      System.out.println("cube of:"+num+"="+num*num*num);
    }
}
class Main 
{
    public static void main(String args[])
    {
        randomthread s=new randomthread();
        s.start();
    }
}

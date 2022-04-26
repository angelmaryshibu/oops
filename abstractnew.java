import java.lang.*;
import java.util.*;
abstract class shape
{abstract void noofsides();}
class Rectangle extends shape
{
    void noofsides()
    {System.out.println("Rectangle has 4 sides");}
    
}
class Triangle extends shape
{
    void noofsides()
    {System.out.println("Triangle angle has 3 sides");}
    
}
class Hexagon extends shape
{
    void noofsides()
    {System.out.println("hexagon angle has 6 sides");}
    
}
class Main 
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        r.noofsides();
        t.noofsides();
        h.noofsides();
    }
}

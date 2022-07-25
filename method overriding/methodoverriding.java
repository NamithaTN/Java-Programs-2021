import java.lang.*;
import java.util.*;

class A
{
   void print()
{
 System.out.println("Hello");
}

}

class B extends A
{
   void print()
{
 System.out.println("Hai");
}

}


class methodoverriding
{
    public static void main(String args[])
    {
       B b= new B();
 	b.print();
    }
}
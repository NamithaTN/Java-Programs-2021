import java.lang.*;
import java.util.*;

class Vehicle
{
   void run()
{
 System.out.println("Vehicle running");
}

}

class Bike extends Vehicle
{
   void run()
{
 System.out.println("Bike running ");
}

}


class methodoverriding2
{
    public static void main(String args[])
    {
       Bike b= new Bike();
 	b.run();
    }
}
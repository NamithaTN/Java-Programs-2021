interface Animal
{
public void sound();
public void sleep();
}

class pig implements Animal
{

public void sound()
{
System.out.println("wee wee");
}
public void sleep()
{
System.out.println("zzz");
}
}


class Test
{
public static void main(String args[])
{
pig obj=new pig();
obj.sound();
obj.sleep();
}
}
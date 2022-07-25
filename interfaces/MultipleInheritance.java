interface First
{
public void method1();
}

interface Second
{
public void method2();
}

class A implements First,Second
{

public void method1()
{
System.out.println("Hai");
}
public void method2()
{
System.out.println("Hello");
}
}


class MultipleInheritance
{
public static void main(String args[])
{
A obj=new A();
obj.method1();
obj.method2();
}
}
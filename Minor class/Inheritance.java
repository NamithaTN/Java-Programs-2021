 class Box
{
int l;
int b;
int h;

Box()
{
l=1;
b=2;
h=3;
}
void volume()
{
System.out.println(l*b*h);
}
}


class A extends Box
{

}




class Inheritance
{
public static void main(String args[])
{
A subobj = new A();

subobj.volume();

}
}
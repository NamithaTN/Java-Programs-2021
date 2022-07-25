class Box
{
int l;
int b;
int h;

Box()
{
l=10;
b=20;
h=30;
}


void volume()
{
System.out.println(l*b*h);
}
}



class constructor
{
public static void main(String args[])
{

Box b = new Box();

b.volume();

}
}
class Box
{
int l;
int b;
int h;
Box(int a,int x,int c)
{
l=a;
b=x;
h=c;
}

void volume()
{
System.out.println(l*b*h);
}
}




class parameterisedconstructor
{
public static void main(String args[])
{
Box b = new Box(5,10,7);
b.volume();

}
}
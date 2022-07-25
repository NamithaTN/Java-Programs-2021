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




class multiple_objects
{
public static void main(String args[])
{
Box b1 = new Box(1,2,3);
Box b2 = new Box(3,4,2);
Box b3 = new Box(10,20,30);
Box b4=new Box(7,9,2);
b1.volume();
b2.volume();
b3.volume();
b4.volume();

}
}
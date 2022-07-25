class Box
{
int l;
int b;
int h;
Box(int l,int b,int h)
{
l=l;
b=b;
h=h;
}

void volume()
{
System.out.println(l*b*h);
}
}




class without_this
{
public static void main(String args[])
{
Box b1 = new Box(1,2,3);
Box b2 = new Box(3,4,2);
Box b3 = new Box(10,20,30);
b1.volume();
b2.volume();
b3.volume();

}
}
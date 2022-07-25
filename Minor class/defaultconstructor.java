class Box
{
int l;
int b;
int h;

void volume()
{
System.out.println(l*b*h);
}

}

class defaultconstructor
{
public static void main(String args[])
{
Box b= new Box();

b.volume();

}
}
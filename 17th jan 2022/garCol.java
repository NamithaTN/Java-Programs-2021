class garCol{
public void finalize(){
System.out.println("Object Memory is released");
}
public static void main(String args[]) throws InterruptedException
{
garCol g = new garCol();
g = null;
System.gc();
}
}
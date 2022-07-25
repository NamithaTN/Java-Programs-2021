public class gac
{
public static void main(String[] args) throws InterruptedException
{
gac t1 = new gac();


t1 = null;

System.gc();

// requesting JVM for running Garbage Collector
Runtime.getRuntime().gc();
}
@Override
// finalize method is called on object once
// before garbage collecting it
protected void finalize() throws Throwable
{
System.out.println("Garbage collector called");
System.out.println("Object garbage collected : " + this);
}
}
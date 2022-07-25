import java.util.Scanner;


class Employee
{
private String name;
private int age;
private double salary;
public void setName(String name)
{
this.name = name;
}

public void setAge(int age){
this.age=age;
}
public void setSalary(double salary){
this.salary = salary;
}
public double printSalary(){
return salary;
}
public String getName(){
return name;
}
public int getAge(){
return age;
}
}


class Officer extends Employee
{
private String specialization;
private String department;


public void setSpecialization(String specialization){
this.specialization = specialization;
}
public void setDepartment(String department){
this.department = department;
}
public String getDepartment(){
return department;
}
public String getSpecialization(){
return specialization;
}

}


class Manager extends Employee
{
private String specialization;
private String department;
public void setSpecialization(String specialization){
this.specialization = specialization;
}
public void setDepartment(String department){
this.department = department;
}
public String getDepartment(){
return department;
}
public String getSpecialization(){
return specialization;
}
}


class inh
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

Officer o = new Officer();

System.out.println("Enter the officer's Detail");
System.out.print("Name:");
o.setName(sc.nextLine());

System.out.print("Specialization:");
o.setSpecialization(sc.nextLine());
System.out.print("Department:");
o.setDepartment(sc.nextLine());
System.out.print("Age:");
o.setAge(sc.nextInt());

System.out.print("Salary:");
o.setSalary(sc.nextDouble());

sc.nextLine(); // to skip new Line

System.out.println("The officer Detail");

System.out.println("Name:"+o.getName());
System.out.println("Age:"+o.getAge());
System.out.println("Salary:"+o.printSalary());
System.out.println("Specialization:"+o.getSpecialization());
System.out.println("Department:"+o.getDepartment());

Manager m = new Manager();

System.out.println("Enter the manager's Detail");

System.out.print("Name:");
m.setName(sc.nextLine());

System.out.print("Specialization:");
m.setSpecialization(sc.nextLine());
System.out.print("Department:");
m.setDepartment(sc.nextLine());
System.out.print("Age:");
m.setAge(sc.nextInt());

System.out.print("Salary:");
m.setSalary(sc.nextDouble());

sc.nextLine(); // to skip new Line

System.out.println("The manager's Detail");
System.out.println("Name:"+m.getName());
System.out.println("Age:"+m.getAge());
System.out.println("Salary:"+m.printSalary());
System.out.println("Specialization:"+m.getSpecialization());
System.out.println("Department:"+m.getDepartment());
}
}
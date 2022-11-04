import java.util.*;
class Employee{
public String name="Jyothish", address="Kalady";
int age=20, phone=1234567890, salary=10000;
void printsalary(){
System.out.println(salary);
}
}
class Officer extends Employee{
String specialization;
} 
class Manager extends Employee{
String department;
}
public class Inheritance{
public static void main(String[] args){
Officer officer = new Officer();
Manager manager = new Manager();
System.out.println("Employee details\nName: "+officer.name+"\nAddress: "+officer.address+"\nAge: "+officer.age);
System.out.println("Salary: " + officer.salary+"\nPhone number: "+officer.phone);
officer.specialization = "Hacker";
manager.department = "HR";
System.out.println("Officer details\nName: "+officer.name+"\nAddress: "+officer.address+"\nAge: "+officer.age);
System.out.println("Salary: " + officer.salary+"\nPhone number: "+officer.phone+"\nSpecialisation: "+officer.specialization);
System.out.println("Manager details\nName: "+manager.name+"\nAddress: "+manager.address+"\nAge: "+manager.age);
System.out.println("Salary: " + manager.salary +"\nPhone number: "+officer.phone+ "\nDepartment: "+manager.department);
}
}

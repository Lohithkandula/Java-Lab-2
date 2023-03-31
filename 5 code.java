import persondatabase.Person;
import persondatabase.Employee;
import persondatabase.Student;
import persondatabase.Faculty;
import persondatabase.Staff;
import java.util.*;
public class Q5 {
public static void main(String[] args){
String name,rollNo,branch,ecNo,doj,designation;
int age;
Scanner sc = new Scanner(System.in);
System.out.println("\n");
System.out.print("ENTER PERSON'S NAME : ");
name = sc.next();
System.out.print("ENTER PERSON'S AGE : ");
age = sc.nextInt();
Person ob1 = new Person(name, age);
System.out.println("\n");
System.out.print("ENTER STUDENT'S NAME : ");
name = sc.next();
System.out.print("ENTER STUDENT'S AGE : ");
age = sc.nextInt();
System.out.print("ENTER STUDENT'S ROLLNO : ");
rollNo = sc.next();
System.out.print("ENTER STUDENT'S BRANCH : ");
branch = sc.next();
Student ob2 = new Student(name, age, rollNo, branch);
System.out.println("\n");
System.out.print("ENTER EMPLOYEE'S NAME : ");
name = sc.next();
System.out.print("ENTER EMPLOYEE'S AGE : ");
age = sc.nextInt();
System.out.print("ENTER EMPOLYEE'S EcNo : ");
ecNo = sc.next();
System.out.print("ENTER EMPLOYEE'S DATE OF JOINING : ");
doj = sc.next();
Employee ob3 = new Employee(name, age, ecNo, doj);
System.out.println("\n");
System.out.print("ENTER FACULTY'S NAME : ");
name = sc.next();
System.out.print("ENTER FACULTY'S AGE : ");
age = sc.nextInt();
System.out.print("ENTER FACULTY'S EcNo : ");
ecNo = sc.next();
System.out.print("ENTER FACULTY'S DATE OF JOINING : ");
doj = sc.next();
System.out.print("ENTER FACULTY'S DESIGNATION : ");
designation = sc.next();
Faculty ob4 = new Faculty(name, age, ecNo, doj, designation);
System.out.println("\n");
System.out.print("ENTER STAFF'S NAME : ");
name = sc.next();
System.out.print("ENTER STAFF'S AGE : ");
age = sc.nextInt();
System.out.print("ENTER STAFF'S EcNo : ");
ecNo = sc.next();
System.out.print("ENTER STAFF'S DATE OF JOINING : ");
doj = sc.next();
System.out.print("ENTER STAFF'S DESIGNATION : ");
designation = sc.next();
Staff ob5 = new Staff(name, age, ecNo, doj, designation);
System.out.println("\n\n-------PERSON'S DATA----------");
ob1.display();
System.out.println("\n---------STUDENT'S DATA---------");
ob2.display();
System.out.println("\n-------EMPLOYEE'S DATA----------");
ob3.display();
System.out.println("\n-------FACULTY'S DATA----------");
ob4.display();
System.out.println("\n------STAFF'S DATA--------------");
ob5.display();
}
}
// class Employee
package persondatabase;
public class Employee extends Person {
String ecNo;
String doj;
public Employee(String n,int a,String e,String d){
super(n, a);
ecNo = e;
doj = d;
}
public void display(){
super.display();
System.out.println("EcNo : "+ecNo);
System.out.println("DOJ : "+doj);
}
}
package persondatabase;
public class Faculty extends Employee {
String designation;
public Faculty(String n,int a,String e,String d,String dsg){
super(n, a, e, d);
designation = dsg;
}
public void display(){
super.display();
System.out.println("DESIGNATION : "+designation);
}
}
package persondatabase;
public class Person {
String name;
int age;
public Person(String n,int a){
name = n;
age = a;
}
public void display(){
System.out.println("Name : "+name);
System.out.println("AGE : "+age);
}
}
package persondatabase;
public class Staff extends Employee {
String designation;
public Staff(String n,int a,String e,String d,String dsg){
super(n, a, e, d);
designation = dsg;
}
public void display(){
super.display();
System.out.println("DESIGNATION : "+designation);
}
}
package persondatabase;
public class Student extends Person{
String rollNo;
String branch;
public Student(String n,int a,String r,String b){
super(n, a);
rollNo = r;
branch = b;
}
public void display(){
super.display();
System.out.println("RollNo : "+rollNo);
System.out.println("BRANCH : "+branch);
}

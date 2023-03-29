import java.util.*;
interface A{
void m1();
void m2();
}
class MyClass implements A{
public void m1(){
System.out.println("Hello");
}
public void m2(){
System.out.println("World");
}
}
public class hello
{
public static void main(String[] args)
{
MyClass ob = new MyClass();
ob.m1();
ob.m2();
}
}

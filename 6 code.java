package myInterface;
interface GeoAnalyzer
{
final static float pi=3.142F;
float area();
float perimeter();
}
class Circle implements GeoAnalyzer
{
float a,b,r=4;
public float area()
{
a=pi*r*r;
return a;
}
public float perimeter()
{
r=9;
b=2*pi*r;
return b;
}
void display()
{
System.out.println("Circle Area ="+a);
System.out.println("\nPerimeter ="+b);
}
}
class Ellipse implements GeoAnalyzer
{
float c,d,i=5,j=2;
public float area()
{
c=pi*i*j;
return c;
}
public float perimeter()
{
d=2*pi*(((i*i+j*j)/2)*1/2);
return d;
}
void display()
{
System.out.println("Ellipse Area ="+c);
System.out.println("\nPerimeter="+d);
}
}
class Rectangle implements GeoAnalyzer
{
float e,f,l=4,b=2;
public float area()
{
e=l*b;
return e;
}
public float perimeter()
{
f=2*(l+b);
return f;
}
void display()
{
System.out.println("Rectangle Area ="+e);
System.out.println("Perimeter ="+f);
}
}
class Main
{
public static void main (String[] args) {
Circle c=new Circle();
Ellipse e=new Ellipse();
Rectangle r=new Rectangle();
c.area();
c.perimeter();
c.display();
e.area();
e.perimeter();
e.display();
r.area();
r.perimeter();
r.display();
}
}

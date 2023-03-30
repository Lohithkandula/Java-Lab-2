package gradepack;
public class Operations
{
public double average(int[] arr)
{
int n=arr.length;
int sum=0;
for(int i=0;i<n;i++)
{
sum=sum+arr[i];
}
double avg=(double)sum/n;
return avg;
}
public int minimum(int[] arr)
{
int n=arr.length;
int mini=arr[0];
for(int i=0;i<n;i++)
{
if(arr[i]<mini)
mini=arr[i];
}
return mini;
}
public int maximum(int[] arr)
{
int n=arr.length;
int maxi=arr[0];
for(int i=0;i<n;i++)
{
if(arr[i]>maxi)
maxi=arr[i];
}
return maxi;
}
public double median(int[] arr)
{
int n=arr.length;
double m;
int mid;
if(n%2==0)
{
mid=n/2;
m=(double)arr[mid];
}
else
{
mid=(n+1)/2;
m=(double)arr[mid];
}
return m;
}
public double standardDeviation(int[] arr)
{
int n=arr.length;
int sum=0;
double std=0.0;
for(int i=0;i<n;i++)
sum=sum+arr[i];
double mean=sum/n;
for(int i=0;i<n;i++)
std=std+Math.pow(arr[i]-mean,2);
return Math.sqrt(std/n);
}
}
import gradepack.Operations;
import java.util.*;
class GradesStatistics
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of students: ");
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
System.out.print("Enter the grade for student "+(i+1)+": ");
arr[i]=sc.nextInt();
if(arr[i] >0 && arr[i]<100)
continue;
else
break;
}
System.out.print("The grades are: [");
for(int i=0;i<n;i++)
{
if(i==(n-1))
System.out.println(arr[i]+"]");
else
System.out.print(arr[i]+", ");
}
Operations op=new Operations();
System.out.printf("The average: %.2f\n",op.average(arr));
System.out.printf("The median: %.2f\n",op.median(arr));
System.out.println("The minimum: "+op.minimum(arr));
System.out.println("The maximum: "+op.maximum(arr));
System.out.printf("The standard deviation is: %.2f",op.standardDeviation(arr));
}
}

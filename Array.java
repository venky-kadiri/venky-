import java.io.*;
import java.util.*;
class Array
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int sum=0;
double avg;
for(int i=0;i<n;i++)
{
sum=sum+(arr[i]);
}
avg=(sum/n);
System.out.println("sum is:"+sum+" "+"average is:"+avg);
}
}

import java.io.*;
import java.util.*;
class SecondArray
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int min=999,max=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(min>a[i])
{
min=a[i];
}
if(max<a[i])
{
max=a[i];
}
}
System.out.println("min value:"+min+"\n"+"max value:"+max);
}}

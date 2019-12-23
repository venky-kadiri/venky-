import java.io.*;
import java.util.*;
class ThirdArray
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int x=0;
int n=sc.nextInt();
int b[]=new int[n];
for(int i=0;i<n;i++)
{
b[i]=sc.nextInt();
}
System.out.println("enter search element");
int k=sc.nextInt();
int flag=0;
for(int i=0;i<n;i++)
{
if(b[i]==k)
{
flag=1;
x=x+i;
break;
}
else
{
flag=0;
}
}
if(flag==1)
{
System.out.println("found at index: "+x);
}
else
{
System.out.println("-1");
}
}
}
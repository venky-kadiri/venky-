import java.io.*;
import java.util.*;
class Sixth
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int temp;
int n=sc.nextInt();
int s[]=new int[n];
for(int i=0;i<n;i++)
{
s[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++)
{
if(s[i]>s[j])
{
temp=s[i];
s[i]=s[j];
s[j]=temp;
}
}
}
for(int k=0;k<n;k++)
{
System.out.print(s[k]+" ");
}
}
}
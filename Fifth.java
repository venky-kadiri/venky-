import java.io.*;
import java.util.*;
class Fifth
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int s[]=new int[n];
for(int i=0;i<n;i++)
{
s[i]=sc.nextInt();
}
int max1=s[0],max2=s[1],temp,min1=s[0],min2=s[1];
if (max1 < max2)
{
temp = max1;
max1 = max2;
max2 = temp;
}
if (min1 > min2)
{
temp = min1;
min1 = min2;
min2 = temp;
}
for(int i=2;i<n;i++)
{
if(max1<s[i])
{
max2=max1;
max1=s[i];
}
else if (s[i] > max2 && s[i] != max1)			{
max2 = s[i];
}
if(min1>s[i])
{
min2=min1;
min1=s[i];
}
else if(min2>s[i] && s[i]!=min1)
{
min2 = s[i];
}
}
System.out.println(max1+"&"+max2+"  are max1 and max2");
System.out.println(min1+"&"+min2+"  are min1 and min2");
}
}
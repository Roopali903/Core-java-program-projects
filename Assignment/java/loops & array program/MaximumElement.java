import java.util.*;
class MaximumElement{
public static void main(String s[])
{ 
   int a[] = {4,5,3,2,8,1};  
   int max =a[0];
   for(int i=1;i<a.length;i++)
{
   if(max<a[i])
{
  max=a[i];
}

}
System.out.println("max is:"+max);
}
}
     




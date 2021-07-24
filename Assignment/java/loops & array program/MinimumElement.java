import java.util.*;
class MinimumElement{
public static void main(String s[])
{ 
   int a[] = {4,5,3,2,8,1};  
   int min =a[0];
   for(int i=1;i<a.length;i++)
{
   if(min>a[i])
{
  min=a[i];
}

}
System.out.println("min is:"+min);
}
}
     

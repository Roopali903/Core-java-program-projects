import java.util.*;
class LinearSearch{
public static void main(String s[])
{ 
   int arr[] = {4,5,3,2,8,1};  
   int item =1;
   int temp = 0;
   for(int i=0;i<arr.length;i++)
{
   if(arr[i]==item)
{

 System.out.println("Element is present "+i+" index position");

}
}
if(temp==0)
{
System.out.println("item not found");
}
}
}
}
     

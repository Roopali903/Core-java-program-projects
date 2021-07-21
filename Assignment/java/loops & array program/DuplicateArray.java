import java.util.*;
class DuplicateArray{
public static void main(String s[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter size of array");
int n = sc.nextInt();
System.out.println("enter an element:");
int arr[] = new int[n];

for(int i=0; i<n; i++)
{
arr[i]= sc.nextInt();
System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println("Duplicate element:");
for(int i=0; i<n; i++)
{
for(int j=i+1;j<n;j++)
{

 if(arr[i] == arr[j])
{
System.out.println(arr[j]);
}
}
}
}
}

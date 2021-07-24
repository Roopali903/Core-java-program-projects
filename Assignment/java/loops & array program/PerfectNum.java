//for ex 6-> 1 2 3 4 5 now 6 is completely divisible by 1+2+3=6 so this is a perfect number 
import java.util.*;
class PerfectNum{
public static void main(String s[])
{
int num , i , sum=0;
System.out.println("enter your number :");
Scanner sc = new Scanner(System.in);
num = sc.nextInt();
for(i=1 ; i<num;i++)
{
if(num%i==0)
{
sum = sum + i;
}
}
if(num==sum)
{
System.out.println("Given number is  perfect number");
}
else 
{
System.out.println("Given number is not an perfect number");
}
}
}

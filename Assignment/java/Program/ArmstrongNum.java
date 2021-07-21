import java.util.*;
public  class ArmstrongNum{
public static void main(String s[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int num = sc.nextInt();
double c = 0.0 , digit ,sum = 0.0;
int num1 = num;
int temp = num1;
while(num > 0){
int rem = num%10;
{
c++;
}
num = num/10;
}
while(num1 > 0)
{
digit = num1%10;
sum = sum+Math.pow(digit, c);
num1 = num1/10;
}

if(sum==temp)
{
System.out.println("Given number is armstrong");
}
else
{
System.out.println("Given number is not armstrong");
}
}
}

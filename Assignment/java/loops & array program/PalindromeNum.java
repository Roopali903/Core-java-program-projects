//After reversing a number will be same for ex 1551 or 121 are palindrome number.
import java.util.*;
class PalindromeNum{
public static void main(String s[])
{
int n ,i,r,c, v = 0; 
System.out.println("enter a number : ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
c=n;
while(n>0)
{
r = n%10;
v = (v*10)+r;
n = n/10;
}
if(c == v)
{
System.out.println("palindrom number");
}
else {
System.out.println("Not a palindrom number");
}
}
}



              
         

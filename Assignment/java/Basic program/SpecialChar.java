import java.util.*;
class SpecialChar{
public static void main(String s[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter alphabet digit or symbol: ");
char ch = sc.next().charAt(0);
if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
      System.out.println("This is an alphabet");
   else if(ch >= '0' && ch <= '9')
      System.out.println("This is a number");
   else
      System.out.println("This is a special character");
}
}

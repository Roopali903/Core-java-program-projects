import java.util.*;
class GreaterNum{
public static void main(String s[])
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c= sc.nextInt();
if(a>b && a>c)
{
System.out.println("a is greater");
}
elseif(b>a && b>c)
{
System.out.println("b is greater");
}
else{
System.out.println("c is greater");
}
}
}
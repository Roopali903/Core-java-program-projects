
 
import java.util.*;
class Quadratic{
public static void main(String s[])
{
double firstroot = 0 , secondroot = 0;

Scanner sc = new Scanner(System.in);
Double a = sc.nextDouble();
Double b = sc.nextDouble();
Double c= sc.nextDouble();
double determinant = (b*b)-(4*a*c);
double sqrt = Math.sqrt(determinant);
if(determinant>0)
{
firstroot =  -b +sqrt/(2*a) ;
secondroot =  -b -sqrt/(2*a);
System.out.println("first"+firstroot+"sec" +secondroot);
}
else
{

Double rootvalue = (-b+sqrt)/(2*a);
System.out.println("rr"+rootvalue);
}
}
}

import java.util.*;
 public class Leap
{
public static void main(String s[])
{
int year;
System.out.println("enter an year");
Scanner sc = new Scanner(System.in);
 year = sc.nextInt();

if(((year % 4 == 0) && (year % 100! == 0)) || (year % 400 == 0))
    System.out.println("leap");
else
    System.out.println("common");    
}
}

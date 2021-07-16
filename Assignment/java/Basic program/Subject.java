import java.util.*;
class Subject{
public static void main(String s[])
{

Scanner sc = new Scanner(System.in);
System.out.println("enter physics marks :");

int physics = sc.nextInt();
System.out.println("enter chemistry marks :");

int chemistry = sc.nextInt();
System.out.println("enter biology marks :");

int Biology = sc.nextInt();
System.out.println("enter maths marks :");
int maths = sc.nextInt();
System.out.println("enter computer marks :");
int computer = sc.nextInt();

 int percentage = (physics + chemistry +Biology + maths + computer)*100/500;

System.out.println("your percentile is :" +percentage);
if(percentage >= 90)
{
System.out.println("Grade A");
}
else if(percentage >= 80)
{
System.out.println("Grade B");
}
else if(percentage >= 70)
{
System.out.println("Grade C");
}
else if(percentage >= 60)
{
System.out.println("Grade D");
}
else if(percentage >= 40)
{
System.out.println("Grade E");
}
else
{
System.out.println("Grade F");
}
}
}
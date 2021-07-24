import java.util.*;
class ReverseNum{
public static void main(String s[])
{
int rev=0;
Scanner sc = new Scanner(System.in);  
int i = sc.nextInt();
System.out.println("enter a numner:");
while(i!=0)
{
int rem=i%10;
rev=rev*10+rem;
i = i/10;
}

System.out.println("Reverse of the number:"+rev);
}
}

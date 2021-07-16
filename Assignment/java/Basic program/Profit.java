import java.util.*;
class Profit{
public static void main(String s[])
{
Scanner sc = new Scanner(System.in);

System.out.println("enter s.p ");
int sp = sc.nextInt();
System.out.println("enter c.p ");
int cp = sc.nextInt();
if(sp>cp)
{
int rofit;
rofit = sp - cp;
System.out.println("profit ="+rofit);
int ppercent;
 ppercent = rofit*100/cp;
System.out.println("rofit =" +ppercent);
}
else{
int loss;
profit = cp - sp;
System.out.println("loss ="+loss);
int lpercent;
 lpercent = loss*100/cp;
System.out.println("loss =" +lpercent);
}
}
}


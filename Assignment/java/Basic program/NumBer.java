import java.util.*;
class NumBer{
public static void main(String s[])
{
Scanner sc = new Scanner(System.in);
System.out.print("enter a number: ");
int a = sc.nextInt();
System.out.print("enter b number: ");
int b = sc.nextInt();
System.out.print("enter c number: ");
int c = sc.nextInt();
if((a>b) && (b>c))
{
      System.out.print(" Descending order :" +c+" "+b+" "+a);
              //System.out.print(" Descending order :" +b);
               //System.out.println(" Descending order :" +c);

             //System.out.println("Ascending order : " +cba);
        }
        else
        {
            //system.out.println("Descending order :" +acb);
            System.out.println("Ascending order : ");
        }
}
}


© 2021 GitHub, Inc.
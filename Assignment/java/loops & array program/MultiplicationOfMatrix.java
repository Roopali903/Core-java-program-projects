import java.util.*;
class MultiplicationOfMatrix{
public static void main(String s[])
{
int a[][] = new int[3][3];
int b[][] = new int[3][3];
int c[][] = new int[3][3];
Scanner sc = new Scanner(System.in);
System.out.println("enter first matrix");
for(int i=0 ; i<3 ; i++)//rows
{
for(int j=0;j<3;j++)//column
{
a[i][j]=sc.nextInt();
}
}
System.out.println("enter second matrix");
for(int i=0;i<3;i++)//rows
{
for(int j=0;j<3;j++)//column
{
b[i][j]=sc.nextInt();
}
}
System.out.println(" first matrix\n");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.print("\n");
}
System.out.println(" second matrix\n");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.print("\n");
}
System.out.println(" sum of matrix\n");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
c[i][j] = a[i][j] * b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.print("\n");
}
}
}

import java.util.*;
class TransposeOfMatrix{
public static void main(String s[])
{
int a[][] = new int[3][3];
Scanner sc = new Scanner(System.in);
System.out.println("enter first matrix");
for(int i=0;i<3;i++)//rows
{
for(int j=0;j<3;j++)//column
{
a[i][j]=sc.nextInt();
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

System.out.println(" transpose of matrix\n");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(a[j][i]+" ");
}
System.out.print("\n");
}
}
}

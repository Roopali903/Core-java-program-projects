/* Insert item in array */

//a[3] = 34 56 78
//loc = 1 item = 100
//a[3+1] = 34 100 56 78

import java.util.*;
class InsertElement{
public static void main(String s[])
{
int size , loc , i,item; // size = 4
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of an array: ");
    size = sc.nextInt();

int array[] = new int[size + 1]; //array a[5]
    System.out.println("enter Array elements: ");

for(i=0;i<size ; i++)// for taking user input
{
    array[i] = sc.nextInt();
}
    System.out.println("enter Array location: ");
    loc = sc.nextInt(); //loc = 2
    System.out.println("enter new item: ");
    item = sc.nextInt();//item = 100
for(i=size;i>loc;i--)
{
    array[i] = array[i-1];
}
   array[loc] = item;
   size++;
for(i=0;i<array.length;i++)
{ 
    System.out.println(array[i]);
}
}
}






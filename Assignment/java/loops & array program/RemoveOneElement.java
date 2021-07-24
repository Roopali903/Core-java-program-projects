class RemoveOneElement
{
public static void main(String s[])
{
          int[] a={10,20,30,50,60,80};
          int del_ele=30;
          int count=0;
  for(int i=0;i<a.length;i++)
  {
          if(del_ele == a[i])
  {
  for(int j = i;j<a.length-1;j++)
  {
          a[j]=a[j+1];
  }
  count = count+1;
  break;
  }
}
   if(count==0)
  {
   System.out.println("element not found");
  }
   else{
   System.out.println("element deleted sucessfully");
  for(int i=0;i<a.length-1;i++)
  {
  System.out.println(a[i]+" ");
}
}
}
}


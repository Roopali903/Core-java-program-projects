
class AscendingArray{
public static void main(String s[])
{
System.out.println("Sorted array");
int a[] = {2,3,9,5,0,1,6,8};
int temp = 0;
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;

}
}
}

for(int i=0;i<a.length;i++){
System.out.println(" "+a[i]+" ");
}
}
}
import java.util.*;
class psp4
{
public static void main(String gg[])
{
int e,y,size,i,k;  
// taking the size as an input
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the size of array: ");  
size=sc.nextInt();   
// taking the target value as an input.
System.out.print("Enter the value of target: ");  
k=sc.nextInt(); 
// declaring an array of length=size and taking the elements as an input  
int[] x = new int[size];  
for(i=0; i<size; i++)  
{  
System.out.println("Enter an element: ");  
x[i]=sc.nextInt();  
}  
int in,largest=x[0];
// finding out the largest 
//declaring another array of size=largest+1 value of x array 
for(i=1;i<size;i++) if(x[i]>largest) largest=x[i];
int[] arr=new int[largest+1];
int arrsz=largest+1;
// initializing each index with 0
for(i=0;i<largest;i++) arr[i]=0;
for(e=0;e<size;e++)
{
y=x[e];
arr[y]=arr[y]+1;
}
// due to the above loop we now have the occurence count of each element
ArrayList<Integer> list=new ArrayList<Integer>();
// the one with the largest value of arr needs to be pushed inside a list/
int ii=0;
while(ii<k)
{
largest=arr[0];
in=0;
for(i=1;i<arrsz;i++) 
{
if(arr[i]>largest) 
{
largest=arr[i];
in=i;
}
}
arr[in]=0;
list.add(in);
ii++;
}
Collections.sort(list);
// sorting the list and printing the value till target count;
System.out.println("Output\n");
System.out.print("[");
for(e=0;e<k;e++) 
{
if(e!=k-1) System.out.print(list.get(e)+",");
else System.out.print(list.get(e));
}
System.out.println("]");
}
}
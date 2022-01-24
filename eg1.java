import java.util.*;
class PrintPermutations
{
public String swap(String a, int i, int j)
{
char temp;
char[] charArray = a.toCharArray();
temp = charArray[i];
charArray[i] = charArray[j];
charArray[j] = temp;
return String.valueOf(charArray);
}
public void PrintAllPermutations(String str,int l,int r, ArrayList<String> ss)
{
int n=r;
if(l==r) 
{
ss.add(str);//System.out.println(str);
}
else
{
for(int i = l; i <=r; i++)
{
// if the value of n is 3 then the last element will be swapped with 0 index
str=swap(str,l%n,i%n);
PrintAllPermutations(str, l+1, r,ss);
str=swap(str,l%n,i%n);
}
}
}
public ArrayList<String> printAllPermutations(int n)
{
ArrayList<String> strL=new ArrayList<String>();
String str="";
for(int i=1;i<=n;i++) str=str+i;
//System.out.println(str);
PrintAllPermutations(str,1,n,strL);
return strL;
}
}
class psp1
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int n,k;
System.out.print("Enter the value for N:");
n=sc.nextInt();
System.out.print("Enter the value for K:");
k=sc.nextInt();
PrintPermutations pp=new PrintPermutations();
ArrayList<String> list=pp.printAllPermutations(n);
Collections.sort(list);
//for(int i=0;i<list.size();i++) System.out.println(list.get(i));
System.out.println(list.get(k-1));
}
}
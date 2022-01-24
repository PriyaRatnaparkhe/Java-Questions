import java.util.*;
class psp3
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int size;
System.out.print("Enter the number of words:");
size=sc.nextInt();
//System.out.println(size);
ArrayList<String> list=new ArrayList<String>();
for(int i=0;i<size;i++)
{
System.out.print("Enter a string :");
list.add(sc.next());
}
ArrayList<String> copyList=new ArrayList<String>();
for(int rr=0;rr<list.size();rr++)
{
String input = list.get(rr);
char[] charArray = input.toCharArray();
Arrays.sort(charArray);
String sortedString = new String(charArray);
copyList.add(sortedString);
}
ArrayList<List> mainList=new ArrayList<List>();
int e;
String mm,ss;
while(copyList.size()!=0)
{
ArrayList<String> sampleList=new ArrayList<String>();
mm=copyList.get(0);
sampleList.add(list.get(0));
list.remove(0);
copyList.remove(0);
e=0;
while(e<copyList.size())
{
ss=copyList.get(e);
if(mm.equals(ss))
{
sampleList.add(list.get(e));
list.remove(e);
copyList.remove(e);
e--;
}
e++;
}
mainList.add(sampleList);
}
System.out.println("[");
for(int f=0;f<mainList.size();f++)
{
List rr=mainList.get(f);
System.out.print("[");
for(int i=0;i<rr.size();i++)
{
if(i==rr.size()-1) System.out.print(rr.get(i));
else System.out.print(rr.get(i)+" ,");
}
System.out.print("]");
System.out.println("\n");	
}
System.out.println("]");
}
}
import java.util.*;
class CombinationSum
{
public void _combinationSum(int start, int target, int[] arr, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> mainList)
{
if(target == 0) 
{
mainList.add(new ArrayList<>(list));
return; 
}
for(int i=start;i<arr.length;i++)
{
if(i>start&&arr[i]==arr[i-1])
{
continue;
}
if(arr[start]>target) 
{
break;
}
list.add(arr[i]);
_combinationSum(i+1, target-arr[i], arr,list,mainList);
list.remove(list.size()-1); 
}
}
public ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) 
{
Arrays.sort(arr);
ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
_combinationSum(0, target,arr, new ArrayList<Integer>(), mainList);
return mainList;
}
}

class psp2
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int size;
System.out.print("Enter the size of array:");
size=sc.nextInt();
int[] arr=new int[size];
for(int i=0;i<size;i++)
{
System.out.print("Enter a number :");
arr[i]=sc.nextInt();
}
int target;
System.out.print("Enter the value of target :");
target=sc.nextInt();
CombinationSum cs=new CombinationSum();
ArrayList<ArrayList<Integer>> mainList=new ArrayList<ArrayList<Integer>>();
mainList=cs.combinationSum(arr,target);
ArrayList<Integer> sampleList=new ArrayList<>();
for(int i=0;i<mainList.size();i++)
{
sampleList=mainList.get(i);
for(int rr=0;rr<sampleList.size();rr++)
{
System.out.println(sampleList.get(rr));
}
System.out.println();
}
}
}
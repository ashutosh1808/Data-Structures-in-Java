import java.io.*;
public class Main{
public static void main(String...args){
Console c=System.console();
int n=Integer.parseInt(c.readLine("enter n: "));
int[] array=new int[n];
for(int i=0;i<n;i++)
	array[i]=Integer.parseInt(c.readLine("enter element: "));
int target=Integer.parseInt(c.readLine("enter target: "));
int index=InterpolationSearch(array,target);
if(index!=-1)
	System.out.println("Element found at index "+(index+1));
else
	System.out.println("Element not found");
}

private static int interpolationSearch(int array[],int value){
int high=array.length-1;
int low=0;
while(value>=array[low] && value<=array[high] && low<=high){
	int probe=low+(high-low)*(value-array[low])/(array[high]-array[low]); //probe is a guess
	if(array[probe]==value)		return probe;
	else if(array[probe]<value)	low=probe+1;
	else				high=probe-1;
}
return -1;
}
}

//avg case = O(log(log(n)))
//works fine for uniformly distributed data

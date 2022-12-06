import java.io.*;
public class Main{
public static int LinearSearch(int[] array,int value){
for(int i=0;i<array.length;i++){
	if(array[i]==value)
		return i;
}
return -1;
}

public static void main(String...args){
Console c=System.console();
int n=Integer.parseInt(c.readLine("enter n value: "));
int[] array=new int[n];
for(int i=0;i<array.length;i++){
	array[i]=Integer.parseInt(c.readLine("enter element "+(i+1)+": "));
}
int value=Integer.parseInt(c.readLine("enter value u wish 2 search: "));
int index=LinearSearch(array,value);
if(index!=-1)
	System.out.println("Element found at position "+index);
else
	System.out.println("Element not found");
}
}
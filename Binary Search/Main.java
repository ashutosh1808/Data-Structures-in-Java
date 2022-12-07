import java.util.Arrays;
import java.io.Console;
public class Main{
public static void main(String[] args){
int array[]=new int[100];
Console c=System.console();
int target=Integer.parseInt(c.readLine("enter target: "));
for(int i=0;i<array.length;i++){
	array[i]=i;
}
int index=Arrays.binarySearch(array,target); //built in method
if(index!=-1){
	System.out.println("Element found at index "+index);
}else{
	System.out.println("Element not found");
}

}
}

//avg case --> O(log(n))

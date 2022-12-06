import java.util.*;
public class Main{
public static void main(String...args){
Queue<String> queue=new PriorityQueue<>();

queue.offer("B");
queue.offer("C");
queue.offer("A");
queue.offer("F");
queue.offer("D");

while(!queue.isEmpty()){
	System.out.println(queue.poll());
}

}
}
import java.util.*;
import java.io.*;
public class Main{
public static void main(String...args){
Console c=System.console();
Queue<String> queue=new LinkedList<String>(); //as it inherits linkedlist hierarchically
while(true){
int op=Integer.parseInt(c.readLine("1-enqueue, 2-dequeue, 3-show, 4-exit: "));
switch(op){
	case 1 ->{
		String data=c.readLine("enter a string: ");
		queue.offer(data);
		System.out.println(data+" enqueued");
	}
	case 2 -> {
		if(queue.size()==0)
			System.out.println("empty queue");
		else{
			String d=queue.poll();
			System.out.println(d+" dequeued");
		}
	}
	case 3 -> System.out.println("Queue = "+queue);
	case 4 -> System.exit(0);
	default -> System.out.println("Idu");
}
}

/*
1- used in linked lists, bfs
2- printer queues
3- priority queues
*/

}
}
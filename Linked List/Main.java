import java.util.*;
public class Main{
public static void main(String...args)
{
LinkedList<String> linkedList=new LinkedList<String>();
/*
linkedList.push("A"); // can be treated as a stack
linkedList.push("B");
linkedList.push("C");
linkedList.push("D");
System.out.println(linkedList);
linkedList.pop();
System.out.println(linkedList);
*/

linkedList.offer("A"); // as a queue
linkedList.offer("B");
linkedList.offer("C");
linkedList.offer("D");
linkedList.offer("F");
System.out.println(linkedList);
//linkedList.poll();
//System.out.println(linkedList);


linkedList.add(4,"E"); // add at a position
linkedList.remove("E"); //remove an element

System.out.println(linkedList);

linkedList.addFirst("O");
linkedList.addLast("N");

System.out.println(linkedList);
System.out.println(linkedList.peekFirst());
System.out.println(linkedList.peekLast());
//System.out.println(linkedList.indexOf("E"));
String first=linkedList.removeFirst();
String last=linkedList.removeLast();
System.out.println(linkedList);
}
}
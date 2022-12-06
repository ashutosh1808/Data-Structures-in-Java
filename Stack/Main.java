import java.util.Stack;
import java.io.*;
public class Main{
public static void main(String...args){
Console c=System.console();
Stack<String> stack=new Stack<String>();  //stack of strings 

while(true){
int op=Integer.parseInt(c.readLine("1-push, 2-pop, 3-peek, 4-show, 5-exit: "));
switch(op){
	case 1 -> {
		String data=c.readLine("enter something to push: ");
		stack.push(data);
		System.out.println(data+" pushed");
	}
	case 2 -> {
		if(stack.size()==0)
			System.out.println("empty stack");
		else{
			String d=stack.pop();
			System.out.println(d+" popped");
		}
	}
	case 3 -> System.out.println(stack.peek());
	case 4 -> System.out.println("Stack is --> "+stack);
	case 5 -> System.exit(0);
	default -> System.out.println("Sorry, I'm still learning");
}
}

/*uses of stacks
1. undo/redo features in text editor
2. moving back/forward through browser history
3. backtracking algorithms
4. call stacks
*/

}
}
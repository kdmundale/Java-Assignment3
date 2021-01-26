import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of your stack:");
		Scanner noInput = new Scanner(System.in);
		int size = noInput.nextInt();
		
		Stack<String> myStack = buildStack(size);
		peekStack(myStack);
		count(myStack);
		isStackFull(myStack, size);
	    myStack  = pushStack(myStack);
		peekStack(myStack);
		count(myStack);
		myStack  = pushStack(myStack);
		peekStack(myStack);
		count(myStack);
		myStack  = pushStack(myStack);
		peekStack(myStack);
		count(myStack);
		isStackFull(myStack, size);
		myStack = popStack(myStack);
		peekStack(myStack);
		count(myStack);
		myStack = popStack(myStack);
		isStackFull(myStack, size);
		myStack = change(myStack);
		display(myStack);
		System.out.println("now pop() X 3");
		myStack = popStack(myStack);
		myStack = popStack(myStack);
		myStack = popStack(myStack);
		isStackFull(myStack, size);
		count(myStack);
		System.out.println("now pop() X 3");
		myStack = popStack(myStack);
		myStack = popStack(myStack);
		myStack = popStack(myStack);
		System.out.println("Is the stack now empty?\n" + myStack.isEmpty());
		
	}
	
	public static Stack<String> buildStack(int size){
		
		Stack<String> ll = new Stack<String>();
		
		System.out.println("Enter the string elements for the stack...");
		for(int x=0; x < size; x++) {
			System.out.println("element:");
			Scanner input = new Scanner(System.in);
			String item = input.nextLine();
			
			ll.add(item);	
		}
		
		System.out.println(ll);
		
		return ll;
	}
	
	public static Stack<String> pushStack(Stack<String> liLi){
		
		System.out.println("\nEnter element to demo push():");
		Scanner input = new Scanner(System.in);
		String item = input.nextLine();
		
		liLi.push(item);
		
		System.out.print("\nNew List: " + liLi);
		
		return liLi;
	}
	
	public static Stack<String> popStack(Stack<String> liLi){
		
		liLi.pop();
		System.out.print("\nAfter pop(): " + liLi);
		
		return liLi;
	}
	
	public static void peekStack(Stack<String> liLi){
		
		String elm = liLi.peek();
		System.out.print("\nElement at the top of the stack: " + elm);
		
	}
	
	public static void count(Stack<String> liLi) {
		
		System.out.println("\nStack size is: "+ liLi.size());
	}
	
	public static Stack<String> change(Stack<String> liLi){
		
		System.out.println("Enter index of elm you want to change:");
		Scanner noInput = new Scanner(System.in);
		int indx = noInput.nextInt();
		System.out.println("Enter the new element:");
		Scanner input = new Scanner(System.in);
		String item = input.nextLine();
		
		liLi.set(indx, item);
		System.out.print("\nThe new stack is: " + liLi);
		
		return liLi;
	}
	
	public static void display(Stack<String> liLi) {
		
		System.out.println("\nThe elements in your stack, by element, are:");
		
		for(String i: liLi) {
			System.out.println(i);
		}
		
	}
	
	public static void isStackEmpty(Stack<String> liLi) {
		
		System.out.println(liLi.isEmpty());
	}
	
	public static void isStackFull(Stack<String> liLi, int s) {
		
		int len = liLi.size();
		if(len < s) {
			System.out.println("\nThe stack is not full.");
		} else if (len == s) {
			System.out.println("\nThe stack is full.");
		} else {
			System.out.println("\nThe stack is overflowing!");
		}
		
	}

}

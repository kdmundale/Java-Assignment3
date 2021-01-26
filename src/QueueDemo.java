import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of your queue:");
		Scanner noInput = new Scanner(System.in);
		final int size = noInput.nextInt(); 
				
		Queue<String >myQueue = buildQueue(size);
		isFull(myQueue, size);
		System.out.println(".........try to enqueue.........");
		myQueue = enqueue(myQueue, size);
		
		System.out.println(".........Dequeue.........");
		myQueue = dequeue(myQueue);
		System.out.println("Queue count:" + countQ(myQueue));
		isFull(myQueue, size);
		myQueue = dequeue(myQueue);
		isFull(myQueue, size);
		
		System.out.println(".........try to enqueue.........");
		myQueue = enqueue(myQueue, size);
		isFull(myQueue, size);
		System.out.println("Queue count:" + countQ(myQueue));
		displayQ(myQueue);
		emptyQ(myQueue);
		System.out.println("is the queue empty? " + myQueue.isEmpty());
				
	}
	
	
	public static Queue<String> buildQueue(int size){
		
		Queue<String> q = new LinkedList<String>();
		
		System.out.println("Enter the string elements for the queue...");
		for(int x=0; x < size; x++) {
			System.out.println("element:");
			Scanner input = new Scanner(System.in);
			String item = input.nextLine();
			
			q.add(item);	
		}
		System.out.println("your queue: " + q);
		return q; 
		
	}
	
	//insert item at rear of queue
	
	public static void isFull(Queue<String> q, int size) {
		
		int len = q.size();
		if(len < size) {
			System.out.println("Queue is not full.");
		} else if (len == size) {
			System.out.println("Queue is full.");
		} else {
			System.out.println("Queue is overflowed.");
		}
	}
	
	public static Queue<String> enqueue(Queue<String> q, int s){
		
		int len = q.size();
		if (len < s) {
			System.out.println("\nEnter element to add to queue:");
			Scanner input = new Scanner(System.in);
			String item = input.nextLine();
			q.add(item);
			System.out.println("Queue with new element: " + q);
		} else if ((len == s) || (len > s)) {
			System.out.println("Queue is full, cannot add.");
		}
		
		return q;
	}
	
	public static Queue<String> dequeue(Queue<String> q){
		
		String elm = q.poll();
		System.out.println("dequeue item: "+ elm);
		System.out.println("Queue is now: "+ q);
		
		return q;
	}
	
	public static int countQ(Queue<String> q) {
		return q.size();
	}
	
	public static void displayQ(Queue<String> q) {
		System.out.println("Print queue by element.");
		for(String s: q) {
			System.out.println(s);
		}
	}
	
	public static Queue<String> emptyQ(Queue<String> q){
		
		System.out.println("empty the queue");
		while (q.size() > 0) {
			String elm = q.poll();
			System.out.println("queue minus: " +elm+ " is now: "+ q);
		}
		
		return q;
	}
 
}
 
/**
 * This class represent the main method of Integer check 
 * 
 * @author Lior Maimon
 * mmn14 , Question 1
 */
import java.security.SecureRandom;
import java.util.Iterator;

public class IntCheck {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[10];
		SecureRandom randomNumb = new SecureRandom();
		PrioQueue<Integer> queue = new PrioQueue<Integer>(10);
		Iterator<Integer> e;
		
		for(int i = 0; i < 10; i++){
			intArray[i] = randomNumb.nextInt(100);
			queue.add(intArray[i], randomNumb.nextInt(10));
		}
		e = queue.iterator();
		System.out.println("The queue is:");
		while(e.hasNext()){
			System.out.print(e.next() + " ");
		}
		System.out.println("\nfirst member in the queue: " + queue.poll());
		e = queue.iterator();
		System.out.println("after we did poll: ");
		while(e.hasNext()){
			System.out.print(e.next() + " " );
		}
		System.out.println("\nCheck if the queue contains the Integer 14 : " + queue.contains(14));
		queue.add(14, randomNumb.nextInt(10));
		queue.add(14, randomNumb.nextInt(10));
		e = queue.iterator();
		System.out.println("The queue now contains (after adding twice time 14):");
		while(e.hasNext()){
			System.out.print(e.next() + " " );
		}
		System.out.println("\nRemove integer 14 with the highest priority");
		queue.remove(14);
		e = queue.iterator();
		System.out.println("The queue now contains:");
		while(e.hasNext()){
			System.out.print(e.next() + " " );
		}
		System.out.println("\nThe queue size is: " + queue.size());
		
	}

}

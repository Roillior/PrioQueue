/**
 * This class represent the main method of Customer check
 * 
 * @author Lior Maimon 
 * mmn14 , Question 1
 */
import java.security.SecureRandom;
import java.util.Iterator;

public class CustomerTest {

	public static void main(String[] args) {
		Customer a,b,c,d,e,f;
		SecureRandom randomNumb = new SecureRandom();
		PrioQueue<Customer> queue = new PrioQueue<Customer>(10);
		Iterator<Customer> iterator;
		
		a = new Customer("a", 123456789, "msg1");
		b = new Customer("b", 123456789, "msg1");
		c = new Customer("c", 987654321, "msg");
		d = new Customer("d", 111111111, "msg2");
		e = new Customer("e", 222222222, "msg3");
		f = new Customer("f", 111111111, "msg2");
		
		queue.add(a, 3);
		queue.add(b, 2);
		queue.add(c, 1);
		queue.add(d, 4);
		queue.add(e, 3);
		queue.add(f, 9);
		
		System.out.println("check if the order of the queue is correct,The order shuld be\n c,b,a,e,d,f");
	

		iterator = queue.iterator();
		System.out.println("The queue is: ");
		while(iterator.hasNext()){
			System.out.println(iterator.next() + " " );
		}
		
		System.out.println("\nCheck poll: " + queue.poll());
		
		iterator = queue.iterator();
		System.out.println("\nThe queue after poll is: ");
		while(iterator.hasNext()){
			System.out.println(iterator.next() + " " );
		}
		
		System.out.println("\nCheck remove: try to remove d, d is remove?  " + queue.remove(d));
		
		iterator = queue.iterator();
		System.out.println("\nThe queue after remove is: ");
		while(iterator.hasNext()){
			System.out.println(iterator.next() + " " );
		}
		
		System.out.println("\nCheck method contains, check if the queue contains b ?" + queue.contains(b));

	}

}

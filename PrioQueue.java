/**
 * This class represent the priority queue
 * 
 * @author Lior Maimon 
 * mmn14 , Question 1
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class PrioQueue<T> {
	//instance variables
	private final int maxPrio; //represent number between 1 - 10 that say what is the max priority number of the queue
	private LinkedList<QueueItem<T>> itemsList;
	/**
	 * construct a new priority Queue 
	 * @param n - number between 1 to 10 represent the highest priority in the queue
	 */	
	public PrioQueue(int n){
		if(n < 1 || n > 10){ //check n between 1 - 10 if not make it be 10
			n = 10;
		}
		maxPrio = n;
		itemsList = new LinkedList<QueueItem<T>>();
	}
	/**
	 * method that get T object as an item for the queue and integer represent the item priority and add this item to the queue
	 * @param member - T object represent the new item
	 * @param prio - Integer represent the priority of the new item
	 */
	public void add(T member, int prio){
		QueueItem<T> item;
		int flag = 0;
		ListIterator<QueueItem<T>> listIterator = itemsList.listIterator();
		if(prio < 1 || prio > maxPrio ){
			prio = maxPrio;
		}
		item = new QueueItem<T>(member, prio);
		
		while(listIterator.hasNext()){
			if(listIterator.next().getPriority() <= prio){
				continue;
			}
			else{
				listIterator.previous();
				listIterator.add(item);
				flag = 1;	
				break;
			}
		}
		if(flag == 0){
			itemsList.add(item); //add in end of the queue
		}
	}
	/**
	 * method that return T object from the head of the queue and delet this item from the queue
	 * @return T object represent the item that was it the head of the queue (with the highest priority)
	 */
	public T poll(){
		T member;
		try{
			member = itemsList.getFirst().getItem();
			itemsList.removeFirst();
			return member;
		}
		catch(NoSuchElementException e){
			return null;
		}
	}
	/**
	 * method that get object T and check if he is in the queue
	 * @param member- T object represent the item in the queue
	 * @return boolean value - true if member in the queue false otherwise
	 */
	public boolean contains(T member){
		ListIterator<QueueItem<T>> listIterator = itemsList.listIterator();
		while(listIterator.hasNext()){
			if(listIterator.next().getItem().equals(member)){
				return true;
			}
		}
		return false;
	}
	/**
	 * method that get T object as an item and remove this item with the highest priority from the queue
	 * @param member - T object represent the item to remove
	 * @return boolean value - true if member is removed false otherwise
	 */
	public boolean remove(T member){
		ListIterator<QueueItem<T>> listIterator = itemsList.listIterator();
		while(listIterator.hasNext()){
			if(listIterator.next().getItem().equals(member)){
				listIterator.remove();
				return true;
			}
		}
		return false;
	}
	/**
	 * method that return the size of the queue
	 * @return Integer represent the number of items in the queue
	 */
	public int size(){
		return itemsList.size();
	}
	/**
	 * method that return iterator of the queue
	 * @return iterator to a list that contain the queue items
	 */
	public Iterator<T> iterator(){
		LinkedList<T> items = new LinkedList<>();
		for(QueueItem<T> member : itemsList){
			items.add(member.getItem());
		}
		return items.iterator();
	}
	
	
}

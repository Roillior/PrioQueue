/**
 * This class represent a queue item 
 * 
 * @author Lior Maimon 
 * mmn14 , Question 1
 */
public class QueueItem<T> {
	//instance variables
	private final int priority;
	private T item;
	/**
	 * construct a new Queue item 
	 * @param T newItem - represent the new item
	 * @param prio - integer represent the item priority
	 */	
	public QueueItem(T newItem, int prio){
		priority = prio;
		item = newItem;
	}
	/**
	 * Return the priority of the item
	 * @return integer represent the priority of the item
	 */
	public int getPriority(){
		return this.priority;
	}
	/**
	 * Return a reference to the item T
	 * @return reference to the item T
	 */
	public T getItem(){
		return item;
	}
}

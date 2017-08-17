/**
 * This class represent a Customer 
 * 
 * @author Lior Maimon 
 * mmn14 , Question 1
 */
public class Customer {
	//instance variables
	private String name;
	private int id;
	private String reference;
	/**
	 * empty constructor
	 */	
	public Customer(){
		this(null, 000000000, null);
	}
	/**
	 * construct a new customer object
	 * @param cName - represent the name of the customer
	 * @param cId - represent the id of the unique customer
	 * @param cReference - represent the customer reference
	 */	
	public Customer(String cName, int cId, String cReference){
		this.name = cName;
		this.id = cId;
		this.reference = cReference;
	}
	/**
	 * Return a pointer to the reference
	 * @return pointer to the reference
	 */
	public String getReference(){
		return this.reference;
	}
	/**
	 * Return integer represent the id of the customer
	 * @return integer represent the id number
	 */
	public int getId(){
		return this.id;
	}
	/**
	 * method equals - check if the 2 customers id are equals and the 2 customers reference are equals
	 * @param obj - object represent the other customer
	 * @return true if equal false otherwise
	 */
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Customer){
			if((this.id == ((Customer)obj).getId()) && (this.reference.equals(((Customer)obj).getReference()))){
				return true;
			}
		}
		return false;
	}
	/**
	 * method toString
	 * @return String
	 */
	@Override
	public String toString(){
		String str = ("name: "+this.name+" id: "+this.id+" reference: "+reference);
		return str;
	}
}

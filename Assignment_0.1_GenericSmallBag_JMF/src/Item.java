
public class Item<T> {
	
	/**
	 * methods
	 */
	private T e;
	
	/**
	 * empty argument constructor
	 */
	public Item()
	{
		this.e=null;
	} 
	
	/**
	 * preferred argument constructor
	 */
	public Item(T e)
	{
		this.e=e;
	}

	/**
	 * getters and setters
	 * @return
	 */
	public T getE() {
		return e;
	}

	public void setE(T e) {
		this.e = e;
	}

	/**
	 * toString to print in the main
	 */
	@Override
	public String toString() {
		return "Item [e=" + e + "]";
	}
	

}//end class

public class SmallBag<T> {
	
	/**
	 * methods
	 */
	public T item;
	
	/**
	 * empty argument constructor
	 */
	public SmallBag()
	{
		this.item=null;
	}
	
	/**
	 * preferred argument constructor
	 */
	public SmallBag(T item)
	{
		this.item=item;
	}

	/**
	 * getter and setter
	 * @return
	 */
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	/**
	 * toString to print in the main
	 */
	@Override
	public String toString() {
		return "SmallBag [item=" + item + "]";
	}
	
	
	
	

}


public class SmallBag<T> {
	
	public T item;
	
	public SmallBag()
	{
		this.item=null;
	}
	
	public SmallBag(T item)
	{
		this.item=item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	

}

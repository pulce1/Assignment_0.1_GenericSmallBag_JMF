
public class Item<T> {
	
	private T e;
	
	public Item()
	{
		this.e=null;
	} 
	
	public Item(T e)
	{
		this.e=e;
	}

	public T getE() {
		return e;
	}

	public void setE(T e) {
		this.e = e;
	}
	
	

}

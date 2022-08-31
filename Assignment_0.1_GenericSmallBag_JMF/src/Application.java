
public class Application {

	public static void main(String[] args) {
		/**
		 * Item <String> and Item <Integer> use generics to make an item/list with either string or ints
		 */
		Item<String> e = new Item<>("James");
		Item<Integer> number = new Item<>(8);
		System.out.println(e);
		System.out.println(number);
		
		/**
		 * SmallBag <String> and SmallBag <Integer> use generics to make an item/list with either string or ints
		 */
		
		SmallBag<String> name = new SmallBag<String>("James Frayser");
		System.out.println(name);
		SmallBag<Integer> integ = new SmallBag<Integer>(88);
		System.out.println(integ);
		

	}

}

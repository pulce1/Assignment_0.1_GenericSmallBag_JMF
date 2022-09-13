
/**
* The smallbag class allows you to name an item with any data type in the main
* @author jfrayser
* SmallBag.java
*/

public class SmallBag<T> {
       
       /**
       * The method item with the generic type T
       */
       public T item;
       
       /**
       * Empty argument constructor
       */
       public SmallBag()
       {
              this.item=null;
       }
       /**
       * Preferred argument constructor
       */
       public SmallBag(T item)
       {
              this.item=item;
       }

       /**
       * getter and setter
       * Gets the item method when called in the main
       * @return The item
       */
       public T getItem() {
              return item;
       }

       public void setItem(T item) {
              this.item = item;
       }
       
       /**
       * toString prints in the method when called
       * @return the smallbag depicted by item.
       */
       @Override
       public String toString() {
              return "SmallBag [item=" + item + "]";
       }
       

}//end class

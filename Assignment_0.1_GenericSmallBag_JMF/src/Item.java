
/**
* Item is the item depicted in the Smallbag when in the application
* @author jfrayser
* Item.java
*/

public class Item<T> {
                
                /**
                * Generic method e with the generic type T
                */
                private T e;
                
                /**
                * Empty argument constructor
                */
                public Item()
                {
                                this.e=null;
                } 
                /**
                * Preferred argument constructor
                */
                public Item(T e)
                {
                                this.e=e;
                }

                /**
                * getter and setter
                * @return Gives the method e in the main
                */
                public T getE() {
                                return e;
                }

                public void setE(T e) {
                                this.e = e;
                }
                
                /**
                * toString prints Item, the method e
                * @return The Item with the method e
                */
                @Override
                public String toString() {
                                return "Item [e=" + e + "]";
                }
                
                
                
}//end class

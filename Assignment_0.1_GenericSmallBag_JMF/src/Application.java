
/**
* Application Prints out both Item and SmallBag
* @author jfrayser
* Application.java
*/

public class Application {
       public static void main(String[] args) {
              /**
              * apllication to apply item to string or intger, same with both item and SmallBag
              */
              Item<String> I = new Item<>("James");
              System.out.println(I);
              SmallBag<String> name = new SmallBag<String>("James Frayser");
              System.out.println(name);
              SmallBag<Integer> integ = new SmallBag<Integer>(88);
              System.out.println(integ);
              

       }

}

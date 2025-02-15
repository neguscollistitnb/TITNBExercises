package week11.section8;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCartCleaner {

    public static void main(String[] args) {
        Map<String, Integer> items = new LinkedHashMap<>();

        items.put("Item 1" , 2);
        items.put("Item 2" , 4);
        items.put("Item 3" , 9);
        items.put("Item 4" , 3);
        items.put("Item 5" , 6);

        

    }

    public static String cleanShoppingCart(Map<String, Integer> items){
        if (items.isEmpty()){
            return "The cart is empty";
        }



        return "";
    }
}

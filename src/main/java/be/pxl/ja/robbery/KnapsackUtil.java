package be.pxl.ja.robbery;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {

    public static void fill(Knapsack knapsack, Shop shop) throws KnapsackFullException{

        Collections.sort(shop.items, Collections.reverseOrder());

        for(Product product : shop.items){
            knapsack.add(product);
        }
    }
}

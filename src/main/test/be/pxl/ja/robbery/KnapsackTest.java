package be.pxl.ja.robbery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class KnapsackTest {

    @Test
    public void getCurrentWeight() throws KnapsackFullException{
        Knapsack knapsack = new Knapsack(30.0);

        //name weight price ==> product
        Product product1 = new Product("product1", 10.0, 25.00);
        Product product2 = new Product("product1", 10.0, 25.00);
        Product product3 = new Product("product1", 5.0, 25.00);

        knapsack.add(product1);
        knapsack.add(product2);
        knapsack.add(product3);

        Assertions.assertEquals(25.0, knapsack.getCurrentWeight());
    }

    @Test
    public void addProductTooHeavyTest() throws KnapsackFullException{
        Product product1 = new Product("product1", 34.0, 25.00);
        Knapsack knapsack = new Knapsack(32.0);

       KnapsackFullException thrown = Assertions.assertThrows(KnapsackFullException.class,
               () -> knapsack.add(product1));
       
        Assertions.assertEquals(0, knapsack.getItems().size());

    }
}

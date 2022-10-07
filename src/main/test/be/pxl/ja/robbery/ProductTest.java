package be.pxl.ja.robbery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {

    private Product computer;
    private Product computerCompare;
    @BeforeEach
    public void init() {
        computer = new Product("computer", 2.0, 0);
        computerCompare = new Product("computer compare", 2.0, 0);

    }

    @Test
    public void productPriceIsSameTest(){
        computer.setPrice(999.99);
        computerCompare.setPrice(999.99);

        Assertions.assertEquals(0, computer.compareTo(computerCompare));
    }

    @Test
    public void productPriceIsLessTest(){
        computer.setPrice(499.99);
        computerCompare.setPrice(999.99);

        Assertions.assertEquals(-1, computer.compareTo(computerCompare));
    }

    @Test
    public void productPriceIsGreaterTest(){
        computer.setPrice(2999.99);
        computerCompare.setPrice(999.99);

        Assertions.assertEquals(1, computer.compareTo(computerCompare));
    }
}

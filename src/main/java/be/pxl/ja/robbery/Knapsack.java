package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double maximumCapacity;
    private List<Product> items = new ArrayList<>();

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public double getCurrentWeight(){

        return 0.0;
    }

    public void add(Product product){
        items.add(product);
    }

    public List<Product> getItems(){
        return items;
    }


}

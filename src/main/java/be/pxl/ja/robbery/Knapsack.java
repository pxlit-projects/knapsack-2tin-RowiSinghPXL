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
        double currentWeight = 0.0;
        for(Product product : items){
            currentWeight += product.getWeight();
        }
        return currentWeight;
    }

    public void add(Product product)throws KnapsackFullException{
        if(getCurrentWeight() + product.getWeight() > this.maximumCapacity){
            throw new KnapsackFullException("Cannot add product " + product.getName() + ". Maximum capacity reached");
        }
        items.add(product);
    }

    public List<Product> getItems(){
        return items;
    }


}

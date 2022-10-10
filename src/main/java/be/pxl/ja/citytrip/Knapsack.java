package be.pxl.ja.citytrip;

import be.pxl.ja.robbery.KnapsackFullException;
import be.pxl.ja.robbery.Product;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {

    private double maximumCapacity;
    private List<Attraction> items = new ArrayList<>();


    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public double getCurrentWeight(){
        double currentWeight = 0.0;
        for(Attraction attraction : items){
            currentWeight += attraction.getWeight();
        }
        return currentWeight;
    }

    public List<Attraction> getItems() {
        return items;
    }

    public void add(Attraction attraction) throws KnapsackFullException{
        if(getCurrentWeight() + attraction.getWeight() > this.maximumCapacity){
            throw new KnapsackFullException("Cannot add attraction " + attraction.getName() + ". Maximum capacity reached");
        }
        items.add(attraction);
    }


}

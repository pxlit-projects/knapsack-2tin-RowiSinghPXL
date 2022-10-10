package be.pxl.ja.citytrip;

import be.pxl.ja.robbery.Product;

public class Attraction implements Comparable<Attraction>  {
    private int rating;
    private double days;
    private String name;


    public Attraction(String name,double days,  int rating) {
        this.rating = rating;
        this.days = days;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight(){
        return days;
    }

    @Override
    public String toString() {
        return name + " " + days + "days rating" + rating;
    }

    @Override
    public int compareTo(Attraction attraction){
        return Double.compare(this.rating, attraction.rating);
    }
}

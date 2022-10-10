package be.pxl.ja.citytrip;

import be.pxl.ja.citytrip.Knapsack;
import be.pxl.ja.robbery.KnapsackFullException;


import java.util.Collections;
import java.util.List;

public class KnapsackUtil {

    public static void fill(Knapsack knapsack, LondonAttractions londonAttractions) throws KnapsackFullException {

        List<Attraction> attractions = londonAttractions.getItems();
        Collections.sort(attractions, Collections.reverseOrder());

        for(Attraction attraction : attractions){
            knapsack.add(attraction);
        }
    }
}

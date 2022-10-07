package be.pxl.ja.robbery;

public class Robbery {
    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack(35);

        Shop shop = new Shop();
        shop.add(new Product("stereo", 30, 3000));
        shop.add(new Product("laptop", 20, 2000));
        shop.add(new Product("guitar", 15, 1500));

        try{
            KnapsackUtil.fill(knapsack, shop);
        } catch (KnapsackFullException ex) {
            System.out.println(ex.getMessage());
        }


        System.out.println("\nList of products:");
        for (Product product : knapsack.getItems()) {
            System.out.println(product);
        }
    }
}
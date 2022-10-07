package be.pxl.ja.robbery;

public class KnapsackFullException extends Exception{
    public KnapsackFullException() {
        super("Your knapsack reached it maximum capacity.");
    }
}

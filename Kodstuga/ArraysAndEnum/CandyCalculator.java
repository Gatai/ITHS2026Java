package Kodstuga.ArraysAndEnum;

public class CandyCalculator {

    // Method that calculates total price and prints the result
    public static void calculatePrice(int amount, int pricePerPiece) {
        int total = amount * pricePerPiece;
        System.out.println("Amount: " + amount);
        System.out.println("Price per piece: " + pricePerPiece);
        System.out.println("Total price: " + total + " SEK");
    }

    // Overloaded method: fixed price of 2 SEK per piece
    public static void calculatePrice(int amount) {
        int fixedPrice = 2;
        int total = amount * fixedPrice;
        System.out.println("Amount: " + amount);
        System.out.println("Price per piece (fixed): " + fixedPrice);
        System.out.println("Total price: " + total + " SEK");
    }
}

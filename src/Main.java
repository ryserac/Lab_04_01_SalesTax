public class Main {
    public static void main(String[] args) {
        double SALES_TAX = .05;
        double purchasePrice = 28.79;
        double taxPrice;
        taxPrice = purchasePrice * SALES_TAX;
        System.out.println("The sales tax for a purchase of $" + purchasePrice + " is $" + taxPrice);
    }
}

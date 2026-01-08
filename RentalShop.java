public class RentalShop {
    public static void main(String[] args) {

        int itemA = 200, itemB = 75, itemC = 500;
        double price;

        // Calculate base price
        price = (itemA * 2) + (itemB) + (itemC * 3);

        // Apply 10% discount
        price = price - (0.10 * price);

        // Apply 5% tax
        price = price + (0.05 * price);

        // Additional discount if price > 1500
        if (price > 1500) {
            price = price - (0.05 * price);
        } else {
            System.out.println("Not eligible for discount");
        }

        // Print final price
        System.out.println(price);
    }
}

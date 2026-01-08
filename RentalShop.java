public class RentalShop {
    public static void main(String[] args) {
        int itemA = 200, itemB = 75, itemC = 500;
        double price;
        price = (itemA * 2) + (itemB) + (itemC * 3);
        price = price - (0.10 * price);
        price = price + (0.05 * price);
        if (price > 1500) {
            price = price - (0.05 * price);
        } else {
            System.out.println("Not eligible for discount");
        }
        System.out.println(price);
    }
}


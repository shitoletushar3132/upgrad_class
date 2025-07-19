import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    int code;
    String name;
    double price;

    public Item(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getItemName() {
        return name;
    }

    public double getCost() {
        return price;
    }

    @Override
    public String toString() {
        return "" + code + " | " + name + " | $" + price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Item> items = new ArrayList<>();

        items.add(new Item(1, "T-Shirt", 15.99));
        items.add(new Item(2, "Jeans", 29.99));
        items.add(new Item(3, "Shoes", 49.99));

        System.out.println("Available Items:");
        System.out.println("Code | Name | Price");
        for (Item item : items) {
            System.out.println(item);
        }

        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the number of items you want to purchase: ");
        int purchase = sc.nextInt();

        int[] itemNumber = new int[purchase];
        int[] quantity = new int[purchase];

        for (int i = 0; i < purchase; i++) {
            System.out.print("Enter item code for item " + (i + 1) + ": ");
            itemNumber[i] = sc.nextInt();
            System.out.print("Enter the quantity: ");
            quantity[i] = sc.nextInt();
        }

        System.out.println("\nName: " + name);
        System.out.println("Item Purchased:");
        System.out.printf("%-10s %-10s %-12s %-12s\n", "Item", "Quantity", "Cost/item", "Total cost");

        double grandTotal = 0;
        for (int i = 0; i < purchase; i++) {
            Item current = items.get(itemNumber[i] - 1);
            double totalCost = quantity[i] * current.getCost();
            grandTotal += totalCost;

            System.out.printf("%-10s %-10d $%-11.2f $%-11.2f\n",
                    current.getItemName(), quantity[i], current.getCost(), totalCost);
        }

        System.out.printf("\nTotal Cost before discount: $%.2f\n", grandTotal);

        System.out.println("Applied Discount: 15%");

        double discount = grandTotal * 0.15;
        double finalTotal = grandTotal - discount;

        System.out.printf("\nDiscount Amount: -$%.2f\n ", discount);

        System.out.printf("\nFinal Total Cost: $%.2f\n", finalTotal);

    }
}

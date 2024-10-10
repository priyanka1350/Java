public class Method_OverloadingSession {

    public static void main(String[] args) {
        // Displaying food details
        displayFoodDetails("Chocolate Cake");
        displayFoodDetails("Vanilla Cake", 500 );
        displayFoodDetails("Strawberry Pastry", 300, "Warrior bakery");

        // Inventory with overloading by changing number of parameters
        addFoodInventory("Chocolate Cake", 600);
        addFoodInventory("Chocolate Cake", 600, 10);
        addFoodInventory(350, 20);
        addFoodInventory(350.50, 25); // Price as double

        // Orders with different data types and order of parameters
        processOrder("Priya", 1000);
        processOrder("Priya", "Chocolate Cake", 1000);
        processOrder("Priya", "Pastry", 1200, "Takeaway");
        processOrder(1200, "Priya"); // Order with price first

        // Total bill calculation
        System.out.println("Total food bill: " + calculateTotalBill(1500, 800, 450, 1200, 600));
    }

    // Display food details
    public static void displayFoodDetails(String foodName) {
        System.out.println("Food Item: " + foodName);
    }

    public static void displayFoodDetails(String foodName, int price) {
        System.out.println("Food Item: " + foodName + ", Price: Rs. " + price);
    }

    public static void displayFoodDetails(String foodName, int price, String bakeryName) {
        System.out.println("Food Item: " + foodName + ", Price: Rs. " + price + ", Bakery: " + bakeryName);
    }

    //  changing the data type
    public static void addFoodInventory(String foodName, int price) {
        System.out.println("Food Item: " + foodName + ", Price: Rs. " + price);
    }

    //  changing the number of parameters
    public static void addFoodInventory(String foodName, int price, int quantity) {
        System.out.println("Food Item: " + foodName + ", Price: Rs. " + price + ", Quantity: " + quantity);
    }

    // changing the data type of price
    public static void addFoodInventory(double price, int quantity) {
        System.out.println("Price per unit: Rs. " + price + ", Quantity: " + quantity);
    }

    //  changing the order of parameters
    public static void processOrder(String customerName, int amount) {
        System.out.println("Customer: " + customerName + ", Order Amount: Rs. " + amount);
    }

    public static void processOrder(String customerName, String foodName, int amount) {
        System.out.println("Customer: " + customerName + ", Ordered: " + foodName + ", Order Amount: Rs. " + amount);
    }

    public static void processOrder(String customerName, String foodName, int amount, String orderType) {
        System.out.println("Customer: " + customerName + ", Ordered: " + foodName + ", Order Amount: Rs. " + amount + ", Order Type: " + orderType);
    }

    // changing the order of parameters
    public static void processOrder(int amount, String customerName) {
        System.out.println("Order Amount: Rs. " + amount + ", Customer: " + customerName);
    }

    // Calculate total food bill using varargs
    public static int calculateTotalBill(int... prices) {
        int total = 0;
        for (int price : prices) {
            total += price;
        }
        return total;
    }
}

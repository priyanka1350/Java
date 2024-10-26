class Food {
    static String foodCategory;
    static String origin;
    static String popularDish;

    String dishName;
    int calories;
    double price;
    boolean isVegetarian;

    static {
        foodCategory = "South Indian";
        origin = "India";
        popularDish = "Dosa";
    }

    public Food(String dishName, int calories, double price, boolean isVegetarian) {
        this.dishName = dishName;
        this.calories = calories;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public void displayInfo() {
        System.out.println("Food Category Type: " + foodCategory);
        System.out.println("Origin: " + origin);
        System.out.println("Popular Dish: " + popularDish);
        System.out.println("Dish Name: " + dishName);
        System.out.println("Calories: " + calories + " kcal");
        System.out.println("Price: $" + price);
        System.out.println("Vegetarian: " + isVegetarian);
    }
}

class Bluetooth {
    static String version;
    static String range;
    static String frequency;

    String deviceName;
    int batteryLife;
    boolean isWaterResistant;
    float weight;

    static {
        version = "5.0";
        range = "30 meters";
        frequency = "2.4 GHz";
    }

    public Bluetooth(String deviceName, int batteryLife, boolean isWaterResistant, float weight) {
        this.deviceName = deviceName;
        this.batteryLife = batteryLife;
        this.isWaterResistant = isWaterResistant;
        this.weight = weight;
    }

    public void showDetails() {
        System.out.println("Bluetooth Version: " + version);
        System.out.println("Range: " + range);
        System.out.println("Frequency: " + frequency);
        System.out.println("Device Name: " + deviceName);
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Water Resistant: " + isWaterResistant);
        System.out.println("Weight: " + weight + " g");
    }
}

class BrandCloths {
    static String brand;
    static String material;
    static String style;

    String itemName;
    String size;
    String color;
    double price;

    static {
        brand = "Nike";
        material = "Cotton";
        style = "Casual";
    }

    public BrandCloths(String itemName, String size, String color, double price) {
        this.itemName = itemName;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Style: " + style);
        System.out.println("Item Name: " + itemName);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }
}

class Fridge {
    static String brandName;
    static String energyRating;
    static String coolingType;

    String modelNumber;
    int capacity;
    double height;
    boolean hasFreezer;

    static {
        brandName = "LG";
        energyRating = "5 Star";
        coolingType = "Frost Free";
    }

    public Fridge(String modelNumber, int capacity, double height, boolean hasFreezer) {
        this.modelNumber = modelNumber;
        this.capacity = capacity;
        this.height = height;
        this.hasFreezer = hasFreezer;
    }

    public void getFridge() {
        System.out.println("Brand: " + brandName);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Height: " + height + " cm");
        System.out.println("Has Freezer: " + hasFreezer);
    }
}

class Payment {
    static String paymentMethod;
    static String transactionType;
    static String currency;

    String receiver;
    double amount;
    String date;
    boolean isCompleted;

    static {
        paymentMethod = "Credit Card";
        transactionType = "Online";
        currency = "USD";
    }

    public Payment(String receiver, double amount, String date, boolean isCompleted) {
        this.receiver = receiver;
        this.amount = amount;
        this.date = date;
        this.isCompleted = isCompleted;
    }

    public void transactionDetails() {
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Currency: " + currency);
        System.out.println("Receiver: " + receiver);
        System.out.println("Amount: $" + amount);
        System.out.println("Date: " + date);
        System.out.println("Transaction Completed: " + isCompleted);
    }
}
public class StaticRunner {
    public static void main(String[] args) {

        Food food1 = new Food("Idli", 400, 120.99, true);
        Food food2 = new Food("Chicken", 600, 95.99, false);
        Food food3 = new Food("Rasam", 150, 70.99, true);
        Food food4 = new Food("Fish Curry", 800, 150.99, false);
        Food food5 = new Food("Pulav", 300, 50.99, true);

        Bluetooth bluetooth1 = new Bluetooth("Headset", 12, true, 150.0f);
        Bluetooth bluetooth2 = new Bluetooth("Speaker", 8, false, 200.0f);
        Bluetooth bluetooth3 = new Bluetooth("Mouse", 24, true, 100.0f);
        Bluetooth bluetooth4 = new Bluetooth("Keyboard", 30, false, 300.0f);
        Bluetooth bluetooth5 = new Bluetooth("Smartwatch", 48, true, 75.0f);

        BrandCloths cloth1 = new BrandCloths("T-Shirt", "M", "Black", 19.99);
        BrandCloths cloth2 = new BrandCloths("Jacket", "L", "Blue", 59.99);
        BrandCloths cloth3 = new BrandCloths("Jeans", "M", "Green", 39.99);
        BrandCloths cloth4 = new BrandCloths("Sweater", "L", "Red", 49.99);
        BrandCloths cloth5 = new BrandCloths("Cap", "One Size", "White", 14.99);

        Fridge fridge1 = new Fridge("LG123", 250, 175.5, true);
        Fridge fridge2 = new Fridge("Samsung456", 300, 185.0, true);
        Fridge fridge3 = new Fridge("Whirlpool789", 200, 160.0, false);
        Fridge fridge4 = new Fridge("Bosch012", 350, 190.0, true);
        Fridge fridge5 = new Fridge("Haier345", 280, 170.0, false);

        Payment payment1 = new Payment("Priya Hegde", 1200.00, "2024-10-10", true);
        Payment payment2 = new Payment("Priyanka M", 850.50, "2024-10-11", false);
        Payment payment3 = new Payment("C Chaitanya", 400.25, "2024-10-12", true);
        Payment payment4 = new Payment("Vishnavi", 950.75, "2024-10-13", false);
        Payment payment5 = new Payment("Bharathi Patgar", 300.00, "2024-10-14", true);

        food1.displayInfo();
        food2.displayInfo();
        food3.displayInfo();
        food4.displayInfo();
        food5.displayInfo();

        System.out.println("*****************************************************");

        bluetooth1.showDetails();
        bluetooth2.showDetails();
        bluetooth3.showDetails();
        bluetooth4.showDetails();
        bluetooth5.showDetails();

        System.out.println("*****************************************************");

        cloth1.printDetails();
        cloth2.printDetails();
        cloth3.printDetails();
        cloth4.printDetails();
        cloth5.printDetails();

        System.out.println("*****************************************************");

        fridge1.getFridge();
        fridge2.getFridge();
        fridge3.getFridge();
        fridge4.getFridge();
        fridge5.getFridge();

        System.out.println("*****************************************************");


        payment1.transactionDetails();
        payment2.transactionDetails();
        payment3.transactionDetails();
        payment4.transactionDetails();
        payment5.transactionDetails();
    }
}
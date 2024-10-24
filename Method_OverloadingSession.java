// Source code is decompiled from a .class file using FernFlower decompiler.
public class Method_OverloadingSession {
   public Method_OverloadingSession() {
   }

   public static void main(String[] var0) {
      displayFoodDetails("Chocolate Cake");
      displayFoodDetails("Vanilla Cake", 500);
      displayFoodDetails("Strawberry Pastry", 300, "Warrior bakery");
      addFoodInventory("Chocolate Cake", 600);
      addFoodInventory("Chocolate Cake", 600, 10);
      addFoodInventory(350.0, 20);
      addFoodInventory(350.5, 25);
      processOrder("Priya", 1000);
      processOrder("Priya", "Chocolate Cake", 1000);
      processOrder("Priya", "Pastry", 1200, "Takeaway");
      processOrder(1200, "Priya");
      int[] var10001 = new int[]{1500, 800, 450, 1200, 600};
      System.out.println("Total food bill: " + calculateTotalBill(var10001));
   }

   public static void displayFoodDetails(String var0) {
      System.out.println("Food Item: " + var0);
   }

   public static void displayFoodDetails(String var0, int var1) {
      System.out.println("Food Item: " + var0 + ", Price: Rs. " + var1);
   }

   public static void displayFoodDetails(String var0, int var1, String var2) {
      System.out.println("Food Item: " + var0 + ", Price: Rs. " + var1 + ", Bakery: " + var2);
   }

   public static void addFoodInventory(String var0, int var1) {
      System.out.println("Food Item: " + var0 + ", Price: Rs. " + var1);
   }

   public static void addFoodInventory(String var0, int var1, int var2) {
      System.out.println("Food Item: " + var0 + ", Price: Rs. " + var1 + ", Quantity: " + var2);
   }

   public static void addFoodInventory(double var0, int var2) {
      System.out.println("Price per unit: Rs. " + var0 + ", Quantity: " + var2);
   }

   public static void processOrder(String var0, int var1) {
      System.out.println("Customer: " + var0 + ", Order Amount: Rs. " + var1);
   }

   public static void processOrder(String var0, String var1, int var2) {
      System.out.println("Customer: " + var0 + ", Ordered: " + var1 + ", Order Amount: Rs. " + var2);
   }

   public static void processOrder(String var0, String var1, int var2, String var3) {
      System.out.println("Customer: " + var0 + ", Ordered: " + var1 + ", Order Amount: Rs. " + var2 + ", Order Type: " + var3);
   }

   public static void processOrder(int var0, String var1) {
      System.out.println("Order Amount: Rs. " + var0 + ", Customer: " + var1);
   }

   public static int calculateTotalBill(int... var0) {
      int var1 = 0;
      int[] var2 = var0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2[var4];
         var1 += var5;
      }

      return var1;
   }
}

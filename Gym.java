// Source code is decompiled from a .class file using FernFlower decompiler.
public class Gym {
   String gymName;
   int numberOfEquipments;
   String location;
   double membershipFee;

   public Gym() {
      System.out.println("No parameterized constructor");
   }

   public Gym(String var1, int var2, String var3, double var4) {
      this.gymName = var1;
      this.numberOfEquipments = var2;
      this.location = var3;
      this.membershipFee = var4;
   }

   public static void enrollMember() {
   }

   public static void addEquipment() {
   }

   public static void scheduleWorkout() {
   }

   public void gymDetails() {
      System.out.println("Gym Name: " + this.gymName);
      System.out.println("Number of Equipments: " + this.numberOfEquipments);
      System.out.println("Location: " + this.location);
      System.out.println("Membership Fee: " + this.membershipFee);
   }
}

// Source code is decompiled from a .class file using FernFlower decompiler.
public class GymContainer {
   public GymContainer() {
   }

   public static void main(String[] var0) {
      Gym var1 = new Gym();
      var1.gymName = "Downtown Fitness";
      var1.numberOfEquipments = 50;
      var1.location = "Downtown";
      var1.membershipFee = 500.0;
      System.out.println("Gym Name: " + var1.gymName);
      System.out.println("Number Of Equipments In Gym: " + var1.numberOfEquipments);
      System.out.println("Location of the Gym: " + var1.location);
      System.out.println("Gym Membership Fees: " + var1.membershipFee);
      System.out.println("---------------------------------------------------------");
      Gym var2 = new Gym();
      var2.gymName = "University Gym";
      var2.numberOfEquipments = 100;
      var2.location = "Electronic City";
      var2.membershipFee = 1200.0;
      System.out.println("Gym Name: " + var2.gymName);
      System.out.println("Number Of Equipments In Gym: " + var2.numberOfEquipments);
      System.out.println("Location of the Gym: " + var2.location);
      System.out.println("Gym Membership Fees: " + var2.membershipFee);
      System.out.println("---------------------------------------------------------");
      Gym var3 = new Gym();
      var3.gymName = "Regional Fitness Center";
      var3.numberOfEquipments = 75;
      var3.location = "Hyderabad";
      var3.membershipFee = 1750.5;
      System.out.println("Gym Name: " + var3.gymName);
      System.out.println("Number Of Equipments In Gym: " + var3.numberOfEquipments);
      System.out.println("Location of the Gym: " + var3.location);
      System.out.println("Gym Membership Fees: " + var3.membershipFee);
      System.out.println("---------------------------------------------------------");
      Gym var4 = new Gym("State Central Gym", 80, "Bangaluru", 100.0);
      Gym var5 = new Gym("Delhi Public Gym", 75, "Delhi", 150.0);
      Gym var6 = new Gym("City Fitness, Mysuru", 40, "Mysore", 300.0);
      Gym var7 = new Gym("Community Gym", 46, "Canada", 1050.0);
      Gym var8 = new Gym("District Central Gym", 90, "Shivamogga", 1005.0);
      Gym var9 = new Gym("British Fitness Club", 100, "Pune", 4500.0);
      Gym var10 = new Gym("Asiatic Society of Mumbai Gym", 120, "Mumbai", 180.0);
      var4.gymDetails();
      var5.gymDetails();
      var6.gymDetails();
      var7.gymDetails();
      var8.gymDetails();
      var9.gymDetails();
      var10.gymDetails();
   }
}

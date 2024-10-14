public class Gym {
    String gymName;
    int numberOfEquipments;
    String location;
    double membershipFee;

    public Gym() {
        System.out.println("No parameterized constructor");
    }

    public Gym(String gymName, int numberOfEquipments, String location, double membershipFee) {
        this.gymName = gymName;
        this.numberOfEquipments = numberOfEquipments;
        this.location = location;
        this.membershipFee = membershipFee;
    }

    public static void enrollMember() {
       
    }

    public static void addEquipment() {
      
    }

    public static void scheduleWorkout() {
       
    }

    public void gymDetails() {
        System.out.println("Gym Name: " + gymName);
        System.out.println("Number of Equipments: " + numberOfEquipments);
        System.out.println("Location: " + location);
        System.out.println("Membership Fee: " + membershipFee);
    }
}

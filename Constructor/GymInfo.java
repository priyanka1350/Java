public class GymInfo {
    public static void main(String[] args) {

        Gym gym = new Gym();
        gym.gymName = "Downtown Fitness";
        gym.numberOfEquipments = 50;
        gym.location = "Downtown";
        gym.membershipFee = 500.00;

        System.out.println("Gym Name: " + gym.gymName);
        System.out.println("Number Of Equipments In Gym: " + gym.numberOfEquipments);
        System.out.println("Location of the Gym: " + gym.location);
        System.out.println("Gym Membership Fees: " + gym.membershipFee);
        System.out.println("---------------------------------------------------------");

        Gym gym1 = new Gym();
        gym1.gymName = "University Gym";
        gym1.numberOfEquipments = 100;
        gym1.location = "Electronic City";
        gym1.membershipFee = 1200.00;

        System.out.println("Gym Name: " + gym1.gymName);
        System.out.println("Number Of Equipments In Gym: " + gym1.numberOfEquipments);
        System.out.println("Location of the Gym: " + gym1.location);
        System.out.println("Gym Membership Fees: " + gym1.membershipFee);
        System.out.println("---------------------------------------------------------");

        Gym gym2 = new Gym();
        gym2.gymName = "Regional Fitness Center";
        gym2.numberOfEquipments = 75;
        gym2.location = "Hyderabad";
        gym2.membershipFee = 1750.50;

        System.out.println("Gym Name: " + gym2.gymName);
        System.out.println("Number Of Equipments In Gym: " + gym2.numberOfEquipments);
        System.out.println("Location of the Gym: " + gym2.location);
        System.out.println("Gym Membership Fees: " + gym2.membershipFee);
        System.out.println("---------------------------------------------------------");

        Gym gym3 = new Gym("State Central Gym", 80, "Bangaluru", 100.0);
        Gym gym4 = new Gym("Delhi Public Gym", 75, "Delhi", 150.0);
        Gym gym5 = new Gym("City Fitness, Mysuru", 40, "Mysore", 300.0);
        Gym gym6 = new Gym("Community Gym", 46, "Canada", 1050.0);
        Gym gym7 = new Gym("District Central Gym", 90, "Shivamogga", 1005.0);
        Gym gym8 = new Gym("British Fitness Club", 100, "Pune", 4500.0);
        Gym gym9 = new Gym("Asiatic Society of Mumbai Gym", 120, "Mumbai", 180.0);

        gym3.gymDetails();
        gym4.gymDetails();
        gym5.gymDetails();
        gym6.gymDetails();
        gym7.gymDetails();
        gym8.gymDetails();
        gym9.gymDetails();
    }
}

 class Car extends Vehical{  

    int numberOfDoors;
    String fuelType;
    int speed;

    public void displayCarDetails() {
        System.out.println("Car brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);   }  
}

class ElectricCar extends Car {  

    int BatteryCapacity;

    public void displayElectricCarDetails() {
        System.out.println("Electric Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Doors: " + numberOfDoors);
        System.out.println("Battery Capacity: " + BatteryCapacity + " kWh");
        
            }  
}  

class Bike extends Vehical{
  
    String type;


    public void displayBikeDetails() {
        System.out.println("Bike brand: " + brand);
        System.out.println("Color: " + color);
        
        System.out.println("Type: " + type);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.color = "Red";
        car.speed = 120;
        car.numberOfDoors = 4;
        car.fuelType = "Petrol";
        
        car.displayCarDetails();  
        System.out.println();
 
        //  Multilevel Inheritance with ElectricCar
        ElectricCar tesla = new ElectricCar();
        tesla.brand = "Tesla";
        tesla.color = "White";
        tesla.speed = 150;
        tesla.numberOfDoors = 4;
        
        tesla.BatteryCapacity = 75;
       
        tesla.displayElectricCarDetails();
        System.out.println();

        // Hierarchical Inheritance with Bike
        Bike bike = new Bike();
        bike.brand = "Harley Davidson";
        bike.color = "Black";
     
        bike.type = "Cruiser";

        System.out.println("Bike Details:");
        
        bike.displayBikeDetails();

    }
}

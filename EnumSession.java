public class EnumSession {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    enum Signal {
        RED, GREEN, ORANGE
    }

    enum Gender {
        MALE, FEMALE, OTHERS
    }

    enum PizzaSize {
        SMALL, MEDIUM, LARGE, EXTRA_LARGE
    }

    enum RainbowColor {
        RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
    }

    enum Planet {
        MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE
    }

    enum Switch {
        ON, OFF, NUTRAL
    }

    enum CoffeeSize {
        SMALL, MEDIUM, LARGE
    }

    public static void main(String[] args) {

        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);

        Direction direction = Direction.EAST;
        System.out.println("Our Direction is: " + direction);

        Season thisSeason = Season.SUMMER;
        System.out.println("Current season is: " + thisSeason);

        Signal traffic = Signal.RED;
        System.out.println("Traffic Signal  is: " + traffic);

        Gender gender = Gender.MALE;
        System.out.println("Gender is: " + gender);

        PizzaSize pizzaOrder = PizzaSize.LARGE;
        System.out.println("Pizza size ordered: " + pizzaOrder);

        RainbowColor colors = RainbowColor.VIOLET;
        System.out.println("Rain Bow Color: " + colors);

        Planet favoritePlanet = Planet.EARTH;
        System.out.println("Favorite planet is: " + favoritePlanet);

        Switch offOn = Switch.ON;
        System.out.println("Please Switch: " + offOn);

        CoffeeSize coffee = CoffeeSize.MEDIUM;
        System.out.println("Coffee size: " + coffee);
    }
}
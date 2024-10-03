public class ReturnTypeSession {

    // Returns an integer 
    public static int getInt() {
        return 10;
    }

    //  Returns a double 
    public static double getDouble() {
        return 20.5;
    }

    // Returns a boolean 
    public static boolean getBoolean() {
        return true;
    }

    //  Returns a char 
    public static char getChar() {
        return 'J';
    }

    //  Returns a String
    public static String getString() {
        return "Java Programming";
    }

    // Returns a long
    public static long getLong() {
        return 100000L;
    }

    //  Returns a float 
    public static float getFloat() {
        return 9.99f;
    }

    //  Returns a short 
    public static short getShort() {
        return 1000;
    }

    public static void main(String[] args) {
        


        System.out.println("Integer: " + ReturnTypeSession.getInt());
        System.out.println("Double: " + ReturnTypeSession.getDouble());
        System.out.println("Boolean: " + ReturnTypeSession.getBoolean());
        System.out.println("Char: " + ReturnTypeSession.getChar());
        System.out.println("String: " + ReturnTypeSession.getString());
        System.out.println("Long: " + ReturnTypeSession.getLong());
        System.out.println("Float: " + ReturnTypeSession.getFloat());
        System.out.println("Short: " + ReturnTypeSession.getShort());
    }
}

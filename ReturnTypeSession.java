// Source code is decompiled from a .class file using FernFlower decompiler.
public class ReturnTypeSession {
   public ReturnTypeSession() {
   }

   public static int getInt() {
      return 10;
   }

   public static double getDouble() {
      return 20.5;
   }

   public static boolean getBoolean() {
      return true;
   }

   public static char getChar() {
      return 'J';
   }

   public static String getString() {
      return "Java Programming";
   }

   public static long getLong() {
      return 100000L;
   }

   public static float getFloat() {
      return 9.99F;
   }

   public static short getShort() {
      return 1000;
   }

   public static void main(String[] var0) {
      System.out.println("Integer: " + getInt());
      System.out.println("Double: " + getDouble());
      System.out.println("Boolean: " + getBoolean());
      System.out.println("Char: " + getChar());
      System.out.println("String: " + getString());
      System.out.println("Long: " + getLong());
      System.out.println("Float: " + getFloat());
      System.out.println("Short: " + getShort());
   }
}

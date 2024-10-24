public class ArraySession {
    public static void main(String[] args) {

        byte[] byteValues = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Byte values:");
        for (int i = 0; i < byteValues.length; i++) {
            System.out.println(byteValues[i]);
        }

        short[] shortValues = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println("Short values:");
        for (int i = 0; i < shortValues.length; i++) {
            System.out.println(shortValues[i]);
        }

        int[] intValues = { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 };
        System.out.println("Int values:");
        for (int i = 0; i < intValues.length; i++) {
            System.out.println(intValues[i]);
        }

        long[] longValues = { 313, 323, 333, 343, 353, 363, 373, 383, 393, 404 };
        System.out.println("Long values:");
        for (int i = 0; i < longValues.length; i++) {
            System.out.println(longValues[i]);
        }

        float[] floatValues = { 41.0f, 42.0f, 43.0f, 44.0f, 45.0f, 46.0f, 47.0f, 48.0f, 49.0f, 50.0f };
        System.out.println("Float values:");
        for (int i = 0; i < floatValues.length; i++) {
            System.out.println(floatValues[i]);
        }

        double[] doubleValues = { 51.0, 52.0, 53.0, 54.0, 55.0, 56.0, 57.0, 58.0, 59.0, 60.0 };
        System.out.println("Double values:");
        for (int i = 0; i < doubleValues.length; i++) {
            System.out.println(doubleValues[i]);
        }

        char[] charValues = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
        System.out.println("Char values:");
        for (int i = 0; i < charValues.length; i++) {
            System.out.println(charValues[i]);
        }

        boolean[] booleanValues = { true, false, true, false, true, false, true, false, true, false };
        System.out.println("Boolean values:");
        for (int i = 0; i < booleanValues.length; i++) {
            System.out.println(booleanValues[i]);
        }

        // 1. right to Left
        // 2. from Middle to right
        // 3. from middle to left
        // 4. skipping 1 index

        int[] intCount = { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 };
        System.out.println("Right to Left Values:");
        for (int i = intCount.length - 1; i >= 0; i--) {
            System.out.println(intCount[i]);
        }

        char[] charCount = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
        System.out.println("Middle to Right Values:");
        for (int i = 5; i < charCount.length; i++) {
            System.out.println(charCount[i]);
        }

        float[] floatCount = { 41.0f, 42.0f, 43.0f, 44.0f, 45.0f, 46.0f, 47.0f, 48.0f, 49.0f, 50.0f };
        System.out.println("Middle to left values:");
        for (int i = floatCount.length - 5; i >= 0; i--) {
            System.out.println(floatCount[i]);
        }

        short[] shortCount = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println("Skip One value:");
        for (int i = 0; i < shortCount.length; i = i + 2) {
            System.out.println(shortCount[i]);
        }

    }

}
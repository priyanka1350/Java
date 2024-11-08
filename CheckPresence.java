
// write a program to check X is present in array A
// EX: array:[2,3,4,5,6]
// X:4 output: YES



public class CheckPresence {
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 5, 6};
        int X = 4;
        
        boolean found = false;
        for (int num : A) {
            if (num == X) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "YES" : "NO");
    }
}



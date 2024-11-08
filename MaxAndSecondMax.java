// write a code that accepts sets of three numbers and print the maximum number among the three, 
// and prints the second maximum number among the three

public class MaxAndSecondMax {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;  

        int max = Math.max(a, Math.max(b, c));
        int secondMax = a == max ? Math.max(b, c) : (b == max ? Math.max(a, c) : Math.max(a, b));

        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + secondMax);
    }
}

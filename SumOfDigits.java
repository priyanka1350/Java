// 7.you are given an integer N. write a code to calculate the sum of all the digits of N
public class SumOfDigits {
    public static void main(String[] args) {
        int N = 123456789;  
        int sum = 0;
        for (; N != 0; N /= 10) sum += N % 10;
        System.out.println("Sum of digits: " + sum);
    }
}

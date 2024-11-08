//3.You are given an array A of N integers, find the maximum sum of two distinct integers in the array
// Note: it is guaranteed that there exist at least 2 distinct integers in the array


import java.util.Arrays;

public class MaxSumOfTwoDistinct {
    public static void main(String[] args) {
        int[] A = {3, 5, 1, 7, 9, 8};
        Arrays.sort(A);
        int maxSum = A[A.length - 1] + A[A.length - 2]; 
        System.out.println(maxSum);
    }
}

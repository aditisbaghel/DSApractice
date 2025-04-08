package DSA1.Arrays.sumofallsubarrays;
//Total number of subarrays of length K
public class SumOfAllSubarrays5 {
    public static void main(String[] args) {
        int k=10;
        int arr[] = {1,2,3,4};
        int res =noOfSubArray(arr,k);
        System.out.println("The number of sub-arrays can be formed = "+res);
    }

    private static int noOfSubArray(int[] arr, int k) {
        return (arr.length-k+1);
    }
}

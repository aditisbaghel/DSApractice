package DSA1.Arrays.sumofallsubarrays;
//Maximum subarray sum with length K  Optimized Approach using Sliding Window TC- O(N) , SC- O(1)
public class SumOfAllSubarrays9 {
    public static void main(String[] args) {
        int k=2;
        int[] arr = {1,2,3,4};
        maxSum(arr, k);
    }
    public static void maxSum(int[] arr, int k){
        int maxSum, n=arr.length;
        if (k > n) {
            System.out.println("Window size k is greater than array length");
            return;
        }
        int temp=0;
        for(int i =0; i<k; i++){
            temp+=arr[i];
        }
            maxSum=temp;
        int start = 1;
        for(int i=k; i<=n-1;i++){
            temp+=arr[i]-arr[start-1];
            start++;
            if(temp>maxSum)
                maxSum=temp;
        }
        System.out.println("Max sum is :: "+maxSum);
    }
}


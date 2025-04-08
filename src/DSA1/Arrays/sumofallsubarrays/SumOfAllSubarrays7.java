package DSA1.Arrays.sumofallsubarrays;
//Maximum subarray sum with length K TC-O(N²), SC-O(1)
public class SumOfAllSubarrays7 {
    public static void main(String[] args) {
       int k=2;
       int[] arr = {1,2,3,4};
        maxSum(arr, k);
    }
public static void maxSum(int[] arr, int k){
    int maxSum=Integer.MIN_VALUE, n=arr.length;
    int start = 0, end = k-1;
    while(end<n){
        int sum=0;
        for(int i=start; i<=end;i++){
            sum+=arr[i];
        }
        if(sum>maxSum)
            maxSum=sum;
        start++;
        end++;
    }
System.out.println("Max sum is :: "+maxSum);
}
}

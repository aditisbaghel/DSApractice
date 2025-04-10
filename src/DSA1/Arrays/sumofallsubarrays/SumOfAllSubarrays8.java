package DSA1.Arrays.sumofallsubarrays;
//Maximum subarray sum with length K Optimized Approach using Prefix Sum Array TC-O(N), SC-O(N)
public class SumOfAllSubarrays8 {
    public static void main(String[] args) {
        int k=2;
        int[] arr = {1,2,3,4};
        maxSum(arr, k);
    }
    public static void maxSum(int[] arr, int k){
        int maxSum=Integer.MIN_VALUE, n=arr.length;
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        for(int i =1; i<arr.length; i++){
            temp[i]=temp[i-1]+arr[i];
        }
        int start = 0, sum = 0;
            for(int i=start; i<=n-k;i++){
                if(i==0)
                    sum=temp[k-1];
                else
                sum=temp[k+i-1]-temp[i-1];
                if(sum>maxSum)
                    maxSum=sum;
            }


        System.out.println("Max sum is :: "+maxSum);
    }
}


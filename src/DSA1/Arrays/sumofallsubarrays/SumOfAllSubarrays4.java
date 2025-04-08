package DSA1.Arrays.sumofallsubarrays;
//Find sum of all Subarrays sums  Optimized Solution Contribution Technique TC- O(N) SC- O(1)
public class SumOfAllSubarrays4 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        System.out.println(totalSubArraySum(a));
    }

    private static int totalSubArraySum(int[] a) {
        int ans =0,count=0,n=a.length;
        for(int i =0; i<n; i++){
                count = (i+1)*(n-i);
                count = count*a[i];
                ans+=count;

        }
        return ans;
    }

}

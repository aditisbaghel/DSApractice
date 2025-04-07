package DSA1.Arrays.sumofallsubarrays;


//More Optimized Solution Carry Forward; TC-O(N²), SC-O(1)
public class SumOfAllSubarrays3 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        System.out.println(totalSubArraySum(a));
    }

    private static int totalSubArraySum(int[] a) {
        int ans =0;
        for(int i =0; i<a.length; i++){
            int sum=0;
            for(int j=i; j<a.length; j++){
                    sum+=a[j];
                    ans+=sum;
            }

        }
        return ans;
    }
}
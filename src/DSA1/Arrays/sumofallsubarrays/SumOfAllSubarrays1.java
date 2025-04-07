package DSA1.Arrays.sumofallsubarrays;

//Brute force approach TC-O(N³), SC-O(1)
public class SumOfAllSubarrays1 {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        System.out.println(totalSubArraySum(a));
    }

    private static int totalSubArraySum(int[] a) {
        int ans =0;
        for(int i =0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=a[k];
                }
                ans+=sum;
            }
        }
        return ans;
    }
}

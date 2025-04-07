package DSA1.Arrays.sumofallsubarrays;

//Optimized Solution Prefix Sum; TC-O(N²), SC-O(N)
public class SumOfAllSubarrays2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        System.out.println(totalSubArraySum(a));
    }

    private static int totalSubArraySum(int[] a) {
        int ans =0;
        int[] temp = new int[a.length];
        temp[0] = a[0];
        for(int i =1; i<a.length; i++){
            temp[i]=temp[i-1]+a[i];
        }
        for(int i =0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                int sum=0;
                if(i==0){
                    sum=temp[j];
                }
                else{
                    sum=temp[j]-temp[i-1];
                }
                ans+=sum;
            }
        }
        return ans;
    }
}

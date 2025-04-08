package DSA1.Arrays.sumofallsubarrays;
//Given an array, print start and end indices of subarrays of length K.
public class SumOfAllSubarrays6 {
    public static void main(String[] args) {
        int k=2;
        int arr[] = {1,2,3,4};
        SumOfAllSubarrays6 sub = new SumOfAllSubarrays6();
        sub.printAllSubarrayIndices(arr,k);
    }

    private void printAllSubarrayIndices(int[] arr, int k) {
        int start=0, end=k-1, n = arr.length;
        while(end< n){
            System.out.println(start +" "+end);
            start++;
            end++;
        }
    }


}

package Binary_Search;
//https://leetcode.com/problems/split-array-largest-sum/
public class leetcodeQ7 {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(arr, m));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); //this will give us the max value in the array
            end += nums[i]; //this will give us the total value of the array
        }

        while(start < end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}

package Linear_Search;
// https://leetcode.com/problems/richest-customer-wealth/
public class leetcodeQ2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1,4}};
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int sum = 0;
            for (int element : person) {
                sum += element;
            }
            if(ans < sum){
                ans = sum;
            }
        }
        return ans;
    }
}

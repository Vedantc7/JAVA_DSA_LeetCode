package Linear_Search;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class leetcodeQ1 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        // System.out.println(digits2(-249443));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }return count;
    }

    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
    }

    static boolean even(int count){
        int numberOfDigits = digits1(count);
        
        return numberOfDigits % 2 == 0;
    }

    static int digits1(int num){

        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            num = 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}

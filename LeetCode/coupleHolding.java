package LeetCode;

public class coupleHolding {
    public static void main(String[] args) {
        int[] row = {0,2,1,3};
        System.out.println(minSwapsCouples(row));
    }

    static int minSwapsCouples(int[] arr) {
        int i = 0;
            while(i < arr.length){
                int correct = arr[i];
                if(arr[i] != arr[correct]){
                    return i;
                }
                else{
                    i++;
                }
            }
        return -1;
    }
}

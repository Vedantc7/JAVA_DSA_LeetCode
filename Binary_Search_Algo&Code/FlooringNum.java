package Binary_Search;

public class FlooringNum {
    public static void main(String[] args) {
        int[] arr = {-3, 0, 2, 5, 9, 14, 19, 25, 30};
        int target = -4;
        int ans = flooringBS(arr, target);
        System.out.println(ans);
    }
    static int flooringBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1 ;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            } 
        }
        return end;
    }
}

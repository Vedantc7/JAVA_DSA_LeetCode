package Binary_Search;

public class CeilingNum {
    public static void main(String[] args) {
        int[] arr = {-3, 0, 2, 5, 9, 14, 19, 25, 30};
        int target = 31;
        int ans = ceilingBS(arr, target);
        System.out.println(ans);
    }
    static int ceilingBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1 ;

        if(target > arr[end]){
            return -1;
        }

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
        return start;
    }
}

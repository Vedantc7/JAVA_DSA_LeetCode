package Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {-13, -9, -5, -2, 0, 3, 6, 8, 15, 19, 22, 39, 78};
        int[] arr = {99, 86, 73, 50, 39, 28, 19, 3, 0, -10};
        int target = 19;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            
        int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{   
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

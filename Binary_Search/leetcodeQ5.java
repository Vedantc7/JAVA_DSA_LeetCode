package Binary_Search;
// https://leetcode.com/problems/find-in-mountain-array/
public class leetcodeQ5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,1};
        int target = 4;
        System.out.println(findInMountainArray(target, arr));
    }
    static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }else {
           firstTry = orderAgnosticBS(mountainArr, target, peak, mountainArr.length - 1);
        }
        return firstTry;
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            
        int mid = start + (end - start) / 2;
        
        if(arr[mid] > arr[mid + 1]){
            end = mid;
        }
        else{
            start = mid + 1;
        }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){
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

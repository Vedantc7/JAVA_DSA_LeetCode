package Binary_Search;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class leetcodeQ3 {
    public static void main(String[] args) {
        int[] arr = {0,5,9,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
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
}


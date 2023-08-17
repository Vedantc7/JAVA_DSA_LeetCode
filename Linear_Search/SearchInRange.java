package Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] num ={11, 45, 36, -16, 20, -88, 1};
        int target = -16;
        System.out.println(search(num, target, 1, 4));
    }
    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}

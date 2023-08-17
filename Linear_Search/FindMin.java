package Linear_Search;

public class FindMin {
    public static void main(String[] args) {
        int[] array = {11, 45, 36, -16, 20, -88, 1};
        System.out.println(min(array));
    }

    //assume arr.length !=0
    //find the minimum value
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

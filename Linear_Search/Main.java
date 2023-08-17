package Linear_Search;

public class Main {
    public static void main(String[] args) {
    int[] array = {11, 45, 36, -16, 20, -88, 1};
    int number = 11;
    System.out.println(linearSearch(array, number));

    }

    //for returning boolean 
    static boolean linearSearch3(int[] arr, int target) {
        if(arr.length == 0){
            return false;
        }

        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (target == element){
                return true;
            }
        }
        return false;
    }

    //for returning element itself
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (target == element){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    //for returning the index at which element is found
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (target == element){
                return index;
            }
        }
        return -1;
    }
}
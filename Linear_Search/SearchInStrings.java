package Linear_Search;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "vedant";
        char word = 'o';
        System.out.println(search(name, word));
    }

    //boolean with for each
    static boolean search2(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (target == ch){
                return true;
            }
        }
        return false;
    }  

    //boolean search string with for loop
    static boolean search(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }  
}

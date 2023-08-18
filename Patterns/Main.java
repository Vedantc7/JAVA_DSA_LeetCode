package Patterns;

public class Main {
    public static void main(String[] args) {
        pattern5(9);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // static void pattern3(int n){
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = row; col <= n; col++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // static void pattern4(int n){
    //     int count = 0;
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row; col++) {
    //             count++;
    //             System.out.print(count + " ");
    //         }
    //         count = 0;
    //         System.out.println();
    //     }
    // }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        int mid = n/2 + 1;
        int count = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (col > mid){
                    count--;
                }
                else{
                    count++;
                    System.out.print(count);
                }
            }
            count = 0;
            System.out.println();
        }
    }
}
 
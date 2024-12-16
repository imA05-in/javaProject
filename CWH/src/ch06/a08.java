package ch06;

public class a08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 2, 1};
        int s = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    s = 1;
                } else {
                    s++;
                }
            }
        }
        if (s == 1) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }
}
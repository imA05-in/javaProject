package idk;
class operations {
        void add(int x, int... arr) {
            int res = x;
            for (int i : arr) {
                res = res + i;
            }
            System.out.println(res);
        }

        void sum(int... arr) {
            int result = 0;
//        for(int i =0; i< arr.length;i++){
//            result = result + arr[i];
//
//        }
            for (int i : arr) {
                result = result + i;
            }
            System.out.println(result);
        }

    }

public class varargs {
    public static void main(String[] args) {
        operations operations_obj1 = new operations();
        operations_obj1.sum(1, 2, 3, 4, 5, 6);
        operations_obj1.add(1);
    }
}

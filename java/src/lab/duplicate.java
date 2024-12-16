package lab;

public class duplicate {
    public static void main(String[] args) {
        int [] arr = {1,1,3,4,5,5,7};
        for(int i= 0;i<arr.length-1;i++){
            int n = arr[i];
            if(n==arr[i+1]){
                System.out.println(arr[i]);
            }
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[i]);
//                }
//            }
        }
    }
}

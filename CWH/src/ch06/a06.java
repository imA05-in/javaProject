package ch06;

public class a06 {
    public static void main(String[] args) {
            int [] arr ={1,7,2,3,4,5,9};
            int m = 0,mn = 0;
            for(int i= 0;i<arr.length;i++){
                int n = arr[i];
                for(int j =0 ;j<arr.length;j++){
                    if(arr[j]>arr[i]){
                        m = arr[j];
                    }
                }
                for(int j = 0;j<arr.length;j++){
                    if(arr[i]<arr[j]){
                        mn = arr[i];
                    }
                    else{
                        arr[i] = arr[j];
                    }
                }
            }
        System.out.println();
        System.out.println("max: " + m +
                            "\nmin: "+mn);
            
        }
    }


package Array;

import java.util.Arrays;

public class ArrayDemo13 {
    //ROTATE ARRAY TO THE RIGHT SIDE
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int num=3;
        for(int i=0;i<num;i++){
            int temp=arr[arr.length-1];
            for(int j= arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
            System.out.println(Arrays.toString(arr));
        }

    }
}

package Array;

import java.util.Arrays;

public class ArrayDemo14 {
    //ROTATE ARRAY TO THE LEFT SIDE
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int num=1;
        for(int i=0;i<num;i++){
            int temp=arr[0];
            for(int j=0;j< arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

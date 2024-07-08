package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,1,10,2,0};
        boolean status;
        for(int i=0;i< arr.length;i++){
            status=false;
            for (int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    status=true;
                }
            }
            if(status==false)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}

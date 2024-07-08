package Test;

import java.util.Arrays;

public class MainApp3 {
    public static void main(String[] args) {
        int[] arr1={0,2,1,0,1,2,0,0,2};
        int[] arr2={0,1,2};
        int[] output=new int[arr1.length];
        int k=0;
       for(int i=0;i< arr2.length;i++){
           for(int j=0;j< arr1.length;j++){
               if(arr1[j]==arr2[i]){
                   output[k++]=arr2[i];
               }
           }
       }
        System.out.println(Arrays.toString(output));
    }
}

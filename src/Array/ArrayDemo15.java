package Array;

import java.util.Arrays;

public class ArrayDemo15 {
    public static void main(String[] args) {
        int[] arr={0,1,2,2,1,0,1,0};
        int[] temp={0,1,2};
        int index=0;
        int[] output=new int[arr.length];
        System.out.println("BEFORE SORTING "+Arrays.toString(arr));

        for(int i=0;i<temp.length;i++){
          for(int j=0;j< arr.length;j++){
              if(temp[i]==arr[j]){
                  output[index]=temp[i];
                  index++;
              }
          }
        }
        System.out.println("AFTER SORTING "+Arrays.toString(output));

    }
}

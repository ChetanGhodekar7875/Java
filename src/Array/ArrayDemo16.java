package Array;

import java.util.Arrays;

public class ArrayDemo16 {
    //GIVEN TWO SORTED ARRAY NOW MERGE THE TWO ARRAY IN ASCENDING ORDER
    public static void main(String[] args) {
        int[] array=test();
        System.out.println(Arrays.toString(array));
    }
    public static int[] test(){
        int[] arr1={1,5,8,9};
        int[] arr2={2,4,7,10,11,12};
        //output  1 2 4 5 7 8 9 10 11 12
        int[] output=new int[arr1.length+ arr2.length];

        int i=0,j=0,k=0;
        for(;i< arr1.length && j< arr2.length;){
            if(arr1[i]<arr2[j]){
                output[k]=arr1[i];
                i++;
            }else {
                output[k]=arr2[j];
                j++;
            }
            k++;
        }
        for(;i< arr1.length;i++){
            output[k++]=arr1[i];
        }

        for(;j< arr2.length;j++){
            output[k++]=arr2[j];
        }
        return output;
    }
}

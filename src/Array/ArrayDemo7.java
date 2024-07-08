package Array;

public class ArrayDemo7 {
    //FIND OUT THE ARRAY ELEMENT WHOSE ADDITION IS 9
    public static void main(String[] args) {
        int[] arr={1,8,7,2,-1,9,5,10};
        int no=9;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==no){
                    System.out.print("{"+arr[i]+" , "+arr[j]+"}"+" ");
                }
            }
        }
    }
}

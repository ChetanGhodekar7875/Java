package Array;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] arr={2,5,1,3};
        int min=arr[0];
        for(int i=1;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("MINIMUM VALUE IS "+min);
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("MAXIMUM VALUE IS "+max);

        int sum=0;
        for(int i=min;i<=max;i++){
            sum=sum+i;
        }

        int arraySum=0;
        for(int i=0;i<arr.length;i++){
            arraySum=arraySum+arr[i];
        }

        System.out.println("MISING NUMBER IS "+(sum-arraySum));
    }
}

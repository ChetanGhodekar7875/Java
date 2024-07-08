package Array;

public class ArrayDemo10 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{1,2,3},{1,2,3,4,5}};
        System.out.println(arr.length);//3
        System.out.println(arr[0].length);//4
        System.out.println(arr[1].length);//3
        System.out.println(arr[2].length);//5

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

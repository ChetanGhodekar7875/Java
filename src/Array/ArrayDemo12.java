package Array;

public class ArrayDemo12 {
    //TRANSPOSE OF AN ARRAY
    public static void main(String[] args) {
        int[][] arr={{1,1,1},{2,2,2},{3,3,3}};

        int[][] output=new int[arr.length][arr[0].length];

        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                output[i][j]=arr[j][i];
            }
        }
        System.out.println("AFTER TRANSPOSE ");

        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package Array;

import java.util.Scanner;

public class ArrayDemo9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int row= scanner.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS");
        int col= scanner.nextInt();

        int[][] arr=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("ENTER ELEMENT");
                arr[i][j]= scanner.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

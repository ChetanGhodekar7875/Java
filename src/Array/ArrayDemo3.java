package Array;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER SIZE OF AN ARRAY");
        int size= scanner.nextInt();
        int[] array=new int[size];

        for(int i=0;i<=array.length;i++){
            System.out.println("ENTER "+(i+1)+" ELEMENT");
            array[i]= scanner.nextInt();
        }

        int evenIndexSum=0,oddIndexSum=0;

        for(int i=0;i<size;i++){
            if(i%2==0){
                evenIndexSum=evenIndexSum+array[i];
            }else {
                oddIndexSum=oddIndexSum+array[i];
            }
        }
        System.out.println("EVEN INDEX SUM IS"+evenIndexSum);
        System.out.println("ODD INDEX SUM IS "+oddIndexSum);
    }
}

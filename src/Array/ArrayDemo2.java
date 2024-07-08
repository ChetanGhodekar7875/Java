package Array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER SIZE OF AN ARRAY");
        int size= scanner.nextInt();
        int[] array=new int[size];

        for(int i=0;i<=array.length;i++){
            System.out.println("ENTER "+(i+1)+" ELEMENT");
            array[i]= scanner.nextInt();
        }

        System.out.println("ARRAY ELEMENTS ARE ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }

}

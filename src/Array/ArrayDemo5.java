package Array;

import java.util.Scanner;

public class ArrayDemo5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER SIZE OF FIRST ARRAY");
        int size1= scanner.nextInt();

        int[] array1=new int[size1];
        System.out.println("ENTER ELEMENTS OF FIRST ARRAY");
        for(int i=0;i<size1;i++){
            array1[i]= scanner.nextInt();
        }

        System.out.println("ENTER SIZE OF SECOND ARRAY");
        int size2= scanner.nextInt();

        int[] array2=new int[size2];
        System.out.println("ENTER ELEMENTS OF SECOND ARRAY");
        for(int i=0;i<size2;i++){
            array2[i]= scanner.nextInt();
        }

        System.out.println("ARRAY  1");
        for(int data:array1)
            System.out.print(data+" ");


        System.out.println("ARRAY  2");
        for(int data:array2)
            System.out.print(data+" ");

        int[] output=new int[size1+size2];

        for(int i=0;i< array1.length;i++){
            output[i]=array1[i];
        }

        for(int i=0;i< array2.length;i++){
            output[i+array1.length]=array2[i];
        }

        System.out.println("OUTPUT ARRAY IS ");
        for(int data:output)
            System.out.print(data+" ");

    }
}

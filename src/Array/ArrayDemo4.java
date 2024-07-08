package Array;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER SIZE OF AN ARRAY");
        int size= scanner.nextInt();

        int[] arr=new int[size];
        System.out.println("ENTER ELEMENTS OF AN ARRAY");
        for(int i=0;i<size;i++){
            arr[i]= scanner.nextInt();
        }

        int indexOfEven=0,indexOfOdd=0;

        for(int i=0;i<size;i++){
            if(arr[i]%2==0)
                indexOfEven++;
            else
                indexOfOdd++;
        }

        int[] evenArray=new int[indexOfEven];
        int[] oddArray=new int[indexOfOdd];

        int index1=0,index2=0;

        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                evenArray[index1]=arr[i];
                index1++;
            }else{
                oddArray[index2]=arr[i];
                index2++;
            }
        }
        System.out.println("EVEN ARRAY ELEMENTS ARE \n");
        for(int data:evenArray){
            System.out.print(data+" ");
        }

        System.out.println("\n");
        System.out.println("ODD ARRAY ELEMENTS ARE \n");
        for(int data:oddArray){
            System.out.print(data+" ");
        }
    }
}

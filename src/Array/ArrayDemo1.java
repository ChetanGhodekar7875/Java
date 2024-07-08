package Array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr=new int[5];

        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//0

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[2]=40;
        arr[4]=50;
        arr[4]=60;

        System.out.println("==============");
        System.out.println(arr);
        System.out.println(arr[1]);//20
        System.out.println(arr[4]);//60

        String[] strArray=new String[3];

        System.out.println(strArray[1]);//null

    }
}

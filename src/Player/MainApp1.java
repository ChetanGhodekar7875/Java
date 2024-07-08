package Player;

public class MainApp1 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        System.out.println(min);
    }
    public static void printArray(int[] arr,int index){

        if(index<arr.length){
            System.out.println(arr[index]);
            index++;
            printArray(arr,index);
        }
    }
}

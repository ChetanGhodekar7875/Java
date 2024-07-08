package Test;

public class StringRev {

    public static void main(String[] args) {
        String str="I LOVE INDIA";
        String[] arr=str.split(" ");
        System.out.println(revString(arr, arr.length-1,""));
    }
    public static String revString(String[] arr,int index,String revString){
        if(index>=0){
            revString=revString+arr[index]+" ";
            index--;
          return revString(arr,index,revString);
        }
        return revString;
    }
}

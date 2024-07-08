import java.util.Arrays;

public class MainApp {
    public static void main(String[] args){
        String arr[] = {"geek","for","geeks","a","portal","to","learn","can","be","computer", "science",
        "zoom","yup","fire","in","be","data","geeks"};
        System.out.println(test(arr));
    }
    private static String test(String[] arr){
        int[] temp=new int[arr.length];
        for(int i=0;i<temp.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equalsIgnoreCase(arr[j])){
                    count++;
                    temp[j]=-1;
                }
            }
            if(temp[i]==0)
                temp[i]=count;
        }

        int max=temp[0],index=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]>max){
                max=temp[i];
                index=i;
            }
        }
        return arr[index];
    }
}

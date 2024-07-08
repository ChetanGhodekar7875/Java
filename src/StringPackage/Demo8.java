package StringPackage;

public class Demo8 {
    public static void main(String[] args) {
        String str="abcd xyz pqr";
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        String str1="ABCD";
        char[] ch=str1.toCharArray();
        for(int i=0;i< ch.length;i++){
            System.out.println(ch[i]);
        }
    }
}

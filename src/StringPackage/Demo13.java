package StringPackage;

public class Demo13 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("ABC");
        String str1=sb1.toString();

        StringBuffer sb2=new StringBuffer("ABC");
        String str2= sb2.toString();

        System.out.println(sb1.equals(sb2));//false
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(sb1));//false
    }
}

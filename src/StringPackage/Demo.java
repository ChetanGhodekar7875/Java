package StringPackage;

public class Demo {
    public static void main(String[] args) {
        String str="ABC";
        String rev="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            rev=ch+rev;
        }

        if(str.equals(rev)){
            System.out.println("PALINDROME");
        }else {
            System.out.println("NOT A PALINDROME");
        }

    }
}

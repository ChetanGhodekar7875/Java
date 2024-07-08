package Test1;

public class Demo1 {
    public static void main(String[] args) {
       String str="AbAAcB";
       String temp="";
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(Character.isUpperCase(ch)){
               temp=temp+((str.charAt(i)+"").toLowerCase());
           }else {
               temp=temp+((str.charAt(i)+"").toUpperCase());
           }
       }
        System.out.println(temp);
    }
}

package StringPackage;

public class Demo6 {
    //CHARACTER WISE CONVERSION UPPERCASE TO LOWERCASE AND VICE-VERSA
    public static void main(String[] args) {
        String str="aBCd";//AbcD
        String temp="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                temp=temp+((ch+"").toUpperCase());
            }else {
                temp=temp+((ch+"").toLowerCase());
            }
        }
        System.out.println("GIVEN STRING "+str);
        System.out.println("OUTPUT STRING "+temp);


    }
}

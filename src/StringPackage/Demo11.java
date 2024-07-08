package StringPackage;

public class Demo11 {
    public static void main(String[] args) {
        String str="QSPIDERS";
        System.out.println(str);
        str=str.replace('S','$');
        System.out.println(str);
        str=str.replace("Q$PI","JSPI");
        System.out.println(str);
        str=str.replace("JSPI","");
        System.out.println(str);
    }
}

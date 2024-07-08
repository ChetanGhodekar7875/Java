package StringPackage;

public class Demo9 {
    public static void main(String[] args) {

        String str="QSPIDERS";
        String temp="";

        System.out.println(str.contains("PIDERS"));//true
        System.out.println(str.contains("JSPI"));//false
        System.out.println(str.contains("R"));//TRUE
        System.out.println(str.startsWith("QSP"));//true
        System.out.println(str.startsWith("JSPI"));//false
        System.out.println(str.endsWith("ERS"));//TRUE
        System.out.println(str.endsWith("."));//false
        System.out.println(str.isEmpty());//false
        System.out.println(temp.isEmpty());//true
    }
}

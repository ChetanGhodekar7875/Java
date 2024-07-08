package StringPackage;

public class Demo12 {
    public static void main(String[] args) {
        String str="Java";
        String temp="Java";
        //String str & temp both having same copy into the jvm memory
        System.out.println(str==temp);//true
        str=str.toUpperCase();
        //here new copy will be generated for str variable
        System.out.println(str==temp);//false

    }
}

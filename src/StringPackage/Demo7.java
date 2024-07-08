package StringPackage;

public class Demo7 {
    //FIND OUT EQUAL SUBSTRING OF STRING
	//"GOOD MORNING" no=3 -> GOOD MOR NING
    public static void main(String[] args) {
        String str="GOOD MORNING";
        int num=3;
        if(str.length()%num==0){
            int temp=str.length()/num;

            for(int i=0;i<str.length();i=i+temp){
                System.out.println(str.substring(i,i+temp));
            }
        }else {
            System.out.println("CANT DIVIDE INTO EQUAL PARTS");
        }
    }
}

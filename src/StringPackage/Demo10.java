package StringPackage;

public class Demo10 {
    //REVERSE THE STRING
    public static void main(String[] args) {
        String str="I LOVE INDIA";
        String[] temp=str.split(" ");
        String revString="";
        for(int i= temp.length-1;i>=0;i--){
            revString=revString+temp[i]+" ";
        }
        revString=revString.trim();
        System.out.println(str+"\t"+str.length());
        System.out.println(revString+"\t"+revString.length());
    }
}

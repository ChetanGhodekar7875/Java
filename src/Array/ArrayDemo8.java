package Array;

public class ArrayDemo8 {
    //OUTPUT AAABBBBBAA
    public static void main(String[] args) {
        char[] ch={'A','3','B','5','A','2'};
        for(int i=1;i< ch.length;i=i+2){
            char temp=ch[i];
            int num=temp-'0';
            for(int j=0;j<num;j++){
                System.out.print(ch[i-1]+" ");
            }
        }
    }
}

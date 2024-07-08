package Looping;

public class Demo11 {
    public static void main(String[] args) {
        int num=36,sum=0;
        int digit=0,temp=num,temp2=num;

        while (temp!=0){
            digit++;
            temp=temp/10;
        }

        while (temp2!=0){
            int rem=temp2%10;
            int cube=1;
            for(int i=1;i<=digit;i++){
                cube=cube*rem;
            }
            sum=sum+cube;
            temp2=temp2/10;
        }

        if(num==sum)
            System.out.println("ARMSTRONG NUMBER");
        else
            System.out.println("NOT A ARMSTRONG NUMBER");
    }
}

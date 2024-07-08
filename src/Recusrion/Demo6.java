package Recusrion;

public class Demo6 {
    public static void main(String[] args) {
        int space=4,col=2,row=5;
        int num=1;
        char ch='A';
        for(int i=1;i<=row;i++){
            int no=num;
            char c=ch;
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=col;j++){
                if(j<=i)
                System.out.print(no++);
                else
                    System.out.print(c++);
            }
            System.out.println();
            num++;
            ch++;
            col+=2;
            space--;
        }
    }
}

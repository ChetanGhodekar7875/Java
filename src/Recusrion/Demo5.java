package Recusrion;

public class Demo5 {
    public static void main(String[] args) {
        int row=5,col=1,space=4;
        for(int i=1;i<=row;i++){
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=col;j++){
                if((i+j)%2==0)
                System.out.print("*");
                else
                    System.out.print("#");
            }
            System.out.println();
            col+=2;
            space--;
        }
    }
}

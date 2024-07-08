package Recusrion;

public class Demo2 {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i==3 || j==3) {
                    if(j==3){
                        if(i<j)
                            System.out.print(j-i);
                        else
                            System.out.print(i-j);
                    } else if (i==3) {
                        if(i<j)
                            System.out.print(j-i);
                        else
                            System.out.print(i-j);
                    }
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

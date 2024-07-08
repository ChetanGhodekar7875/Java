package Recusrion;

public class Deom1 {
    public static void main(String[] args) {
        int row=5,col=1,space=4;
        int num=1,diff=5;
        for(int i=1;i<=row;i++){
            int temp=num,colDiff=diff;

            for(int k=1;k<=space;k++){
                System.out.print(" \t");
            }

            for(int j=1;j<=col;j++){
                System.out.print(temp+"\t");
                temp=temp-colDiff;
                colDiff++;
            }
            System.out.println();
            num=num+diff;
            diff--;
            col++;
            space--;
        }
    }
}

package Array;

public class ArrayDemo17 {
    //CHECK WEATHER THE MATRIX IS IDENTITY MATRIX OR NOT
    public static void main(String[] args) {
        int[][] arr={{1,0,0},{0,1,0},{0,0,1}};
        int row= arr.length;
        int col=arr[0].length;
        boolean status=true;
        if(row==col){
            for(int i=0;i< arr.length;i++){
                for(int j=0;j< arr[0].length;j++){
                    if(i==j && arr[i][j]!=1){
                        status=false;
                        break;
                    }
                    if(i!=j && arr[i][j]!=0){
                        status=false;
                        break;
                    }
                }

            }
            if(status)
                System.out.println("INDENTITY MATRIX");
            else
                System.out.println("NOT A INDENTITY MATRIX");
        }
    }
}

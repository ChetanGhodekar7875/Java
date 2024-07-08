package Blocks;

public class Master {
    Master(){
        System.out.println("CONSTRUCTOR");
    }

    static {
        System.out.println("static Block of Master class");
    }

    public static void main(String[] args) {
         {
             System.out.println("NON STATIC BLOCK");
        }
        Master m1=new Master();
    }


}

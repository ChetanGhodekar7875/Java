package Constructor;

public class Master {
    Master(){
    }
    Master(int a){
        System.out.println("A VALUE IS "+a);
    }
    Master(int b,int c){
        System.out.println("B VALUE IS "+b);
        System.out.println("C VALUE IS "+c);
    }
    Master(double d){
        System.out.println("D VALUE IS "+d);
    }
    void test(){
        System.out.println("TEST METHOD");
    }

    public static void main(String[] args) {
        Master m1=new Master();
        m1.test();
        Master m2=new Master(10);
        Master m3=new Master(40.0);
    }

}

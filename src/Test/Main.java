package Test;

public class Main implements Master{

    @Override
    public void test() {
        System.out.println("TEST METHOD");
    }


    public static void main(String[] args) {
        Main m1=new Main();
        m1.test();
    }
}

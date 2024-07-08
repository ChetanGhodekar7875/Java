package TicketBooking;

public class MainAppDemo {
    static int a=10;
    int b=20;
    public static void main(String[] args) {
        System.out.println("A VALUE IS "+a);
        MainAppDemo m1=new MainAppDemo();
        System.out.println("B VALUE IS "+m1.b);
        m1.test();
    }
    public void test(){
        System.out.println("A VALUE IS "+a);
        System.out.println("B VALUE IS "+b);
    }

}

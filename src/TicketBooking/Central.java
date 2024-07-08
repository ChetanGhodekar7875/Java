package TicketBooking;

public class Central {
    public static void central(){
        System.out.println("CENTRAL METHOD");
        System.out.println("A VALUE IS "+MainAppDemo.a);

        MainAppDemo md=new MainAppDemo();
        System.out.println("B VALUE IS "+md.b);
    }
    public void master(){
        System.out.println("MASTER METHOD");
        System.out.println("A VALUE IS "+MainAppDemo.a);
        MainAppDemo md=new MainAppDemo();
        System.out.println("B VALUE IS "+md.b);

    }
}

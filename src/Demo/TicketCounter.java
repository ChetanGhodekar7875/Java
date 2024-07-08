package Demo;

public class TicketCounter {
    static int availableTickets=100;
    static double perTicketsPrice=249.49;

    static int bookTickets=0;
    static boolean status=false;


    public static void bookTickets(int tickets) {
        if(availableTickets>=tickets){
            System.out.println("PAYABLE AMOUNT IS "+(tickets*perTicketsPrice));
            availableTickets=availableTickets-tickets;
            bookTickets=tickets;
            status=true;
        }else {
            System.out.println("ENTER VALID AMOUNT OF TICKETS");
        }
    }

    public static void displayTickets() {
        System.out.println("AVAILABLE TICKETS ARE "+availableTickets);
    }

    public static void cancelTickets(int cancelTickets) {
        if(status==true){
            if(bookTickets>=cancelTickets){
                System.out.println("TICKETS CANCEL SUCCESSFULLY");
                availableTickets=availableTickets+cancelTickets;
            }else {
                System.out.println("ENTER VALID NUMBER OF TICKETS");
            }
        }else {
            System.out.println("FIRST BOOK THE TICKETS");
        }
    }
}

package TicketBooking;

public class Ticket_Counter {
    static int availableTickets=100;
    static double perTicketPrice=249.00;

    public static void displayNumberOfTickets() {
        System.out.println("AVAILABLE NUMBER OF TICKETS ARE "+availableTickets);
    }

    public void bookTickets(int numberOfTickets) {
        if(numberOfTickets<=availableTickets){
            availableTickets=availableTickets-numberOfTickets;
            double payableAmount=numberOfTickets*perTicketPrice;

            System.out.println("PAYABLE AMOUNT IS "+payableAmount);
            System.out.println("AVAILABLE NUMBER OF TICKETS "+availableTickets);
        }else{
            System.out.println("ENTER VALID NUMBER OF TICKETS");
        }
    }
    public void cancelTickets(int numberOfTickets) {
        if(numberOfTickets<=availableTickets){
            System.out.println("TICKETS CANCEL SUCCESSFULLY");
        }else {
            System.out.println("ENTER VALID NUMBER OF TICKETS");
        }
    }
}

package TicketBooking;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        operations();
    }
    public static void operations(){
        Scanner scanner=new Scanner(System.in);

        Ticket_Counter tc=new Ticket_Counter();

        System.out.println("1. BOOK TICKETS");
        System.out.println("2. CANCEL TICKETS");
        System.out.println("3. AVAILABLE TICKETS");
        int numberOfTickets;
        int choice= scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("ENTER NUMBER OF TICKETS");
                numberOfTickets= scanner.nextInt();
                tc.bookTickets(numberOfTickets);
                break;
            case 2:
                System.out.println("ENTER NUMBER OF TICKETS");
                numberOfTickets= scanner.nextInt();
                tc.cancelTickets(numberOfTickets);
                break;
            case 3:
                Ticket_Counter.displayNumberOfTickets();
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }
    }
}

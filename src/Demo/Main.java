package Demo;

import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        operations();
    }
    static void operations(){
        System.out.println("1. BOOK TICKETS");
        System.out.println("2. CANCEL TICKETS");
        System.out.println("3. DISPLAY AVAILABLE TICKETS");
        System.out.println("4. EXIT");
        System.out.println("ENTER YOUR CHOICE");
        int choice= scanner.nextInt();
        if(choice==1){
            System.out.println("ENTER NUMBER OF TICKETS");
            int tickets= scanner.nextInt();
            TicketCounter.bookTickets(tickets);
            operations();
        }else if(choice==2){
            System.out.println("ENTER NUMBER OF TICKETS TO CANCEL");
            int cancelTickets= scanner.nextInt();
            TicketCounter.cancelTickets(cancelTickets);
            operations();

        }else if(choice==3){
            TicketCounter.displayTickets();
            operations();
        }else {
            System.out.println("THANK U FOR VISITING");
        }
    }
}

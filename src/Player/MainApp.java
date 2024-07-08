package Player;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean status=true;
        while (status) {
            System.out.println("1. ACCEPT DATA");
            System.out.println("2. DISPLAY DATA");
            System.out.println("3. DISPLAY MINIMUM RUN PLAYER");
            System.out.println("4. EXIT");
            System.out.println("ENTER YOUR CHOICE");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    PlayerOperations.acceptData();
                    break;
                case 2:
                    PlayerOperations.displayPlayerInfo();
                    break;
                case 3:
                    System.out.println("ENTER PLAYER TYPE");
                    String ptype= scanner.next();
                    PlayerOperations.minRuns(ptype);
                    PlayerOperations.minRuns(ptype);
                    break;
                case 4:
                    status=false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }
}

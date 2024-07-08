package Test1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean status=true;
       Player[] players=new Player[5];
       for(int i=0;i< players.length;i++){
           System.out.println("ENTER PLAYER ID");
           int playerId= scanner.nextInt();
           System.out.println("ENTER PLAYER NAME");
           scanner.nextLine();
           String playerName= scanner.nextLine();
           System.out.println("ENTER RUNS");
           int runs= scanner.nextInt();
           System.out.println("ENTER PLAYER TYPE");
           scanner.nextLine();
           String playerType= scanner.nextLine();
           System.out.println("ENTER MATCH TYPE");
           String matchType= scanner.nextLine();
           players[i]=new Player(playerId,playerName,runs,playerType,matchType);
           System.out.println("DATA ADDED");
       }
        System.out.println("1. Find Player With Lowest Runs");
        System.out.println("2. Find Player By Match Type");
        System.out.println("3. Exit");
        System.out.println("ENTER UR CHOICE");
        int choice= scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("ENTER PLAYER TYPE");
                String playerType= scanner.next();
                Player data= findPlayerWithLowestRuns(players,playerType);
                if(data!=null)
                    System.out.print(data.getPlayerId()+" "+data.getPlayerName()+" "+ data.getRuns()+" "+data.getPlayerType()+" "+data.getMatchType());
                else
                    System.out.println("PLAYER NOT FOUND");
                break;
            case 2:
                break;
            case 3:
                status=false;
                break;
            default:
                System.out.println("INVALID INPUTS");
        }
    }
    public static Player findPlayerWithLowestRuns(Player[] players,String pType){
        Player playerCurrentObject=null;
        int minRuns=Integer.MAX_VALUE;
        for(int i=0;i<players.length;i++){
            if(players[i].getPlayerType().equalsIgnoreCase(pType)){
                minRuns=players[i].getRuns();
            }
        }
        for(int i=0;i<players.length;i++){
            if(players[i].getPlayerType().equalsIgnoreCase(pType) && minRuns==players[i].getRuns()){
                playerCurrentObject=players[i];
            }
        }

        return playerCurrentObject;
    }
}

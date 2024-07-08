package Player;

import java.util.Scanner;

public class PlayerOperations {
    private static Player[] players=new Player[5];
    static  int i=0;
    private static Scanner sc=new Scanner(System.in);
    static void acceptData(){
        System.out.println("ENTER PLAYER ID");
        int id= sc.nextInt();
        System.out.println("ENTER PLAYER NAME");
        String name= sc.next();
        System.out.println("ENTER PLAYER TYPE");
        String pType= sc.next();
        System.out.println("ENTER RUNS");
        int runs= sc.nextInt();
        System.out.println("ENTER MATCH TYPE");
        String mType= sc.next();
        Player temp=new Player(id,name,pType,runs,mType);

        if(i<players.length){
            players[i]=temp;
            System.out.println("PLAYER INFORMATION ADDED");
            i++;
        }else {
            System.out.println("YOU CANT ADD MORE PLAYERS");
        }

    }

    static void displayPlayerInfo(){
        System.out.println("ID NAME PTYPE RUN MTYPE");
        for(int j=0;j< players.length;j++){
            if(players[j]!=null){
                System.out.print(players[j].getPlayerId()+" ");
                System.out.print(players[j].getPlayerName()+" ");
                System.out.print(players[j].getPlayerType()+" ");
                System.out.print(players[j].getPlayerRuns()+"   ");
                System.out.print(players[j].getMatchType()+" ");
                System.out.println();
            }else {
                break;
            }
        }
    }

    public static void minRuns(String ptype) {
            int min=Integer.MAX_VALUE;
            Player temp=null;
            for(int i=0;i< players.length;i++){
                if(players[i]!=null) {
                    if (players[i].getPlayerType().equalsIgnoreCase(ptype) && min > players[i].getPlayerRuns()) {
                        temp = players[i];
                    }
                }else {
                    break;
                }
            }
        System.out.println(temp.getPlayerId()+"\t"+temp.getPlayerName());
    }
}

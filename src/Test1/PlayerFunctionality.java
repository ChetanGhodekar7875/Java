package Test1;

import java.util.Arrays;
import java.util.Scanner;

public class PlayerFunctionality {
    Player[] players=new Player[1];

    {
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            int id = scanner.nextInt();
            String pName = scanner.next();
            int runs = scanner.nextInt();
            String pType = scanner.next();
            String mType = scanner.next();
            players[i]=new Player(id,pName,runs,pType,mType);
        }
        System.out.println(Arrays.toString(players));


//        players[0]=new Player(101,"SACHIN",30,"INTERNATIONAL","ONE DAY");
//        players[1]=new Player(102,"MSD",50,"NATIONAL","T20");
//        players[2]=new Player(103,"VIRAT",77,"INTERNATIONAL","ONE DAY");
//        players[3]=new Player(104,"ROHIT",35,"NATIONAL","T20");
//        players[4]=new Player(105,"KLRAHUL",34,"INTERNATIONAL","TEST");
    }


}

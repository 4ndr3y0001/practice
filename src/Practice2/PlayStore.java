package Practice2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PlayStore {
    static Random random=new Random();
    static Scanner read=new Scanner(System.in);
    static VideoGame[] videoGames=new VideoGame[4];

    static void main() {
        for (int i=0; i<videoGames.length; i++){
            System.out.println("Write the name of the videoGame");
            String name=read.nextLine();
            videoGames[i]=new VideoGame(name,random.nextInt(10));

        }

        Arrays.sort(videoGames);

        for (int i=0; i<2; i++){
            System.out.println("\n"+videoGames[i].toString());
        }
    }


}

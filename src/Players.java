import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by moggj_000 on 13/09/2016.
 */
public class Players {
    String Name;
    ArrayList<Cards> PlayerHand;
    Boolean inorOut;

    Players(String in_Name){
        this.Name = in_Name;
        this.PlayerHand = new ArrayList<Cards>();
        this.inorOut = true;
    }
    public String getPlayer(){
        String hand = "";

        for(Cards i : PlayerHand){
            hand += i+ " ";
        }
    return (this.Name + " " + hand + " " + this.inorOut);
    }
}


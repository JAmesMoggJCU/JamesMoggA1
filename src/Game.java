/**
 * Created by moggj_000 on 13/09/2016.
 */
import com.dd.plist.*;
import com.dd.plist.PropertyListParser;

import javax.xml.parsers.*;
import org.xml.sax.*;

import java.text.ParseException;
import java.io.*;
import java.util.*;

public class Game {
    public static void main(String[] args) throws ParserConfigurationException, ParseException, SAXException, PropertyListFormatException, IOException{
        Deck deckInstance = new Deck();
        ArrayList<Players> playersArray = new ArrayList<>();
        ArrayList<Card> centerCards = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        //System.out.println(deckInstance.deckArray.get(0).toString());
        //deckInstance.print();
    }
    static void Draw(){
        
        //Draw card from top of deck
        //remove drawn card from top of deck and add card to PlayerHand
    }
    static void PlayerHand(){
        //ArrayList<Players> PlayerHand = new ArrayList<>();
        //System.out.println(PlayerHand);
        //Display Players hand
    }
    static void placeCard(){
        //show card that has been played from player hand and remove from player hand
        //show what category and cards have been played
    }
    static void drawCard(){
        //if a player has skipped there turn then draw from top of deck
    }
}

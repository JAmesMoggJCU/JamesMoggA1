/**
 * Created by moggj_000 on 13/09/2016.
 */
import com.dd.plist.*;

import javax.xml.parsers.*;
import org.xml.sax.*;

import java.text.ParseException;
import java.io.*;
import java.util.*;

public class Game {
    static ArrayList<Card> centerCards;
    static Deck deckInstance;
    public static void main(String[] args) throws ParserConfigurationException, ParseException, SAXException, PropertyListFormatException, IOException {
        deckInstance = new Deck();
        ArrayList<Players> playersArray = new ArrayList<>();
        centerCards = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Integer playersArrayIndex = 0;
        //System.out.println(deckInstance.deckArray.get(0).toString());
        //deckInstance.print();
        do {
            System.out.println("Enter the number of players:   ");
            playersArrayIndex = input.nextInt();
        } while (playersArrayIndex > 5 || playersArrayIndex < 3);
        input.nextLine();
        for (int x = 0; x < playersArrayIndex; x = x + 1) {
            String playerName;
            System.out.println("Enter players name:   ");
            playerName = input.nextLine();
            Players nextPlayer = new Players(playerName);
            while (nextPlayer.PlayerHand.size() < 8) {
                nextPlayer.PlayerHand.add(deckInstance.deckArray.remove(0));
            }
            playersArray.add(nextPlayer);
            System.out.println(nextPlayer.getPlayer());
        }
        while (playersArray.size() > 1) {
            for (int i = 0; i < playersArray.size(); i++) {
                System.out.println("Enter an option for player: " + playersArray.get(i).Name + " \n play \n pass");
                String gameOption = input.nextLine();
                if (gameOption.equals("play")) {
                    placeCard(playersArray.get(i));
                    System.out.println(playersArray.get(i).getPlayer());
                } else if (gameOption.equals("pass")) {
                    drawCard(playersArray.get(i));
                    System.out.println(playersArray.get(i).getPlayer());
                } else CardsPile();
            }
        }
    }


    static void placeCard(Players playerPlace) {
        int cardHandIndex;
        Scanner input = new Scanner(System.in);
        System.out.println("type the number of the card you want to play:    ");
        cardHandIndex = input.nextInt();
        centerCards.add(playerPlace.PlayerHand.get(cardHandIndex));
        System.out.println(playerPlace.PlayerHand.remove(cardHandIndex) + " was removed from hand");
    }
    static void CardsPile(){
        System.out.println("<Center Card Pile \n " + centerCards.toString());
    }
    static void drawCard(Players playerPlace){
        playerPlace.PlayerHand.add(deckInstance.deckArray.get(0));
        deckInstance.deckArray.remove(0);
    }
}

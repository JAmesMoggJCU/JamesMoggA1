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
        //System.out.println(deckInstance.deckArray.get(0).toString()); //testing if everything prints with deck
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

    static String chooseType(String TypeHolder) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter the category to play: \n hardness \n specific gravity \n cleavage \n crustal abundance \n economic value   ");
            TypeHolder = input.nextLine();
        }
        while (!TypeHolder.equals("Hardness") && !TypeHolder.equals("Specific Gravity") && !TypeHolder.equals("Cleavage") && !TypeHolder.equals("CrustalAbundance") && !TypeHolder.equals("Economic value"));
    return TypeHolder;
    }
    public static int getHardness(String Hardness){
       int HardnessValue = 0;
       switch (Hardness){
           case "1":
               return 1;
           case "1 - 1.5":
               return 2;
           case "1.5 - 2.5":
               return 3;
           case "1 - 2":
               return 4;
           case "2":
               return 5;
           case "2.5":
               return 6;
           case "2 - 3":
               return 7;
           case "2.5 - 3":
               return 8;
           case "3":
               return 9;
           case "2.5 -3.5":
               return 10;
           case "3 - 3.5":
               return 11;
           case "3.5 - 4":
               return 12;
           case "4":
               return 13;
           case "3.5 - 4.5":
               return 14;
           case "4 - 4.5":
               return 15;
           case "5":
               return 16;
           case "5 - 5.5":
               return 17;
           case "5.5":
               return 18;
           case "5.5 - 6":
               return 19;
           case "5 - 6":
               return 20;
           case "6":
               return 21;
           case "5.5 - 6.5":
               return 22;
           case "6 - 6.5":
               return 23;
           case "6 - 7":
               return 24;
           case "6.5 - 7":
               return 25;
           case "5.5 - 7":
               return 26;
           case "7":
               return 27;
           case "7 - 7.5":
               return 28;
           case "6.5 - 7.5":
               return 29;
           case  "6 - 7.5":
               return 30;
           case "7.5":
               return 31;
           case "7.5 - 8":
               return 32;
           case "8":
               return 33;
           case "9":
               return 34;
           case "10":
               return 35;
       }
       return HardnessValue;
  }
   public static int getGravity(String Gravity){
       int GravityValue = 0;
       switch (Gravity){
           case "2.2":
               return 1;
           case "2.3":
               return 2;
           case "2.4":
               return 3;
           case "2.5 - 2.6":
               return 4;
           case "2.6":
               return 5;
           case "2.65":
               return 6;
           case "2.6 - 2.7":
               return 7;
           case "2.7":
               return 8;
           case "2.6 - 2.8":
               return 9;
           case "2.6 - 2.9":
               return 10;
           case "2.8 - 2.9":
               return 11;
           case "2.9":
               return 12;
           case "3.0":
               return 13;
           case "3.15":
               return 14;
           case "3.1 - 3.2":
               return 15;
           case "3.0 - 3.2":
               return 16;
           case "3.2":
               return 17;
           case "3.25":
               return 18;
           case "2.6 - 3.3":
               return 19;
           case "2.7 - 3.3":
               return 20;
           case "3.0 - 3.5":
               return 21;
           case "3.5":
               return 22;
           case "3.2 - 3.5":
               return 23;
           case "3.2 - 3.6":
               return 24;
           case "3.4 - 3.6":
               return 25;
           case "3.5 - 3.6":
               return 26;
           case "3.5 - 3.7":
               return 27;
           case "3.7 - 3.8":
               return 28;
           case "3.2 - 3.9":
               return 29;
           case "4.0":
               return 30;
           case "3.9 - 4.1":
               return 31;
           case "3.5 - 4.3":
               return 32;
           case "4.1 - 4.3":
               return 33;
           case "4.3":
               return 34;
           case "3.2 - 4.4":
               return 35;
           case "4.5":
               return 36;
           case "4.6":
               return 37;
           case "4.6 - 4.7":
               return 38;
           case "4.7":
               return 39;
           case "4.7 - 4.8":
               return 40;
           case "5.0":
               return 41;
           case "4.5 -5.1":
               return 42;
           case "5.2":
               return 43;
           case "5.0 - 5.3":
               return 44;
           case "5.3":
               return 45;
           case "6.9 - 7.1":
               return 46;
           case "7.5 - 7.6":
               return 47;
           case "19.3":
               return 48;
       }
       return GravityValue;
   }
    public static int getCleavage(String Cleavage){
        int CleavageValue = 0;
        switch (Cleavage){
         case "none":
                return 1;
            case "poor/none":
                return 2;
            case "1 poor":
                return 3;
            case "2 poor":
                return 4;
            case "1 good":
                return 5;
            case "1 good, 1 poor":
                return 6;
            case "2 good":
                return 7;
            case "3 good":
                return 8;
            case "1 perfect":
                return 9;
            case "1 perfect, 1 good":
                return 10;
            case "1 perfect, 2 good":
                return 11;
            case "2 perfect, 1 good":
                return 12;
            case "3 perfect":
                return 13;
            case "4 perfect":
                return 14;
            case "6 perfect":
                return 15;
        }
        return CleavageValue;
    }
    public static int getCrustalAbundance(String Crustal){
        int CrustalAbundanceValue = 0;
        switch (Crustal){
            case "ultratrace":
                   return 1;
            case "trace":
                return 2;
            case "low":
                return 3;
            case "moderate":
                return 4;
            case "high":
                return 5;
            case "very high":
                return 5;

        }
        return CrustalAbundanceValue;
    }
    public static int getEconomicValue(String Economic){
        int EconomicValueValue = 0;
        switch (Economic){
            case "trivial":
                return 1;
            case "low":
                return 2;
            case "moderate":
                return 3;
            case "high":
                return 4;
            case "very high":
                return 5;
            case "I'm rich!":
                return 6;
        }
        return EconomicValueValue;
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

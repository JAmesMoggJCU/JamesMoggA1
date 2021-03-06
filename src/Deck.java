/**
 * Created by moggj_000 on 12/09/2016.
 */
import com.dd.plist.*;
import com.dd.plist.PropertyListParser;

import javax.xml.parsers.*;

import org.xml.sax.*;

import java.text.ParseException;
import java.io.*;
import java.io.File;
import java.util.ArrayList;
public class Deck {
    public ArrayList<Card> deckArray = new ArrayList();

    Deck() throws ParserConfigurationException, ParseException, SAXException, PropertyListFormatException, IOException {

        try {
            Integer cardCounter = -1;
            Integer trumpCounter = 53;

            File file = new File("MstCards_151021.plist");
            NSDictionary rootDict = (NSDictionary) PropertyListParser.parse(file);
            NSArray cardsArray = (NSArray) rootDict.objectForKey("cards");


            while (cardCounter < 53) {
                cardCounter = cardCounter + 1;

                NSDictionary card0 = (NSDictionary) cardsArray.objectAtIndex(cardCounter); // index of the cards

                NSString value0 = (NSString) card0.objectForKey("title");
                NSString value1 = (NSString) card0.objectForKey("chemistry");
                NSString value2 = (NSString) card0.objectForKey("classification");
                NSString value3 = (NSString) card0.objectForKey("crystal_system");
                NSArray value4 = (NSArray) card0.objectForKey("occurrence");
                NSString value5 = (NSString) card0.objectForKey("hardness");
                NSString value6 = (NSString) card0.objectForKey("specific_gravity");
                NSString value7 = (NSString) card0.objectForKey("cleavage");
                NSString value8 = (NSString) card0.objectForKey("crustal_abundance");
                NSString value9 = (NSString) card0.objectForKey("economic_value");

                deckArray.add(new MineralCard(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9) {
                    @Override
                    String getEconomicvalue() {
                        return null;
                    }

                    @Override
                    String getDescription() {
                        return null;
                    }
                });

            }
            while (trumpCounter < 59) {
                trumpCounter = trumpCounter + 1;

                NSDictionary card1 = (NSDictionary) cardsArray.objectAtIndex(trumpCounter); // index of the cards

                NSString value0 = (NSString) card1.objectForKey("title");
                NSString value1 = (NSString) card1.objectForKey("subtitle");

                deckArray.add(new TrumpCard(value0, value1) {
                    @Override
                    String getChemistry() {
                        return null;
                    }

                    @Override
                    String getClassification() {
                        return null;
                    }

                    @Override
                    String getCrystal_system() {
                        return null;
                    }

                    @Override
                    NSArray getOccurrence() {
                        return null;
                    }

                    @Override
                    String getHardness() {
                        return null;
                    }

                    @Override
                    String getGravity() {
                        return null;
                    }

                    @Override
                    String getSpecific_gravity() {
                        return null;
                    }

                    @Override
                    String getCleavage() {
                        return null;
                    }

                    @Override
                    String getCrustalAbundance() {
                        return null;
                    }

                    @Override
                    String getEconomicvalue() {
                        return null;
                    }

                    @Override
                    String getCrustal_abundance() {
                        return null;
                    }

                    @Override
                    String getEconomic_value() {
                        return null;
                    }
                });

            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void print() {
        for (Card i : deckArray) {
            System.out.println(i.toString());
        }
    }
}
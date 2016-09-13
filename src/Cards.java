/**
 * Created by moggj_000 on 30/08/2016.
 */
import com.dd.plist.NSArray;
import com.dd.plist.NSString;

public class Cards {
    public static void main(String[] args) {

    }
}

class Card{
    NSString title;

    Card(NSString in_name) {
        this.title = in_name;
    }

    public String toString() {
        return ("This element is " + this.title);
    }

}

class MineralCard extends Card {
    NSString chemistry;
    NSString classification;
    NSString crystal_system;
    NSArray occurrence;
    NSString hardness;
    NSString specific_gravity; //might change to float
    NSString cleavage;
    NSString crustal_abundance;
    NSString economic_value;

    MineralCard(NSString in_name, NSString in_class1, NSString in_class2, NSString in_class3, NSArray in_class4, NSString in_class5, NSString in_class6, NSString in_class7, NSString in_class8, NSString in_class9) {
        super(in_name);
        this.chemistry = in_class1;
        this.classification = in_class2;
        this.crystal_system = in_class3;
        this.occurrence = in_class4;
        this.hardness = in_class5;
        this.specific_gravity = in_class6;
        this.cleavage = in_class7;
        this.crustal_abundance = in_class8;
        this.economic_value = in_class9;
    }

    @Override
    public String toString() {
        return ("This element is " + this.title + " its chemisty is " + this.chemistry + " its classification is " + this.classification + " its crystal system is " + this.crystal_system + " its occourence is " + this.occurrence + " its hardness is " + this.hardness + " its specific gravity is " + this.specific_gravity + " its cleavage is " + this.cleavage + " its cristal abundance is " + this.crustal_abundance + " its economic value is " + this.economic_value);
    }

}
class TrumpCard extends Card {
    NSString subtitle;

    TrumpCard(NSString in_name, NSString description) {
        super(in_name);
        this.subtitle = description;
    }

    @Override
    public String toString() {
        return ("This Trump Card is " + this.title + " its description is " + this.subtitle);
    }
}

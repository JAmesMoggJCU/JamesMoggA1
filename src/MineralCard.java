import com.dd.plist.NSArray;
import com.dd.plist.NSString;

/**
 * Created by moggj_000 on 13/09/2016.
 */
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
        return ("\n" +"Name " + this.title); //+ " its chemisty is " + this.chemistry + " its classification is " + this.classification + " its crystal system is " + this.crystal_system + " its occourence is " + this.occurrence + " its hardness is " + this.hardness + " its specific gravity is " + this.specific_gravity + " its cleavage is " + this.cleavage + " its cristal abundance is " + this.crustal_abundance + " its economic value is " + this.economic_value);
    }
}
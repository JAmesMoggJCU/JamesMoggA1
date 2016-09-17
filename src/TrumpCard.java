import com.dd.plist.NSString;

/**
 * Created by moggj_000 on 13/09/2016.
 */
class TrumpCard extends Card {
    NSString subtitle;

    TrumpCard(NSString in_name, NSString description) {
        super(in_name);
        this.subtitle = description;
    }

    @Override
    public String toString() {
        return ("This Trump Card is\n " + this.title + "\n its description is\n " + this.subtitle);
    }
}

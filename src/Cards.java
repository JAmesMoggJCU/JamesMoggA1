/**
 * Created by moggj_000 on 30/08/2016.
 */
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
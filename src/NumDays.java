/**
 * Created by Mariya on 28.11.2016.
 */
public enum NumDays {
    ONE, TWO, FIVE;
    public String toString() {
        String a = "";
        switch (this) {
            case ONE:
                a = "1 day";
                break;
            case TWO:
                a = "2 days";
                break;
            case FIVE:
                a = "5 days";
                break;

        }
        return a;
    }
}

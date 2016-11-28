/**
 * Created by Mariya on 28.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Please select one of these types of pass to create one:" +
                "with liftups for weekend: 1" +
                "daily for weekend: 2" +
                "with liftups for workingdays: 3" +
                "daily for workingdays: 4");
        Turnistile turn = new Turnistile();
        SkiPass a = turn.createPass("1");
        a.data();

    }
}

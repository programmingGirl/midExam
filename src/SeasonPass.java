/**
 * Created by Mariya on 28.11.2016.
 */
public class SeasonPass implements SkiPass {
    @Override
    public void data() {
        System.out.println("Thi is a pass for the whole season!");
    }

    @Override
    public void block() {
        System.out.println("This pass was blocked due to breaking a rule.");
    }

    @Override
    public void setDays(NumDays days) {

    }
}

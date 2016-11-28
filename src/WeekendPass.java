/**
 * Created by Mariya on 28.11.2016.
 */
public class WeekendPass implements SkiPass {
    public NumDays days;
    public NumLiftUp liftUp;
    @Override
    public void data() {

        System.out.println("This is a pass for weekends.");
        System.out.println("For: " + this.days);
        System.out.println("Number of liftups: " + this.liftUp);
    }

    @Override
    public void block() {
        System.out.println("This pass was blocked due to breaking a rule.");
    }

    @Override
    public void setDays(NumDays days) {

    }
}

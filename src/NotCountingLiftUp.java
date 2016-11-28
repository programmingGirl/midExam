/**
 * Created by Mariya on 28.11.2016.
 */
public class NotCountingLiftUp extends LiftUpDecorator {
    public NumDays days;
    public NotCountingLiftUp(SkiPass pass) {
        super(pass);
    }
    @Override
    public void data(){
        pass.data();
    }

    @Override
    public void block() {
    }


    @Override
    public void setDays(NumDays days) {
        this.days = days;
    }

    private void show(SkiPass pass){

        System.out.println("A pass without counting lift ups.");
    }


}

/**
 * Created by Mariya on 28.11.2016.
 */
public class CountingLiftUp extends LiftUpDecorator {
    public NumLiftUp liftUp;
    public CountingLiftUp(SkiPass pass) {
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

    }

    public void addLiftUp(SkiPass pass){
        System.out.println("Adding new LiftUps");
    }

    public void setLiftUp(NumLiftUp liftUp) {
        this.liftUp = liftUp;
    }
}

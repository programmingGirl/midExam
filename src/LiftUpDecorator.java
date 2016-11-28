/**
 * Created by Mariya on 28.11.2016.
 */
public abstract class LiftUpDecorator implements SkiPass {
    protected SkiPass pass;
    public LiftUpDecorator(SkiPass pass){
        this.pass = pass;
    }
    public void data(){
        pass.data();
    }

}

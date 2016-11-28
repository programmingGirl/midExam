/**
 * Created by Mariya on 28.11.2016.
 */
public class Turnistile {
    public SkiPass createPass(String type){

        SkiPass newPass1 = new CountingLiftUp(new WeekendPass());
        SkiPass newPass2 = new NotCountingLiftUp(new WeekendPass());
        SkiPass newPass3 = new CountingLiftUp(new WorkingDayPass());
        SkiPass newPass4 = new NotCountingLiftUp(new WorkingDayPass());

        newPass1.setDays(NumDays.ONE);
        if (type.equals("1")) {
            return newPass1;
        }
        else if (type.equals("2")){
            return newPass2;
        }
        else if (type.equals("3")){
            return newPass3;
        }
        else{
            return newPass4;
        }

    }

    public void block(SkiPass pass){
        pass.block();
    }
}

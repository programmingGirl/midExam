/**
 * Created by Mariya on 28.11.2016.
 */
public enum NumLiftUp {
    TEN, TWENTY, FIFTY, HUNDRED;

    public String toString(){
        String a = "";
        switch(this){
            case TEN: a = "10"; break;
            case TWENTY: a = "20"; break;
            case FIFTY: a = "50"; break;
            case HUNDRED: a = "100"; break;
        }
        return a;
    }

}

package SuperMarket;

import java.io.Serializable;

public class Cash implements Serializable {
    public Cash() {

    }

    public int nextInt() {
        return 0;
    }

    public Object nextLine() {
        return null;
    }

    public enum discount{
         products;
    }
    private Cash  cash;

    public Cash getCash() {
        return cash;
    }

    public void setCash(Cash cash) {
        this.cash = cash;
    }

    public Cash(Cash cash){
        this.cash=cash;

    }



}

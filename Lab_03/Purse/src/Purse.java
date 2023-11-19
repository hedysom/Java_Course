import java.util.ArrayList;
import java.util.List;

public class Purse {

    final static Coin dollar = new Coin("dollar", 1);
    final static Coin quarter = new Coin("quarter", 0.25);
    final static Coin dime = new Coin("dime", 0.1);
    final static Coin nickel = new Coin("nickerl", 0.05);
    final static Coin cent = new Coin("cent", 0.01);

    private final List<Coin> coins;

    public Purse() {
        coins = new ArrayList<>();
    }

    public void add(Coin coin) {
        coins.add(coin);
    }

    public boolean find(Coin coin) {
        for(Coin aCoin : coins) {
            if (aCoin.equals(coin))
                return true;
        }
        return false;
    }

    public int count(Coin coin) {
        int match = 0;
        for(Coin aCoin : coins){
            if(aCoin.equals(coin))
                match++;
        }
        return match;
    }

    public Coin getMinimum() {
        if (coins.isEmpty()) return null;

        Coin min = coins.get(0);
        for(int i=1; i<coins.size(); i++){
            if(min.getValue() > coins.get(i).getValue()){
                min = coins.get(i);
            }
        }
        return min;
    }

    public Coin getMaximum() {
        if (coins.isEmpty()) return null;

        Coin max = coins.get(0);
        for(int i=1; i<coins.size(); i++){
            if(max.getValue() < coins.get(i).getValue()){
                max = coins.get(i);
            }
        }
        return max;
    }

    public double getTotal() {
        double total = 0;
        for (Coin aCoin : coins) {
            total += aCoin.getValue();
        }
        return total;
    }

    public void remove(Coin coin) {
        coins.remove(coin);
    }

    public boolean hasCoin(Coin coin) {
        for(Coin aCoin : coins){
            if (aCoin.getValue() == coin.getValue())
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return ("Purse[Dollar = "+count(dollar)+
                ", Quarter = "+count(quarter)+
                ", Dime = "+count(dime)+
                ", Nickel = "+count(nickel)+
                ", Cent = "+count(cent)+
                "]");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Purse purse = (Purse)o;
        return (this.count(dollar) == purse.count(dollar) &&
                this.count(quarter) == purse.count(quarter) &&
                this.count(dime) == purse.count(dime) &&
                this.count(nickel) == purse.count(nickel) &&
                this.count(cent) == purse.count(cent));
    }
}
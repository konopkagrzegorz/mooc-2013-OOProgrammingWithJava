public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        Money newMoney = new Money((this.euros() + added.euros()), (this.cents() + added.cents()));
        if (newMoney.euros() < 0) {
            newMoney = new Money(0, 0);
        }
        return newMoney;
    }
    
    private int eurosToCents() {
        int convertedMoney = (this.euros() * 100) + this.cents();
        return convertedMoney;
    }
    
    public Money minus(Money decremented) {
        int firstMoney = eurosToCents();
        int comparedMoney = decremented.eurosToCents();
        if (firstMoney >= comparedMoney) {
        Money newMoney = new Money(0,firstMoney - comparedMoney);
        return newMoney;
        }
        else {
            Money newMoney = new Money (0,0);
            return newMoney;
        }
    }
    
    public boolean less(Money compared) {
        if (this.euros() > compared.euros()) {
            return false;
        } else if (this.euros() < compared.euros()) {
            return true;
        } else {
            if (this.cents() > compared.cents()) {
                return false;
            } else {
                return true;
            }
        }
    }
}

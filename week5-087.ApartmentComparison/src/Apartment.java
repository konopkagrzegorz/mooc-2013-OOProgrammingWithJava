public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {              //87.1
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment) {        //87.2
        int thisPrice = this.squareMeters*this.pricePerSquareMeter;
        int thatPrice = otherApartment.squareMeters*otherApartment.pricePerSquareMeter;

        if (thisPrice>=thatPrice) {
            return thisPrice-thatPrice;
        } else {
            return thatPrice-thisPrice;
        }
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {       //87.3
        int thisPrice = this.squareMeters*this.pricePerSquareMeter;
        int thatPrice = otherApartment.squareMeters*otherApartment.pricePerSquareMeter;

        if (thisPrice > thatPrice) {
            return true;
        }
            return false;

    }
}
package OOPS;

public class Mountinbike extends bike{

    public int seatHeight;

    public Mountinbike(int startHeight,
                       int startspeed,
                       int startgear) {

        super(startspeed,startgear);
        this.seatHeight= startHeight;
    }

    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }
}

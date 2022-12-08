package OOPS;

public class bike {

    protected  int gear;
    protected  int speed;

    public bike(int startgear,int startspeed) {
        this.gear = startgear;
        this.speed= startgear;

    }

    public void setGear(int newValue) {
        gear = newValue;
    }
    //unary operator
    public  void applyBrake(int decrement){
        speed -= decrement;
    }
    //unary operator
    public  void speedUp(int increment){
        speed += increment;
    }
}

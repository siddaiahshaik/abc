package OOPS;

public class Inheritence {
    public static void main(String[] args) {
        Mountinbike mountin = new Mountinbike(20,10,1);
        System.out.println("gear is " +mountin.gear);
        System.out.println("seatHeight is " +mountin.seatHeight);
        System.out.println("speed is "+mountin.speed);
        mountin.applyBrake(2);
        System.out.println("bike speed after applying brakes "+mountin.speed);
    }
}

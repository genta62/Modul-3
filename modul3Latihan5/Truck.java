package modul3Latihan5;

/**
 *
 * @author genta
 */
public class Truck {
    //The Tuck class has three fields
    public int cadence;
    public int gear;
    public int speed;
    
    //The Truck class has one constructor
    public Truck(int startCadence, int startSpeed,int startGear){
       gear=startGear;
       cadence=startCadence;
       speed=startSpeed;
    }
    //The Truck class has four method
    public void setCandence(int newValue){
        cadence=newValue;
    }
    public void setGear(int newValue){
        gear=newValue;
    }
    public void apllybrake(int decrement){
        speed=decrement;
    }
    public void speedup(int increment){
        speed=increment;
    }
}
